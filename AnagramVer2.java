import java.util.Arrays;
import java.lang.String;

public class AnagramVer2 {
    
    public static boolean IsAnagram(String name, String name2){
        name = name.replaceAll(" ", "").toLowerCase();
        name2 = name2.replaceAll(" ", "").toLowerCase();

        char[] str1 = name.toCharArray();
        char[] str2 = name2.toCharArray();

        ArrSort(str1);

        ArrSort(str2);
        
        return Arrays.equals(str1, str2);

    }


    public static void ArrSort(char[] str1){
        for (int i = 0; i < str1.length; i++) {
            for (int j = 1; j < str1.length; j++) {
                if((int)str1[i] > (int)str1[j]){
                    char temp = str1[i];
                    str1[i] = str1[j];
                    str1[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        


        String name = "Rohan sh don";
        String name2 = "Rohan hs don";


        Boolean check = IsAnagram(name, name2);

        System.out.println(check);
    }
}
