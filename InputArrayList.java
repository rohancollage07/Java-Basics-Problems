import java.util.ArrayList;
import java.util.Scanner;

public class InputArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>();
        
        System.out.print("Enter the number of elements: ");
        int count = scanner.nextInt();
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < count; i++) {
            int num = scanner.nextInt();
            list.add(num);
        }
        
        System.out.println("ArrayList elements:");
        for (int num : list) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
}

