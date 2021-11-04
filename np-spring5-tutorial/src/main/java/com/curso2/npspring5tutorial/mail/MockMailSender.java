package com.curso2.npspring5tutorial.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

//@Component("mock")
public class MockMailSender implements MailSender {

	private static Log Log = LogFactory.getLog(MockMailSender.class);
	
	@Override
	public void send(String to, String subject, String body) {
		// TODO Auto-generated method stub
		Log.info("Sending MOCK email to " + to);
		Log.info(" with subject " + subject);
		Log.info(" and body " + body);
	}

}
