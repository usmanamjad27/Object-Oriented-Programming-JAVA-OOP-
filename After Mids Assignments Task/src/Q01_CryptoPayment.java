public class Q01_CryptoPayment extends Q01_Payment {

    public Q01_CryptoPayment(double amount, String transactionId) {
        super(amount, transactionId);
    }

    @Override
    public void processPayment() {
        System.out.println("Crypto payment processed.");
    }

    @Override
    public void cancelPayment() {
        System.out.println("Crypto payments cannot be cancelled once confirmed.");
    }
}


// "Usman Amjad"
// "SP24-BCS-067"