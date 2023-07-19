import java.util.Scanner;

public class InputArray {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("size of array : " );

        int size = sc.nextInt();

        int[] array = new int[size] ;

        System.out.println("enter ele of array : " );
        for(int i =0; i < size; i++){
            array[i] = sc.nextInt();
        }
        
        System.out.println("Array elements:");
        for (int i=0; i< size ; i++){
            System.out.println(array[i]+ " " );

        }
        sc.close();
    }
}
