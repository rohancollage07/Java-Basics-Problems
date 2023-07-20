import java.util.Scanner;

public class NewRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        // String k = "nahor";
        String k = sc.nextLine();
        String result = "";
        for(int i = k.length()-1; i >=0; i--){
            result = result + k.charAt(i);
        }
        System.out.println("Reversed string is: "+result);

        sc.close();
    }
}
