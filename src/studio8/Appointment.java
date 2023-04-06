package studio8;

import java.util.LinkedList;

public class Appointment {
	
	private Date date;
	private Time time;

	public Appointment(Date d, Time t) {
		super();
		date = d;
		time = t;
	}
	
	public String toString() {
		return date.toString() + " " + time.toString();
	}

	public static void main(String[] args) {
		Date b = new Date("February", 1, 2000);
		Time c = new Time(10,10);
		Appointment a = new Appointment(b, c);	
		
		LinkedList<Appointment> list = new LinkedList<Appointment>();
		list.add(a);
		
		System.out.println(list);;

	}

	
	
}
