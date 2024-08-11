package strategy;

public interface PaymentMethodStrategy {
    void processPayment(double orderValue);
    boolean validateCredentials();
}
