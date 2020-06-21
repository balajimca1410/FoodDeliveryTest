package com.altimetrik.ee.demo.repository;


import org.springframework.data.repository.CrudRepository;

import com.altimetrik.ee.demo.entity.Reservation;

public interface ReservationRepository extends CrudRepository<Reservation,String> {

}
