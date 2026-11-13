package com.nit.treeMapPrograms;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class EmployeePerformanceRankingSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PerformanceManager pm = new PerformanceManager();
		System.out.println("Enter Number of Employees : ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter ID, Name, Dept and Performance Score : " + i);

			int Id = sc.nextInt();
			sc.nextLine();
			String Name = sc.nextLine();
			String Dept = sc.nextLine();
			double Score = sc.nextDouble();
			double bonus = sc.nextDouble();

			pm.addEmployee(new Employee01(Id, Name, Dept, Score),bonus);

		}
		pm.displayEmployees();
		pm.highestPerformanceScore();
		pm.lowestPerformanceScore();
		pm.secondHighestPerformanceScore();
		pm.averagePerformance();
		pm.highestAnnualBonus();
	}
}

class Employee01 implements Comparable<Employee01> {
	private int Id;
	private String Name;
	private String Dept;
	private double Score;

	public Employee01(int id, String name, String dept, double score) {
		super();
		Id = id;
		Name = name;
		Dept = dept;
		Score = score;
	}

	public int getId() {
		return Id;
	}

	public String getName() {
		return Name;
	}

	public String getDept() {
		return Dept;
	}

	public double getScore() {
		return Score;
	}

	public String toString() {
		return "Employee01 [Id=" + Id + ", Name=" + Name + ", Dept=" + Dept + ", Score=" + Score + "]";
	}

	public int compareTo(Employee01 o) {

		if (o.getScore() != this.getScore()) {

			return (int) (o.getScore() - this.getScore());

		} else {
			return this.getId() - o.getId();

		}
	}
}

class PerformanceManager {

	public TreeMap<Employee01, Double> map = new TreeMap<Employee01, Double>();

	public void addEmployee(Employee01 emp, double bonus) {

		map.put(emp, bonus);
	}

	public void displayEmployees() {

		for (Employee01 emp : map.keySet()) {

			System.out.println(emp);
		}
	}

	public void highestPerformanceScore() {

		System.out.println("Highest performance Score : " + map.firstKey());

	}

	public void lowestPerformanceScore() {

		System.out.println("Lowest performance Score :" + map.lastKey());

	}

	public void averagePerformance() {
		double sum = 0;
		for (Employee01 emp : map.keySet()) {

			sum += emp.getScore();
		}
		System.out.println("Avg Performance : " + (sum / map.size()));
	}

	public void secondHighestPerformanceScore() {
//		ArrayList<Map.Entry<Employee01, Double>> al = new ArrayList<>(map.entrySet());
		System.out.println("Second Highest performance Score : " + map.higherKey(map.firstKey()));
//		System.out.println("Highest performance Score : " + al.get(1).getKey());

	}

	public void highestAnnualBonus() {

		Employee01 HighestBonusEmployee = null;
		double highestBonus = 0;
		for (Map.Entry<Employee01, Double> entry : map.entrySet()) {

			if (entry.getValue() > highestBonus) {

				HighestBonusEmployee = entry.getKey();
				highestBonus = entry.getValue();
			}
		}
		System.out.println("Highest Bonus Employee : " + highestBonus);
	}
}