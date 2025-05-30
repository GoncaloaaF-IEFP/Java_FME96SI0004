package pt.iefp.jpa.service;

import pt.iefp.jpa.model.Food;
import pt.iefp.jpa.dtos.FoodDTO;

import java.util.List;

public interface FoodService {

    //CRU

    public List<FoodDTO> findAllFoods();
    public FoodDTO findFoodById(Long id);
    public Food saveFood(Food food);
    public FoodDTO updateFood(FoodDTO foodDto);

}
