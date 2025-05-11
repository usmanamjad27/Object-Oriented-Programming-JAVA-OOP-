public abstract class Q02_RidePayment {
   private double fareAmount;
   private String bookingId;

    public Q02_RidePayment(double fareAmount, String bookingId) {
        this.fareAmount = fareAmount;
        this.bookingId = bookingId;
    }

    public void showDetails(){
        System.out.println("Booking ID : "+bookingId+"\nFare Amount : "+fareAmount+"$");
    }

    public abstract void processBooking();
    public abstract void cancelBooking();
}
// "Usman Amjad"
// "SP24-BCS-067"