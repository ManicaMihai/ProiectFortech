package org.fortech.PokerPlanning;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class CountdownTimer {
	private String message;
	
	public CountdownTimer() {
		message = "This is the first message";
	}
	
	
	
	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public void onTimeout(){
		message = "This is the second message";
	}
}