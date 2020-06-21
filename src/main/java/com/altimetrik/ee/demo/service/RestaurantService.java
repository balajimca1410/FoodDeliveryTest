package com.altimetrik.ee.demo.service;

import java.util.List;

import com.altimetrik.ee.demo.entity.ItemEntity;
import com.altimetrik.ee.demo.entity.RestaurantEntity;

public interface RestaurantService {
    Iterable<RestaurantEntity> findAll();

    List<RestaurantEntity> findByLocation(String location);

    List<RestaurantEntity> findByRating(Float rating);

    List<ItemEntity> findItemsByRestaurant(Long restaurantId);
    
    List<ItemEntity> findByItemCategory(String category);
}
