public class ReverseStr {
    public static void main(String[] args) {
        String a = "nahor";
        System.out.println("orginal array : " + a);
        String b = reverseString(a);
        System.out.println("Converted array : "+ b);
    }
public static String reverseString(String a) {
    
    
    StringBuilder b = new StringBuilder();
    for (int i = a.length()-1 ; i >=0; i--){
        b.append(a.charAt(i));
    }
    return b.toString();
}
}


