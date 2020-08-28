
import java.util.Scanner;
        
public class FromWhereToWhere{
    
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Where to?");
        int to = Integer.valueOf(scan.nextLine());
        System.out.println("Where from?");
        int from = Integer.valueOf(scan.nextLine());
        
        for (int i = from; i <= to; i++){
            System.out.println(i);
        }
    }
}