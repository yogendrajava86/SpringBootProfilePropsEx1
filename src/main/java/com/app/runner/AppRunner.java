package com.app.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
@Component
public class AppRunner implements ApplicationRunner {

	@Value("${email.host}")
	private String emailHost;
	@Value("${email.port}")
	private String emailPort;
	@Value("${email.username}")
	private String emailUsername;
	@Value("${email.pwd}")
	private String emailPwd;
	@Value("${sms.provider}")
	private String smsProvider;
	@Value("${sms.apiedpoint}")
	private String smsApi;
	
	
	
	
	@Override
	public String toString() {
		return "AppRunner [emailHost=" + emailHost + ", emailPort=" + emailPort + ", emailUsername=" + emailUsername
				+ ", emailPwd=" + emailPwd + ", smsProvider=" + smsProvider + ", smsApi=" + smsApi + "]";
	}




	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this);
	}

}
