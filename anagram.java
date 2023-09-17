import java.util.Arrays;

public class anagram {
    public static boolean anagramChecker(String s1, String s2){
        char[] char1 = s1.toCharArray();
        char[] char2 = s2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);



        return Arrays.equals(char1, char2);
    }



    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "dabc";

        Boolean Checker = anagramChecker(word1, word2);

        System.out.println(Checker);
    }
}
