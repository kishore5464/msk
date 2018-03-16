package com.msk.automobiles.util;

import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Configuration
@PropertySource("classpath:/application_path.properties")
@Service
public class MailSenderService {

	@Autowired
	Environment environment;

	@Autowired
	JavaMailSender mailSender;

	@Autowired
	VelocityEngine velocityEngine;

//	private final String fromEmailAddress = "fbtkishore@gmail.com";

}