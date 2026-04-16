package assignment2;

public class DateTest {

	public static void main(String[] args) {
		Date d = new Date(5,4,2003);
		d.displayDate();
		System.out.println("Day : "+d.getDay());
		System.out.println("Month : "+d.getMonth());
		System.out.println("year: "+d.getYear());
		

	}

}
