
//Question 1:
//You have been hired as a junior software developer for an e-commerce company. Your first task is to develop a
//basic payment handling system that supports different payment types such as credit card, mobile wallet, and
//bank transfer. As part of your design, the system should also handle refunds for eligible payment types while
//ensuring a consistent structure for all payments.
//Your tasks:
//        1. Create an abstract class Payment that contains:
//o Properties: double amount, String transactionId
//o A constructor to initialize both properties.
//o A concrete method showTransaction() to display the transaction details.
//o Two abstract methods: processPayment() and cancelPayment().
//        2. Define an interface Refundable with:
//o void initiateRefund()
//o boolean isRefundEligible()
//3. Implement the following classes:
//o CreditCardPayment: Extends Payment and implements Refundable. Implements all required
//methods with simple print statements.
//o MobileWalletPayment: Extends Payment and implements the payment methods but does not
//support refunds.
//o BankTransferPayment: Implements Refundable and applies a different refund logic compared to
//CreditCardPayment.
//4. Create a Main class that:
//o Instantiates objects of CreditCardPayment and MobileWalletPayment.
//o Calls their methods to demonstrate abstraction and interface usage.
//o Uses a list/array of different payment types and processes each payment using a loop.
//o Shows how the interface Refundable keeps refund logic separate from regular payment
//        processing.
//
//        5. (Bonus) Add a new class CryptoPayment that extends Payment but does not implement Refundable,
//        and explain briefly how this reflects real-world payment behavior.
//
//Assessment Focus:
//         Ability to design and apply OOP concepts (abstraction, inheritance, interface).
//         Understanding of how to implement polymorphism through abstract classes and interfaces.
// Application of separation of concerns using interfaces.

public class Q01_Main {
    public static void main(String[] args) {

        Q01_Payment[] payments = {
                new Q01_CreditCardPayment(500.00, "TXN1001"),
                new Q01_MobileWalletPayment(200.00, "TXN1002"),
                new Q01_BankTransferPayment(1000.00, "TXN1003"),
                new Q01_CryptoPayment(1500.00, "TXN1004")
        };

        for (Q01_Payment payment : payments) {
            payment.processPayment();
            payment.cancelPayment();
            payment.showDetails();

            if (payment instanceof Q01_Refundable) {
                Q01_Refundable refundable = (Q01_Refundable) payment;
                refundable.initiateRefund();
                System.out.println("Eligible for refund: " + refundable.isRefundEligible());
            }

            System.out.println("------");
        }

       // "Usman Amjad"
       // "SP24-BCS-067"
    }
}