package com.curso2.npspring5tutorial.mail;

import javax.mail.MessagingException;

public interface MailSender {

	void send(String to, String subject, String body) throws MessagingException;
	
}
