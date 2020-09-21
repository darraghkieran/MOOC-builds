

public class FromParameterToOne {

    public static void main(String[] args) {

        printFromNumberToOne(10);

    }
    
    public static void printFromNumberToOne(int printFromNumberToOne){
        int i;
        for (i = printFromNumberToOne; i > 0; i = i - 1){
            System.out.println(i);
        }
    }
}
