
public class DivisibleByThree{
    
    public static void main (String[] args){
        divisibleByThreeInRange(4, 13);
    }
    
    public static void divisibleByThreeInRange(int a, int b){
        for (int i = a; i<= b; i++){
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
    } 
}