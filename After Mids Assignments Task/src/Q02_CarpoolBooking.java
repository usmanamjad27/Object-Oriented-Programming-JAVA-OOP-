public class Q02_CarpoolBooking extends Q02_RidePayment {

    public Q02_CarpoolBooking(double fareAmount, String bookingId) {
        super(fareAmount, bookingId);
    }

    @Override
    public void processBooking() {
        System.out.println("Booking Proceed");
    }

    @Override
    public void cancelBooking() {
        System.out.println("Booking Cancelled");

    }
}
// "Usman Amjad"
// "SP24-BCS-067"