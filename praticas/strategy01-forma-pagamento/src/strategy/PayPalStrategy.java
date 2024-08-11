package strategy;

import java.util.Scanner;

public class PayPalStrategy implements PaymentMethodStrategy{
    private String email;
    private String password;

    public PayPalStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public boolean validateCredentials() {
        return email.equals("usuario@email.com") && password.equals("senha123");
    }

    @Override
    public void processPayment(double orderValue) {
        if (validateCredentials()) {
            System.out.println("Pagamento via PayPal de R$" + orderValue + " realizado com sucesso.");
        } else {
            System.out.println("Falha na autenticação do PayPal.");
        }
    }
}
