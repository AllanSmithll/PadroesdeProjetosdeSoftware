package services;

import interfaces.MessageService;

/**
 * Classe contém a lógica para enviar uma mensagem de e-mail para o endereço de e-mail do destinatário.
 * @author alexs
 *
 */
public class SMSService implements MessageService {

	public void sendMessage(String message, String receiver){
		System.out.println("SMS sent to "+receiver+ " with Message="+message);
	}
}
