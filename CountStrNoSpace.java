import java.util.Scanner;

public class CountStrNoSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sentence with spaces: ");
        String WithSpace = sc.nextLine();
        System.out.println("Sentence with space is : " + WithSpace);
        String NoSpace = WithSpace.replaceAll(" ", "");
        System.out.println("Sentence WITHOUT space is : "+ NoSpace);

        //Method 1
        int count = 0;
        for(int i =0; i < NoSpace.length(); i++){
            if(NoSpace.charAt(i) != ' '){
                count++;
            }
        }
        //Method 2
        // int charCount = NoSpace.length();
        System.out.println("The total count of char is " +  count);
        sc.close();
    }
}
