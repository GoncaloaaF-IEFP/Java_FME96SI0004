package pt.iefp.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pt.iefp.jpa.dtos.FoodDTO;
import pt.iefp.jpa.model.Food;
import pt.iefp.jpa.service.FoodService;

import java.util.List;


@Controller
public class FoodController {

    FoodService foodService;

    @Autowired
    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }


    @GetMapping("/")
    public String index(Model model) {

        model.addAttribute("info", "Home Page");

        return "home";
    }

    @GetMapping("/menu")
    public String menu(Model model){

        List<FoodDTO> allFoods = this.foodService.findAllFoods();

        model.addAttribute("foods", allFoods);

        return "menu";
    }

    @GetMapping("/add")
    public String addToMenu(Model model) {
        Food food = new Food();

        model.addAttribute("food", food);
        return "addtomenu";
    }

    @PostMapping("/add")
    public String addToMenu(@ModelAttribute("food") Food food) {

        Food f =  foodService.saveFood(food);

        if (f == null) {
            return "redirect:/add";
        }
        return "redirect:/menu";

    }







    @GetMapping("/food/{foodId}")
    public String showFood(Model model, @PathVariable long foodId) {
        FoodDTO food = this.foodService.findFoodById(foodId);
        model.addAttribute("food", food);

        return "showfood";
    }

    @GetMapping("/food/{foodId}/edit")
    public String editFoodView(Model model, @PathVariable("foodId") Long foodId){

        FoodDTO food = this.foodService.findFoodById(foodId);
        model.addAttribute("food", food);

        return "editFood";
    }


    @PostMapping("/food/{foodId}/edit")
    public String editFoodView(Model model,
                               @PathVariable("foodId") Long foodId,
                               @ModelAttribute("food") FoodDTO food){

        food.setId(foodId);
        foodService.updateFood(food);

        return "redirect:/menu";


    }



}
