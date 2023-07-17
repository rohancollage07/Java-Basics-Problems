public class CountStr {
    public static void main(String[] args) {
        String A = "Rohan";
        int count = 0;
        for (int i = 0; i <A.length() ; i++){
            if (A.charAt(i) != ' '){
                count ++;
            }
        }
        System.out.println(count);
        

    }
}
