package com.altimetrik.ee.demo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.altimetrik.ee.demo.entity.ItemEntity;
import com.altimetrik.ee.demo.entity.RestaurantEntity;
import com.altimetrik.ee.demo.repository.ItemRepository;
import com.altimetrik.ee.demo.repository.RestaurantRepository;
import com.altimetrik.ee.demo.service.RestaurantService;

@Service
@Transactional
public class RestaurantServiceImpl implements RestaurantService {
    @Resource
    private RestaurantRepository restaurantRepository;

    @Resource
    private ItemRepository itemRepository;

    @Override
    public Iterable<RestaurantEntity> findAll() {
        return restaurantRepository.findAll();
    }

    @Override
    public List<RestaurantEntity> findByLocation(String location) {
        return restaurantRepository.findByLocation(location);
    }

    @Override
    public List<RestaurantEntity> findByRating(Float rating) {
        return restaurantRepository.findByRating(rating);
    }

    @Override
    public List<ItemEntity> findItemsByRestaurant(Long restaurantId) {
        return itemRepository.findByRestaurantEntity_id(restaurantId);
    }

	@Override
	public List<ItemEntity> findByItemCategory(String category) {
		 return itemRepository.findByCategory(category);
	}
}
