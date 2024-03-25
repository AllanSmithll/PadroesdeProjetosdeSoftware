package models;

import interfaces.Consumer;
import interfaces.MessageService;

/**
 * O código de cliente que usará a classe Application para enviar mensagens de e-mail será como abaixo.
 * @author alexs
 *
 */
public class MyApplication implements Consumer {
	// classe está responsável por criar e inicializar o serviço de e-mail, para posteriormente utilizá-lo.
	// Isso leva à "dependência codificada"
	private MessageService messageService = new EmailService();


	public void processMessages(String msg, String rec){
		//aqui teríamos algumas mensagens de validação, manipulação da lógica, etc.
		this.messageService.sendEmail(msg, rec);
	}

}
