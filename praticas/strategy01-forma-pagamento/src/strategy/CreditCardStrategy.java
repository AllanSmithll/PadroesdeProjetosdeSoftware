package strategy;

public class CreditCardStrategy implements PaymentMethodStrategy{
    private String cardNumber;
    private String expirationDate;
    private String securityCode;

    public CreditCardStrategy(String cardNumber, String expirationDate, String securityCode) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.securityCode = securityCode;
    }

    public boolean validateCredentials() {
        return cardNumber.equals("123456") && expirationDate.equals("12/34") && securityCode.equals("123");
    }

    @Override
    public void processPayment(double orderValue) {
        if (validateCredentials()) {
            System.out.println("Pagamento via Cartão de Crédito de R$" + orderValue + " realizado com sucesso.");
        } else {
            System.out.println("Falha na validação do cartão de crédito.");
        }
    }
}
