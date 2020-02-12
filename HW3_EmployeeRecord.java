/*
Name: Denny Feng
Task: Employee Record Creator
Description: Create program where you add, modify employee records with their individual credentials. 
*/

import java.util.ArrayList; 
import java.util.Scanner; 

public class EmployeeRecord15347739 {
	public static void main(String[] args) {
		int count; 
		double avg = 0.0; 
		double sum, salary = 0.0; 
		String name, jobtitle, ssn;
		boolean average = false; 
		
		Scanner scan = new Scanner(System.in);
		
		Employee[] employee = new Employee[100];
		
		System.out.println("Enter amount of Employee Records: ");
		
		count = scan.nextInt(); 
		
		for(int i = 0; i < count; i++) {
			scan.nextLine(); 
			System.out.println("Enter employee name: ");
			name = scan.nextLine(); 
			System.out.println("Enter employee social security number: ");
			ssn = scan.nextLine(); 
			System.out.println("Enter employee job title: ");
			jobtitle = scan.nextLine(); 
			System.out.println("Enter employee salary: ");
			salary = scan.nextDouble(); 
			

			
			employee[i] = new Employee(name, ssn, jobtitle, salary, average);
		}
		
			
			System.out.println("Employee Records: ");
			for (int i = 0; i < count; i++) {
			System.out.println(employee[i].toString());
			}
	
	}
	
	/*static class Average extends Employee{
		private double average; 
		private boolean abovebelow = false; 
		private double sum; 
		
		public double getAverage() {
			return average; 
		}
		
		public void setAverage(double average) {
			this.average = average; 
		}
		
		public boolean getAboveBelow() {
			return abovebelow; 
		}
		
		public void setAboveBelow(boolean abovebelow) {
			this.abovebelow = abovebelow; 
		}
		
		public double getSum() {
			return sum;
		}
		
		public void setSum(double sum) {
			this.sum = sum; 
		}
		
		public Average(double salary, double average, boolean abovebelow) {
			super(salary); 
			this.average = average; 
			this.abovebelow = abovebelow; 

			public String toString() {
				return "Employee Salary: " + getSalary() + ", Average Employee Salary: " + getAverage() + ", Above/Below Salary: " + getAboveBelow();	
		}
		
	}*/
	
	static class Person {
		private String name; 
		
		public Person(String name) {
			this.name = name; 
		}
		
		public String getName() {
			return name; 
		}
		
		public void setName(String name) {
			this.name = name; 
		}
		
		public void writeOutput() {
			System.out.println("Employee Name: " + name);
		}
		
		public boolean hasSameName(Person otherPerson) {
			return this.name.equalsIgnoreCase(otherPerson.name);
		}
		
	}
	
	static class Employee extends Person {
		private String jobtitle; 
		private double salary;
		private String ssn; 
		private boolean average; 
		
		public Employee(String name, String ssn, String jobtitle, double salary, boolean average) {
			super(name);  
			this.jobtitle = jobtitle; 
			this.salary = salary;
			double sum; 
			double comparableAverage = 0;
			
			try {
				if(ssn.length() != 9)
					throw new SSNLengthException(); 
			else {
				for(int i = 0; i < ssn.length(); i++){
					if((ssn.charAt(i) > '9' || ssn.charAt(i) < '0')) {
						throw new SSNCharacterException(); 
					}
				}
				this.ssn = ssn; 
				}
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		public String getSsn() {
			return ssn; 
		}
		
		public void setSsn(String ssn) {
			this.ssn = ssn; 
		}
		
		public String getJobTitle() {
			return jobtitle; 
		}
		
		public void setJobTitle(String jobtitle) {
			this.jobtitle = jobtitle; 
		}
		
		public double getSalary() {
			return salary; 
		}
		
		public void setSalary(double salary) {
			this.salary = salary; 
		}
		
		public String toString() {
			return "Employee Name: " + getName() + ", SSN: " + getSsn() + ", Job Title: " + getJobTitle() + ", Salary: " + getSalary(); 
		}
		
	}
	
	static class SSNCharacterException extends Exception {
		public SSNCharacterException() {
			super("Invalid. Please enter numbers only.");
		}
		
		public SSNCharacterException(String s) {
			super(s); 
		}
		
	}
	
	static class SSNLengthException extends Exception {
		public SSNLengthException() {
			super("Invalid. Please enter a 9 digit social security number.");
		}
		
		public SSNLengthException(String s) {
			super(s); 
		}
	}
	
}
