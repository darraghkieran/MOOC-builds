
import java.util.Scanner;

public class SumOfASequenceTheSequel{
    
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
       
        int sum = 0;
        
        System.out.println("First Number?");
        int first = Integer.valueOf(scan.nextLine());
        System.out.println("Last number?");
        int second = Integer.valueOf(scan.nextLine());
        
        for (int i = first; i <= second; i++){
            sum = sum + i;
        }
        
        System.out.println("The sum is " + sum); 
    }  
}
    