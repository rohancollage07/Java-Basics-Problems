import java.util.Scanner;

/**
 * main
 */
public class GuessGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        int randNum = (int)(Math.random()*100);
        
        do{ 
            System.out.println("Guess my number");
            number = sc.nextInt();
            
            if (number == randNum){
                System.out.println("WHOOOOO");
                break;
            }
            else if (number > randNum){
                System.out.println("Guess litttle lower");

            }
            else{
                System.out.println("Guess little higher");
            }
            

        }while(number >= 0);
        System.out.println("the end");
    }
}