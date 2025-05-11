public class Q01_CreditCardPayment extends Q01_Payment implements Q01_Refundable {

    public Q01_CreditCardPayment(double amount, String transactionID) {
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
    @Override
    public void initiateRefund() {
        System.out.println("Initiated funds is 10000$");
    }

    @Override
    public boolean isRefundEligible() {
        System.out.println("Refund is eligible in case you cancel payment ");
        return true;
    }


}
// "Usman Amjad"
// "SP24-BCS-067"