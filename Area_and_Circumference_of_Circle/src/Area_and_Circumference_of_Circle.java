import java.util.*;
public class Area_and_Circumference_of_Circle  {
	

	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		System.out.println("Enter Radius of the circle");
		double Radius=console.nextDouble();
		console.close();
		System.out.println("The area of a circle is: " + getArea(Radius));
		System.out.println("The circumference of a circle is: " + getCircumference(Radius));
	}

	public static double getArea(double R) {
		return Math.PI * Math.pow(R, 2);
	}

	public static double getCircumference(double R) {
		return Math.PI * R * 2;
	}
}