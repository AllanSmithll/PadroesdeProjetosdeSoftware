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
        PaymentMethodStrategy payment = null;

        if (option == 1) {
            payment = new PayPalStrategy();
        } else if (option == 2) {
            payment = new CreditCardStrategy();
        } else {
            System.out.println("Opção inválida.");
            System.exit(1);
        }
        payment.processOrder(orderValue);
    }
}