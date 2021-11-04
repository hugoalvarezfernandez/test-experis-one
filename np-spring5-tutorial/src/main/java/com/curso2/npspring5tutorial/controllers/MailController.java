package com.curso2.npspring5tutorial.controllers;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso2.npspring5tutorial.mail.MailSender;
import com.curso2.npspring5tutorial.mail.MockMailSender;

@RestController
public class MailController {

	private MailSender mailSender;

	public MailController(MailSender smtp) {
		this.mailSender = smtp;
	}

	@RequestMapping("/mail")
	public String mail() throws MessagingException {

		mailSender.send("mail@test.com", "Test", "This is a test mail.");
		return "Mail sent";
	}

}
