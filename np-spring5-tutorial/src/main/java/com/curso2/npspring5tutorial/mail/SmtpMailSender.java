package com.curso2.npspring5tutorial.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class SmtpMailSender implements MailSender {

	private static Log Log = LogFactory.getLog(SmtpMailSender.class);
	
	@Override
	public void send(String to, String subject, String body) {
		// TODO Auto-generated method stub
		Log.info("Sending SMTP email to " + to);
		Log.info(" with subject " + subject);
		Log.info(" and body " + body);
	}

}
