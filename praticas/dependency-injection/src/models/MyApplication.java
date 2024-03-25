package models;

import interfaces.Consumer;
import interfaces.MessageService;

/**
 * O código de cliente que usará a classe Application para enviar mensagens de e-mail será como abaixo.
 * @author alexs
 *
 */
public class MyApplication implements Consumer {
	private final MessageService messageService;

	public MyApplication(MessageService messageService) {
		this.messageService = messageService;
	}

	public void processMessages(String msg, String rec){
		this.messageService.sendMessage(msg, rec);
	}

}
