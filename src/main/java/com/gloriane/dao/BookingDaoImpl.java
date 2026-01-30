package com.gloriane.dao;

import com.gloriane.model.Booking;

import java.util.List;

public class BookingDaoImpl implements BookingDao {
    @Override
    public Booking save(Booking booking) {
        return null;
    }

    @Override
    public List<Booking> findAll() {
        return List.of();
    }

    @Override
    public List<Booking> findById() {
        return List.of();
    }

    @Override
    public List<Booking> findUpcoming() {
        return List.of();
    }

    @Override
    public List<Booking> findByClassroom() {
        return List.of();
    }

    @Override
    public List<Booking> findUpcomingByClassroom() {
        return List.of();
    }

    @Override
    public List<Booking> findByCustomer() {
        return List.of();
    }

    @Override
    public List<Booking> findByDate() {
        return List.of();
    }

    @Override
    public boolean isClassroomAvailable() {
        return false;
    }

    @Override
    public List<Booking> findConflictingBookings() {
        return List.of();
    }

    @Override
    public Booking update(Booking booking) {
        return null;
    }

    @Override
    public Booking delete(Booking booking) {
        return null;
    }
}

