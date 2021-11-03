package com.curso2.npspring5tutorial.mail;

public interface MailSender {

	void send(String to, String subject, String body);
	
}
