package dev.java.MagicFridgeAI.mapper;

import dev.java.MagicFridgeAI.dto.FoodItemDTO;
import dev.java.MagicFridgeAI.model.FoodItem;

public class FoodItemMapper {
    public static FoodItem map(FoodItemDTO foodItemDTO){
        if(foodItemDTO == null) return null;

        FoodItem foodItem = new FoodItem();
        foodItem.setId(foodItemDTO.getId());
        foodItem.setName(foodItemDTO.getName());
        foodItem.setCategory(foodItemDTO.getCategory());
        foodItem.setQuantity(foodItemDTO.getQuantity());
        foodItem.setValidatedAt(foodItemDTO.getValidatedAt());
        foodItem.setCreatedAt(foodItemDTO.getCreatedAt());

        return foodItem;
    }

    public static FoodItemDTO map(FoodItem foodItem){
        if(foodItem == null) return null;

        FoodItemDTO foodItemDTO = new FoodItemDTO();
        foodItemDTO.setId(foodItem.getId());
        foodItemDTO.setName(foodItem.getName());
        foodItemDTO.setCategory(foodItem.getCategory());
        foodItemDTO.setQuantity(foodItem.getQuantity());
        foodItemDTO.setValidatedAt(foodItem.getValidatedAt());
        foodItemDTO.setCreatedAt(foodItem.getCreatedAt());

        return foodItemDTO;
    }
}
