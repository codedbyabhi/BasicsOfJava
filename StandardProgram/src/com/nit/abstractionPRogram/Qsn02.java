package com.nit.abstractionPRogram;

import java.util.Scanner;

import com.nit.abstractionPRogram.MessageFactory.MessageService;

public class Qsn02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Message...");
		String msg = sc.nextLine();

		MessageService ms = MessageFactory.getImplementationObject(choice);
		NotificationService ns = new NotificationService();
		ns.notifyUser(ms, msg);
	}
}

/*
 * System 1:- you have notificationService class which depends on interface, not
 * on implementation classes.
 */
/*
 * Where is the abstraction ? what are we hiding from this
 * system-1(NotificationService)? Answer :- System 1 knows only interface and
 * its methods. here implementation of there abstract method are hidden from
 * this system 1.
 */
class NotificationService {
	public void notifyUser(MessageService service, String message) {
		if (service.sendMessage(message)) {
			System.out.println("Notification sen successfully");
		} else {
			System.out.println("Notification failed");
		}
	}
}

/*
 * Factody class is a class which contains factory method. what is factory
 * method? it is a static method which creates and returns the object of
 * implementation classes of an interface.
 */
class MessageFactory {
	public static MessageService getImplementationObject(int choice) {
		MessageService obj = null;
		switch (choice) {

		case 1 -> {
			obj = new EmailService();
		}
		case 2 -> {
			obj = new SMSService();
		}
		case 3 -> {
			obj = new WhatsappService();
		}
		}
		return obj;
	}

	/*
	 * System 2:- It defines the design with an interface and its implementation
	 * classes
	 */
//interface
	interface MessageService {
		boolean sendMessage(String message);
	}

//implementation class 1
	class EmailService implements MessageService {

		public boolean sendMessage(String message) { // In interface all methods are public.
			System.out.println("Sends message via Email");
			return true;

		}
	}

//implementation class 2
	class SMSService implements MessageService {

		public boolean sendMessage(String message) { // In interface all methods are public.
			System.out.println("Sends message via SMS");
			return true;

		}
	}

//implementation class 3
class WhatsappService implements MessageService {

	public boolean sendMessage(String message) { // In interface all methods are public.
		System.out.println("Sends message via Whatsapp	");
		return true;

	}
 }

}
