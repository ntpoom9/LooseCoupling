package com.learn;
import com.learn.notification.channal.Sms;
import com.learn.notification.channal.Email;
import com.learn.notification.channal.interf.Notifiable;

public class Notification {
	
	public static void main (String[] args) {
			Notification notification = new Notification();
			Notifiable smsNotify = new Sms();
			Notifiable EmailNotify = new Email();
			
			notification.notifyCustomer(smsNotify);
			notification.notifyCustomer(EmailNotify);
		
		}
	public static void notifyCustomer(Notifiable notification) {
	notification.send();
}
	}
