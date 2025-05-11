public class Q01_MobileWalletPayment extends Q01_Payment {

    public Q01_MobileWalletPayment(double amount, String transactionID) {
        super(amount, transactionID);
    }

    @Override
    public void processPayment() {
        System.out.println("Payment Proceed");
    }

    @Override
    public void cancelPayment() {
        System.out.println("Payment Cancelled");
    }

}
// "Usman Amjad"
// "SP24-BCS-067"