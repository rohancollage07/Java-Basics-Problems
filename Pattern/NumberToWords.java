import java.util.Scanner;

public class NumberToWords {
    private static final String[] units = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
        "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };
    
    private static final String[] tens = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };
    
    private static final String[] thousands = {"", "Thousand", "Million", "Billion"};
    
    public static String convertToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        
        String words = "";
        for (int i = 0; num > 0; i++) {
            if (num % 1000 != 0) {
                words = convertToWordsLessThanThousand(num % 1000) + thousands[i] + " " + words;
            }
            num /= 1000;
        }
        
        return words.trim();
    }
    
    private static String convertToWordsLessThanThousand(int num) {
        if (num == 0) {
            return "";
        } else if (num < 20) {
            return units[num] + " ";
        } else if (num < 100) {
            return tens[num / 10] + " " + convertToWordsLessThanThousand(num % 10);
        } else {
            return units[num / 100] + " Hundred " + convertToWordsLessThanThousand(num % 100);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (0 to 999,999,999): ");
        int number = scanner.nextInt();
        
        if (number < 0 || number > 999999999) {
            System.out.println("Number out of range.");
        } else {
            String words = convertToWords(number);
            System.out.println("In words: " + words);
        }
        
        scanner.close();
    }
}
