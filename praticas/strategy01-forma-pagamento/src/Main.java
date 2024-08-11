import model.Order;
import strategy.CreditCardStrategy;
import strategy.PayPalStrategy;
import strategy.PaymentMethodStrategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();

        System.out.print("Digite o valor total do pedido: R$");
        double orderValue = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("\nEscolha a forma de pagamento:");
        System.out.println("1. PayPal");
        System.out.println("2. Cartão de Crédito");
        System.out.print("Digite o número da opção desejada: ");
        int option = scanner.nextInt();
        order.setTotal(option);
        scanner.nextLine();
        PaymentMethodStrategy strategy = null;

        switch (option) {
            case 1:
                System.out.print("Digite o email do PayPal: ");
                String email = scanner.nextLine();
                System.out.print("Digite a senha do PayPal: ");
                String password = scanner.nextLine();
                strategy = new PayPalStrategy(email, password);
                break;
            case 2:
                System.out.print("Digite o número do cartão: ");
                String numberCard = scanner.nextLine();
                System.out.print("Digite a data de expiração (mm/aa): ");
                String expirationDate = scanner.nextLine();
                System.out.print("Digite o código de segurança: ");
                String securityCode = scanner.nextLine();
                strategy = new CreditCardStrategy(numberCard, expirationDate, securityCode);
                break;
            default:
                System.out.println("Método de pagamento inválido.");
                return;
        }
        order.checkout(strategy);
        scanner.close();
    }
}