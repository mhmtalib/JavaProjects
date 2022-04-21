package Fahrenheit2Celsius;

import java.util.Scanner;

public class Fahrenheit2Celsius {
              public static void main(String[] args) {
                System.out.print("Enter a temperature in Fahrenheit scale: ");	
                Scanner scan=new Scanner(System.in);
                double fahrenheit=scan.nextDouble();
                Fahrenheit2Celsius(fahrenheit);
        
            }
            private static void Fahrenheit2Celsius(double fahrenheit) {
                    
                double celsius = (fahrenheit - 32) * 5 / 9;
        
                System.out.println("Temperature in Celsius: "+celsius);



    }
}
