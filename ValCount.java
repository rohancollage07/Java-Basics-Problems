import java.util.Scanner;

public class ValCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want to check: " );
        int val = sc.nextInt();
        int[] a ={20,20,4,5,60};
        int count = 0;
        for (int i = 0; i <a.length ; i++){
            if (a[i] == val){
                count ++;
                
            }
        }
        System.out.println("In the given array " + val + " is " + count + " times");
        

    }
}
