import java.util.Scanner;

public class DivSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        String num1 = sc.nextLine();
        //To take input i changed the code2142
        // String num1 = "21";
        int num2 = Integer.parseInt(num1);
        

        if(num2 % 7 == 0){
            System.out.println(1);
        }else{System.out.println(0);}
        sc.close();
    }
}

