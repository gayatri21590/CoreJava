package assignment2;

public class Employee {

	private String fname;
	private String lname;
	private double salary;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(String fname, String lname, double salary) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
	}
	public void displaySal()
	{
		
		double ysalary= salary*12;
		System.out.println(ysalary);
		double raiseSal=ysalary+0.10*ysalary;
		System.out.println(raiseSal);
		
		
	
	}
	
	
}
