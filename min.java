public class min {
    public static void main(String[] args) {
        int[] array = {1,5,4,3};
        int min = array[0];
        for(int num : array){
            if (num < min){
                min = num;
            }
        }
        System.out.println(min);
    }
}
