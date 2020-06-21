package com.altimetrik.ee.demo.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.altimetrik.ee.demo.entity.RestaurantEntity;

public interface RestaurantRepository  extends PagingAndSortingRepository<RestaurantEntity, Integer> {
    List<RestaurantEntity> findByLocation(String location);

    List<RestaurantEntity> findByRating(Float rating);
}
