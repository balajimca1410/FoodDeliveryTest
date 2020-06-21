package com.altimetrik.ee.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.ee.demo.entity.ItemEntity;
import com.altimetrik.ee.demo.entity.RestaurantEntity;
import com.altimetrik.ee.demo.service.RestaurantService;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
    @Resource
    private RestaurantService restaurantService;

    @GetMapping("/")
    public Iterable<RestaurantEntity> findAll() {
        return restaurantService.findAll();
    }

    @GetMapping("/location/{location}")
    public List<RestaurantEntity> findByLocation(@PathVariable("location") final String location) {
        return restaurantService.findByLocation(location);
    }

    @GetMapping("/rating/{rating}")
    public List<RestaurantEntity> findByRating(@PathVariable("rating") final Float location) {
        return restaurantService.findByRating(location);
    }

    @GetMapping("/items/{id}")
    public List<ItemEntity> findByRating(@PathVariable("id") final Long id) {
        return restaurantService.findItemsByRestaurant(id);
    }
    
    @GetMapping("/{category}")
    public List<ItemEntity> findByCategory(@PathVariable("category") final String category) {
        return restaurantService.findByItemCategory(category);
    }
}
