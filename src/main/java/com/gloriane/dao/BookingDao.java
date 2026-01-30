package com.gloriane.dao;

import com.gloriane.model.Booking;
import com.mysql.cj.x.protobuf.MysqlxCrud;

import java.util.List;

public interface BookingDao {
    Booking save (Booking booking);
    List<Booking> findAll();
    List<Booking> findById();
    List<Booking> findUpcoming();
    List<Booking> findByClassroom();
    List<Booking> findUpcomingByClassroom();
    List<Booking> findByCustomer();
    List<Booking> findByDate();
    boolean isClassroomAvailable();
    List<Booking> findConflictingBookings();
    Booking update (Booking booking);
    Booking delete (Booking booking);


}
