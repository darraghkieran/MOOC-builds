
public class StarSign {

    public static void main(String[] args) {
        
        printStars(5);
    }

    public static void printStars(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");  
        }          
    }        
}
