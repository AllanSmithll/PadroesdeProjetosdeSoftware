package model;

import strategy.PaymentMethodStrategy;

public class Order {
    private double total;

    public Order() {}

    public double getTotal() {return total;}

    public void setTotal(double total) {this.total = total;}

    public void checkout(PaymentMethodStrategy strategy) {
        strategy.processPayment(total);
    }
}
