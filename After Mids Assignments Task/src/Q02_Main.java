//
//Question 2:
//You have joined a transportation company that manages different types of ride bookings such as Taxi,
//Bike, and Auto. The company wants a system that can process different ride payments and handle refunds
//for eligible services (e.g., Taxi and Auto). Your task is to design this booking system using object-oriented
//programming principles.
//
//Your tasks:
//        1. Design an abstract class RidePayment with:
//o Properties: double fareAmount, String bookingId
//o A constructor to initialize the properties.
//o A concrete method showBookingDetails() that prints fare amount and booking ID.
//o Abstract methods: processBooking() and cancelBooking()
//        2. Create an interface RefundableRide with:
//o void initiateRefund()
//o boolean isRefundEligible()
//3. Implement the following ride classes:
//o TaxiBooking: Extends RidePayment and implements RefundableRide. Implements all necessary
//methods.
//o BikeBooking: Extends RidePayment but does not support refunds.
//o AutoBooking: Extends RidePayment and implements RefundableRide with a different refund
//logic than Taxi.
//4. In the Main class:
//o Create objects for TaxiBooking, BikeBooking, and AutoBooking.
//o Demonstrate inheritance, abstraction, and the use of the RefundableRide interface.
//o Store these objects in an array or list and process each ride in a loop.
//o Show how refund-related functionality is separated from booking logic using the interface.
//        5. (Bonus) Add a new class CarpoolBooking that extends RidePayment but does not support cancellation
//        or refund. Show how this differs in behavior.

public class Q02_Main {
    public static void main(String[] args) {
        Q02_RidePayment [] Booking = {
                new Q02_TaxiBooking(45,"BI-100012"),
                new Q02_BikeBooking(25,"BI-100012"),
                new Q02_AutoBooking(67,"BI-100102"),
        };

        for(Q02_RidePayment booking : Booking){
            booking.showDetails();
            booking.processBooking();
            booking.cancelBooking();

            if (booking instanceof Q02_RefundableRide) {
                Q02_RefundableRide refundable = (Q02_RefundableRide) booking;
                refundable.initiateRefund();
                System.out.println("Refund Eligible: " + refundable.isRefundEligible());
            }
        }


        System.out.println("-------------------------\n");


        // "Usman Amjad"
        // "SP24-BCS-067"

    }

}

