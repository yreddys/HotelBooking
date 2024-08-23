package com.yarraneella.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yarraneella.entity.Booking;

import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    Optional<Booking> findByBookingConfirmationCode(String confirmationCode);
}
