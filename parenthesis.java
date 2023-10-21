public class parenthesis {

    public static boolean isComplete(String para){
        Boolean flag = true;
        int count = 0;

        for(int i = 0; i<para.length();i++){
            char c = para.charAt(i);
            if( c == '('){
                count +=1;
            }
            else{
                count-=1;
            }
        }
        System.out.println(count);
        if (count == 0){
            flag = true;
        }else{
            flag = false;
        }

        return flag;
    }


    public static void main(String[] args) {
        String para = "((()))()()";
        Boolean result = isComplete(para);
        System.out.println(result);
    }  
    
}
