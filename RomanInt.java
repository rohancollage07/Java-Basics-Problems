import java.util.HashMap;
import java.util.Map;

public class RomanInt {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();

    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);

    //Method 1

    // String s = "XX";
    //     int result = 0;
    //     for(int i =0; i< s.length();i++){
    //         if(i>0 && map.get(s.charAt(i)) > map.get(s.charAt(i-1))){
    //             result = result + map.get(s.charAt(i)) - 2 * map.get(s.charAt(i-1));
    //         }else{
    //             result = result + map.get(s.charAt(i));
    //         }
    //     }
    //     System.out.println(result);

    //Method 2

     String s = "IX";
        int result = 0;
        for(int i =0; i < s.length();i++){
            if(i+i < s.length() && map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                result = result - map.get(s.charAt(i));
            }else{
                result = result + map.get(s.charAt(i));
            }
        }
        System.out.println(result);
    }
}
