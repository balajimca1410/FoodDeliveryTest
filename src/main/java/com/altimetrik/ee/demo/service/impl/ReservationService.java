package com.altimetrik.ee.demo.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altimetrik.ee.demo.entity.Reservation;
import com.altimetrik.ee.demo.repository.ReservationRepository;

@Service	
public class ReservationService {

	@Autowired
	private ReservationRepository reservationRepository;
	
	// Retrieve all rows from table and populate list with objects
	public List getAllReservations() {
		
		List reservations = new ArrayList<>();
		reservationRepository.findAll().forEach(reservations::add);
		
		return reservations;
	}
	
	// Retrieves one row from table based on given id
	public Optional<Reservation> getReservation(String id) {
		
		return reservationRepository.findById(id);
	
	}
	
	// Inserts row into table 
	public void addReservation(Reservation reservation) {
		reservationRepository.save(reservation);
	}
	
	// Updates row in table
	public void updateReservation(String id, Reservation reservation) {
		reservationRepository.save(reservation);
	}
	
	// Removes row from table
	public void deleteReservation(String id) {
		reservationRepository.deleteById(id);
	}
}