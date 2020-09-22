
import java.util.Scanner;

public class Word{
    
    public static void main (String args){
    Scanner scan = new Scanner(System.in); 
    
        System.out.println("The first number is: " );
        int first = Integer.valueOf (scan.nextLine());
        
        System.out.println("The second number is: ");
        int second = Integer.valueOf(scan.nextLine());
        
        System.out.println("The third number is:");
        int third = Integer.valueOf(scan.nextLine());
        
        double result = average(first, second, third);
        System.out.println("The average of the numbers is: " + result);
    }
    
    public static double average(int number1, int number2, int number3){
        int sum = number1 + number2 + number3;
        double x = sum / 3.0;
        return x;
    }
}
