package mak.algo.section3.lecture28.assignment.problem1;

public class Employee {
	private int employeeNumber;
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	private String firstName;
	private String lastName;
	private String emailId;
	public Employee(int employeeNumber, String firstName, String lastName, String emailId) {
		super();
		this.employeeNumber = employeeNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "Employee [employeeNumber=" + employeeNumber + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", emailId=" + emailId + "]";
	}
}
