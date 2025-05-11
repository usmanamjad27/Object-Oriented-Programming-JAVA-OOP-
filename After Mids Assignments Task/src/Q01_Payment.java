public abstract class Q01_Payment {
    private double amount;
    private String transactionID;

    public Q01_Payment(double amount, String transactionID) {
        this.amount = amount;
        this.transactionID = transactionID;
    }

    public void showDetails(){
        System.out.println("Transaction ID : "+transactionID+"\nTransaction Amount : "+amount+"$");
    }

    // Abstract method

    public abstract void processPayment();
    public abstract void cancelPayment();

}
// "Usman Amjad"
// "SP24-BCS-067"