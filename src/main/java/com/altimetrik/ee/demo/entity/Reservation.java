package com.altimetrik.ee.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// Model class 

@Entity
@Table(name="reservation")
public class Reservation {
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Id
	private String id;
	
	@Column
	private LocalDateTime dt;

	
	@Column(name="user_id")
	private Long userId;
	
	@Column(name="restaurant_id")
	private Long restaurantId;
	
	public Long getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Long restaurantId) {
		this.restaurantId = restaurantId;
	}

	// Hibernate will convert camel case column names to snake case!!!
	// Don't use camelcase columns in DB
	@Column(name="party_size")
	private int partySize;
	
	
	
	public Reservation() {}
	
	public Reservation(String id,  Long userId, int partySize) {
		this.id = id;
	
		this.userId = userId;
		this.partySize = partySize;
	}
		


	public LocalDateTime getDt() {
		return dt;
	}

	public void setDt(LocalDateTime dt) {
		this.dt = dt;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public int getPartySize() {
		return partySize;
	}

	public void setPartySize(int partySize) {
		this.partySize = partySize;
	}

}
