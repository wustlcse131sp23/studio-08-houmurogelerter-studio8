package studio8;

import java.util.Objects;

public class Time {
	
	private int hour;
	private int minute;
	
	/**
	 * 
	 * @param hou: integer representing hour
	 * @param min: integer representing minute
	 */
	public Time(int hou, int min) {
		hour = hou;
		minute = min;
	}
	
	public String toString() {
		return "Hour: " + hour + " Minute: " + minute;
	}
	
	public static void main(String[] args) {
		Time t = new Time(10,10);
    	System.out.println(t);
    	Time a = new Time(10,10);
    	System.out.println(a);
    	Time b = new Time(5, 5);
    	System.out.println(b);
    	System.out.println(a.equals(t));
    	System.out.println(a.equals(b));
    }

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}
	
	
}