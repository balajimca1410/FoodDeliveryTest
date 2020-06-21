package com.altimetrik.ee.demo.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.altimetrik.ee.demo.entity.ItemEntity;

public interface ItemRepository  extends PagingAndSortingRepository<ItemEntity, Integer> {
    List<ItemEntity> findByRestaurantEntity_id(Long restaurantId);
    
    List<ItemEntity> findByCategory(String category);
}
