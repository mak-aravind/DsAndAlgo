package mak.algo.section3.lecture28.assignment.problem1;

import java.util.Random;
import java.util.stream.IntStream;

public class EmployeeDB {
	Employee[] employeeList = new Employee[10];
	final int[] employeeNumbers;
	
	public EmployeeDB(){
		Random randomGenerator = new Random();
		employeeNumbers = IntStream.generate(()->randomGenerator.nextInt(500))
				.limit(10)
				.toArray();
		populateData();
	}
	
	private void populateData(){
		int i =0;
		for (int employeeNumber : employeeNumbers) {
			employeeList[i] = new Employee(employeeNumber, "firstName"+employeeNumber, "lastName"+employeeNumber, "emailId"+employeeNumber);
			i++;
		}
	}

	public void printList() {
		for (Employee employee : employeeList) {
			System.out.println(employee.toString());
		}
	}
	
	public void sort(){
		for (int i =0;i <employeeList.length;i++){
			Employee current = employeeList[i];
			int j = i -1;
			while (j>=0 && employeeList[j].getEmployeeNumber() > current.getEmployeeNumber()){
				employeeList[j+1] = employeeList[j];
				j--;
			}
			employeeList[j+1] = current;
		}
	}
	
	public static void main(String[] args) {
		
		EmployeeDB employeeDB = new EmployeeDB();
		
		System.out.println("\nBefore Sorting:");
		employeeDB.printList();
		employeeDB.sort();
		System.out.println("\nAfter Sorting:");
		employeeDB.printList();
	}

}
