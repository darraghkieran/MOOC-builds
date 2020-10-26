
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write some numbers:");
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int n = Integer.valueOf(scanner.nextLine());
            
            if (n == -1){
                break;
            }
            list.add(n);
        }
        
        int sum = 0;
        for (int average: list){
            sum += average;
        }
        System.out.println(1.0*sum/list.size());
    }
}
