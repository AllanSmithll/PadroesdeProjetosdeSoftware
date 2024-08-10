package strategy;

import java.util.Scanner;

public class PayPalStrategy implements PaymentMethodStrategy{

    @Override
    public void processOrder(double orderValue) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite seu email: ");
        scanner.nextLine();
        System.out.println("Por favor, digite sua senha: ");
        scanner.nextLine();
        scanner.nextLine();
        scanner.close();
        System.out.println("Seu pagamento foi processado com sucesso!");
    }
}
