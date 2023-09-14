import java.util.HashMap;
import java.util.Map;

public class LOngestRepeat {
    
    public static Character longestRepeat(String s){
        Map<Character, Integer> CharCount = new HashMap<>();
        
        int maxCount = 0;
        int start = 0;
        char maxChar = '\0';

        for(int i = 0; i < s.length(); i++){
            char CurrentChar = s.charAt(i);
            if(CharCount.containsKey(CurrentChar) && CharCount.get(CurrentChar) >= start){
                start = CharCount.get(CurrentChar) + 1;               
            }

            CharCount.put(CurrentChar, i);

            int currentLengh = i - start + 1;
            
            if(currentLengh > maxCount){
                maxCount = currentLengh;
                maxChar = CurrentChar;
            }

        }
       return maxChar;
    }



    public static void main(String[] args) {
        String name = "THHKOPPPP";
        Character result = longestRepeat(name);
        System.out.println("The Longest consequetive is :"+ result); 
    }
}
