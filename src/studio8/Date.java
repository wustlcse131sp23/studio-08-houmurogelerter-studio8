package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {

	private String month;
	private int day;
	private int year;
	
	public Date(String mon, int d, int y) {
		month = mon;
		day = d;
		year = y;
	}
	
	public String toString() {
		return month + " " + day + ", " + year;
	}
		
	
    public static void main(String[] args) {
    	Date a = new Date("January", 1, 2000);
    	System.out.println(a);
    	Date b = new Date("January", 1, 2000);
    	System.out.println(b);
    	Date c = new Date("January", 2, 2000);
    	System.out.println(c);
    	Date d = new Date("January", 3, 2003);
    	System.out.println(d);
    	Date e = new Date("February", 4, 2000);
    	System.out.println(e);
    	System.out.println(a.equals(b));
    	
    	LinkedList<Date> list = new LinkedList<Date>();
    	
    	list.add(a);
    	list.add(b);
    	list.add(c);
    	list.add(d);
    	list.add(e);
    	
    	System.out.println(list);
    	
    	HashSet<Date> set = new HashSet<Date>();
    	set.add(a);
    	set.add(b);
    	set.add(c);
    	set.add(d);
    	set.add(e);
    	
    	System.out.println(set);
    	
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && Objects.equals(month, other.month) && year == other.year;
	}
    
    

}
