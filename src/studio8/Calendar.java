package studio8;

import java.util.LinkedList;

public class Calendar {

	private Appointment app;
	
	public Calendar (Appointment appt) {
		app=appt;
	}
	
	public String toString() {
		return app.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Date b = new Date("February", 1, 2000);
			Time c = new Time(10,10);
			Appointment a = new Appointment(b,c);
			Calendar cal = new Calendar(a);	
			
			LinkedList<Appointment> list = new LinkedList<Appointment>();
			list.add(a);
			
			System.out.println(list);;
	}

}
