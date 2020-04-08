package polymorphism.payment;

public class CreditPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("This is credit card payment");
    }
}
