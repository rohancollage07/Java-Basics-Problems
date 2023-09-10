// Java implementation of the above approach
// import java.io.*;

class Palindrome {

  // Function to check palindrome
  static boolean checkPalindrome(String str) {
    // Calculating string length
    int len = str.length();

    // Traversing through the string
    // upto half its length
    for (int i = 0; i < len / 2; i++) {
      // Comparing i th character
      // from starting and len-i
      // th character from end
      if (str.charAt(i) != str.charAt(len - i - 1)) return false;
    }

    // If the above loop doesn't return then
    // it is palindrome
    return true;
  }

  // Driver Code
  public static void main(String[] args) {
    // Taking number as string
    String st = "s112233445566778899000000998877665544332211s";

    if (checkPalindrome(st) == true) System.out.print(
      "Yes"
    ); else System.out.print("No");
  }
}
// This code is contributed by subhammahato348
