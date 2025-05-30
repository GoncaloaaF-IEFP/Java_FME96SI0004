package pt.iefp.jpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pt.iefp.jpa.dtos.FoodDTO;
import pt.iefp.jpa.model.Food;
import pt.iefp.jpa.repo.FoodRepo;
import pt.iefp.jpa.service.FoodService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FoodSericeImpl implements FoodService {

    FoodRepo foodRepo;

    @Autowired
    public FoodSericeImpl(FoodRepo foodRepo) {
        this.foodRepo = foodRepo;
    }


    @Override
    public List<FoodDTO> findAllFoods() {

        List<Food> foods = foodRepo.findAll();

        return foods.stream().map(this::foodToFoodDto).collect(Collectors.toList());
    }

    private FoodDTO foodToFoodDto(Food food) {

        FoodDTO foodDTO =  FoodDTO.builder()
                .id(food.getId())
                .name(food.getName())
                .imageURL(food.getImageURL())
                .price(food.getPrice())
                .createTime(food.getCreateTime())
                .updateTime(food.getUpdateTime())
                .build();

        return foodDTO;
    }

    private Food foodDtoToFood(FoodDTO foodDto) {
        Food food = Food.builder()
                .id(foodDto.getId())
                .name(foodDto.getName())
                .imageURL(foodDto.getImageURL())
                .price(foodDto.getPrice())
                .createTime(foodDto.getCreateTime())
                .updateTime(foodDto.getUpdateTime())
                .build();

        return food;
    }


    @Override
    public Food saveFood(Food food) {

        if(food.getName().isEmpty()){
            return  null;
        }
        return  foodRepo.save(food);
    }

    @Override
    public FoodDTO findFoodById(Long id) {
        Food food = foodRepo.findById(id).orElse(null);

        if(food == null){
            return null;
        }
        return foodToFoodDto(food);
    }

    @Override
    public FoodDTO updateFood(FoodDTO foodDto) {
       Food food = foodDtoToFood(foodDto);

       return foodToFoodDto(this.saveFood(food));

    }
}
