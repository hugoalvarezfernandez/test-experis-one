package com.curso2.npspring5tutorial.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso2.npspring5tutorial.mail.MailSender;
import com.curso2.npspring5tutorial.mail.MockMailSender;

@RestController
public class MailController {

	private MailSender mailSender = new MockMailSender();
	
	@RequestMapping("/mail")
	public String mail() {
		
		mailSender.send("mail@test.com", "Test", "This is a test mail.");
		return null;
		
		
	}
	
}
