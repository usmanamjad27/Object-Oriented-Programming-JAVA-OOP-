public class Q02_AutoBooking extends Q02_RidePayment implements Q02_RefundableRide{
    public Q02_AutoBooking(double fareAmount, String bookingId) {
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

    @Override
    public void initiateRefund() {
        System.out.println("Bank Transfer refund requested. Processing time: 3-5 business days.");
    }

    @Override
    public boolean isRefundEligible() {
        System.out.println("Refund process is under consider");
        return false;
    }
}
// "Usman Amjad"
// "SP24-BCS-067"