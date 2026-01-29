package com.gloriane.util;

import com.gloriane.model.Booking;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Utility helper for Booking-related operations.
 * Contains shared logic extracted from the Booking entity so it can be reused or tested separately.
 */
public final class BookingHelper {

    // Prevent instantiation
    private BookingHelper() {}
    /**
     * Checks if this booking overlaps with another time period
     * Two bookings overlap if they're on the same day and their times cross.
     * Example: Booking 1 is 9:00-11:00, Booking 2 is 10:00-12:00
     * These overlap because 10:00-11:00 is shared time.
     *  The date to check
     *  The start time to check
     *  The end time to check
     *  true if there's a time conflict, false otherwise
     */
    public static boolean overlapsWith(Booking booking, LocalDate date, LocalTime start, LocalTime end) {
        if (booking == null || booking.getBookingDate() == null
                || booking.getStartTime() == null || booking.getEndTime() == null
                || date == null || start == null || end == null) {
            return false;
        }

        // Different days => no overlap
        if (!booking.getBookingDate().equals(date)) {
            return false;
        }

        // Overlap if (our start < their end) AND (our end > their start)
        return booking.getStartTime().isBefore(end) && booking.getEndTime().isAfter(start);
    }

    public static boolean isUpcoming(Booking booking) {
        if (booking == null || booking.getBookingDate() == null || booking.getStartTime() == null) return false;
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();

        return booking.getBookingDate().isAfter(today)
                || (booking.getBookingDate().equals(today) && booking.getStartTime().isAfter(now));
    }

    // Validate a booking. Returns null when valid, or an error message when invalid.
    public static String validate(Booking booking) {
        if (booking == null) return "Booking is null";
        if (booking.getBookingDate() == null || booking.getStartTime() == null || booking.getEndTime() == null) {
            return "Booking must have a date, start time and end time";
        }

        if (booking.getStartTime().isAfter(booking.getEndTime()) || booking.getStartTime().equals(booking.getEndTime())) {
            return "Start time must be before end time";
        }

        LocalDate today = LocalDate.now();
        if (booking.getBookingDate().isBefore(today)) {
            return "Cannot book a date in the past";
        }

        if (booking.getBookingDate().equals(today) && booking.getStartTime().isBefore(LocalTime.now())) {
            return "Cannot book a time that has already passed";
        }

        return null;
    }
}
