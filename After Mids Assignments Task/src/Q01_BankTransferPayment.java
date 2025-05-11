public class Q01_BankTransferPayment extends Q01_Payment implements Q01_Refundable {

    public Q01_BankTransferPayment(double amount, String transactionId) {
        super(amount, transactionId);
    }

    @Override
    public void processPayment() {
        System.out.println("Bank Transfer payment processed.");
    }

    @Override
    public void cancelPayment() {
        System.out.println("Bank Transfer payment cancelled.");
    }

    @Override
    public void initiateRefund() {
        System.out.println("Bank Transfer refund requested. Processing time: 3-5 business days.");
    }

    @Override
    public boolean isRefundEligible() {
        System.out.println("Bank Transfer refund eligibility under review.");
        return false;
    }
}
// "Usman Amjad"
// "SP24-BCS-067"