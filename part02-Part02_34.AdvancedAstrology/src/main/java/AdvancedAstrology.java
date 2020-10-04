
public class AdvancedAstrology {

    public static void main (String [] args){
        christmastree(6);
    }
    
    public static void christmastree(int n){
        for (int i = 1; i <= n ; i++){
            for (int j = n; j >= i; j--){
                System.out.print("j");
            } 
            for (int k = 0; k <= i; k++){
                    System.out.print("k");    
            }
            for (int m = 2; m <= i; m++){
                System.out.print("m");
            }
            System.out.println("");
        } 
    }
}
