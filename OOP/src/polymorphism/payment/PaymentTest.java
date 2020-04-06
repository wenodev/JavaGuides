package polymorphism.payment;

import polymorphism.payment.CashPayment;
import polymorphism.payment.CreditPayment;
import polymorphism.payment.Payment;

public class PaymentTest {
    public static void main(String[] args) {
        Payment cash1 = new CashPayment();
        cash1.pay();

        CashPayment cash2 = new CashPayment();
        cash2.pay();

        Payment credit1 = new CreditPayment();
        credit1.pay();

        CreditPayment credit2 = new CreditPayment();
        credit2.pay();

    }
}
