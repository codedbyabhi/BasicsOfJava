package com.nit.hashSetPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class OnlineExaminationRegistrationAnalysis {
	 public static void main(String[] args) {

	        RegistrationManager rm = new RegistrationManager();

	        Scanner sc = new Scanner(System.in);

	        acceptRegistrationDetails(rm, sc);	

	        displayRegistrationReport(rm);

	        System.out.println("Enter search Id : ");
	        int searchId = sc.nextInt();

	        if (rm.searchRegistration(searchId)) {
	            System.out.println("Registration Id " + searchId + " is registered");
	        }
	        else {
	            System.out.println("Registration Id " + searchId + " is Not registered");
	        }

	    }

	    public static void acceptRegistrationDetails(RegistrationManager rm, Scanner sc) {

	        System.out.println("Enter number of Registrations : ");
	        int n = sc.nextInt();

	        System.out.println("Enter Registration ID's : ");

	        for (int i = 1; i <= n; i++) {
	            rm.addRegisdtration(sc.nextInt());
	        }
	    }

	    public static void displayRegistrationReport(RegistrationManager rm) {

	        System.out.println("Total registration attempts : " + rm.registrationAttempt.size());

	        System.out.println("Total Unique registrations : " + rm.uniqueRegistrations.size());

	        System.out.println("Duplicate registration attempts : " + rm.countDuplicateAttemps());

	        System.out.println();

	        rm.displayUniqueRegistration();

	        System.out.println("Maximum Registration frequency : " + rm.getMaximumFrequency());

	        System.out.println("Most frequency Registred IDs : ");

	        rm.displayMostFrequentRegidstrations();
	    }

}
class RegistrationManager {
	public Vector<Integer> registrationAttempt = new Vector<Integer>();
	public HashSet<Integer> uniqueRegistrations = new HashSet<Integer>();

	public void addRegisdtration(int registrationId) {

		registrationAttempt.add(registrationId);
		uniqueRegistrations.add(registrationId);
	}

	public int countDuplicateAttemps() {

		return registrationAttempt.size() - uniqueRegistrations.size();
	}

	public int getUniqueRegistrationCount() {

		return uniqueRegistrations.size();
	}

	public void displayUniqueRegistration() {

		for (Integer id : uniqueRegistrations) {

			System.out.println(id);
		}
	}

	public int getMaximumFrequency() {

		int maxCount = 0;
		for (int i = 0; i <= registrationAttempt.size() - 1; i++) {

			int count = 0;
			for (int j = 0; j <= registrationAttempt.size() - 1; j++) {
				if (registrationAttempt.get(i) == registrationAttempt.get(j)) {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;

			}
		}
		return maxCount;

	}

	public void displayMostFrequentRegidstrations() {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i <= registrationAttempt.size() - 1; i++) {

			map.put(registrationAttempt.get(i), map.getOrDefault(registrationAttempt.get(i), 0) + 1);
		}
		int maxFrequency = getMaximumFrequency();

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

			if (entry.getValue() == maxFrequency) {
				
				System.out.println(entry);
			}
		}

	}
	public boolean searchRegistration(int id) {
		
		return uniqueRegistrations.contains(id);
	}

}
