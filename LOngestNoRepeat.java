import java.util.HashMap;
import java.util.Map;

public class LOngestNoRepeat {
    public static int longestNonRepeat(String s){
        Map<Character , Integer> CharIndex = new HashMap<>();

        int MaxLength = 0;
        int Start = 0;

        for(int i=0; i<s.length(); i++){
            char CurrentChar = s.charAt(i);
            if(CharIndex.containsKey(CurrentChar) && 
            CharIndex.get(CurrentChar) >= Start){
                Start = CharIndex.get(CurrentChar)+1;
            }

            CharIndex.put(CurrentChar, i);

            int currentLengh = i - Start + 1;

            MaxLength = Math.max(MaxLength, currentLengh);

            
        }
        return MaxLength;
    }

    public static void main(String[] args) {
        String Input = "RRklOHAN";
        int result = longestNonRepeat(Input);
        
        System.out.println(result);
    }
}
