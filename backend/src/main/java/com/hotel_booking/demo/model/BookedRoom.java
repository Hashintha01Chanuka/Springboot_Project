package com.hotel_booking.demo.model;

import java.time.LocalDate;

public class BookedRoom {
        private Long bookingId;

        private LocalDate checkInDate;

        private LocalDate checkOutDate;
        
        private String guestFullName;

        private String guestEmail;

        private int NumOfAdults;

        private int NumOfChildren;

        private int totalNumOfGuest;

        private String bookingConfirmationCode;

        private Room room;

        public void calculateTotalNumberOfGuest(){
                this.totalNumOfGuest = this.NumOfAdults + NumOfChildren ;
        }

        public void setNumOfAdults(int numOfAdults) {
                NumOfAdults = numOfAdults;
                calculateTotalNumberOfGuest();
        }

        public void setNumOfChildren(int numOfChildren) {
                NumOfChildren = numOfChildren;
                calculateTotalNumberOfGuest();
        }

        public void setBookingConfirmationCode(String bookingConfirmationCode) {
                this.bookingConfirmationCode = bookingConfirmationCode;
        }
}
