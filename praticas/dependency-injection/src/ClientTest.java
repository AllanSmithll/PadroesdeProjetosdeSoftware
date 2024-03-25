import injectors.EmailServiceInjector;
import interfaces.MessageServiceInjector;
import injectors.SMSServiceInjector;
import interfaces.Consumer;

public class ClientTest {
	public static void main(String[] args) {
		String mensagem = "Ola Alex! Mostra um exemplo de DI.";
		String email = "alex@ifpb.edu.br";
		String telefone = "83988889999";
		MessageServiceInjector injector = null;
		Consumer app;

		injector = new EmailServiceInjector();
		app = injector.getConsumer();
		app.processMessages(mensagem, email);
		injector = new SMSServiceInjector();
		app = injector.getConsumer();
		app.processMessages(mensagem, telefone);
	}
}
