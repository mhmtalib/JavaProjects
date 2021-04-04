import java.util.Scanner;

public class PrimeNumbers {
    
        public static void main(String[] args) {
            System.out.println("Enter a number.");

            Scanner scan =new Scanner(System.in);
            int number=scan.nextInt();
            isPrimeNumber(number);

            for (int n = 2; n <= number; n++) {
                if (isPrimeNumber(n)) {
                    
                    System.out.print( n + " ");
               }
                
            }   
        }
        public static boolean isPrimeNumber(int number) {
            for (int i = 2; i < number; i++) {
                if ((number % i) == 0) {
                    return false;
                }  
            }
            return true;
        }
}