package util;

public class Calculator3 {
	
	public static final double PI = 3.14156;
	
	public static double circunference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public  static double volume(double radius) {
		return 4.0 * PI * Math.pow(radius, 3) / 3.0;
	}
}
