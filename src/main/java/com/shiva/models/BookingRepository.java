package com.shiva.models;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface BookingRepository extends CrudRepository<Booking,Long> {

	public Booking findByDeparture(String departure);

}
