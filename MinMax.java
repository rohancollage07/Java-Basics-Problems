public class MinMax {
    public static void main(String[] args) {
        int[] array = {20,10,25,30,5,8};
        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length ; i++){
            if(array[i] > max) {
                max = array[i];
            }else if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
        System.out.println(max);

    }
}
