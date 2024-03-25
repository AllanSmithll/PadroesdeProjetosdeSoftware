package models;

import interfaces.MessageService;

/**
 * Classe contém a lógica para enviar uma mensagem de e-mail para o endereço de e-mail do destinatário.
 * @author alexs
 *
 */
public class SMSService implements MessageService {

	public void sendEmail(String message, String receiver){
		// Neste ponto teríamos a lógica (conjunto de instruções) para enviar um email
		System.out.println("SMS sent to "+receiver+ " with Message="+message);
	}
}
