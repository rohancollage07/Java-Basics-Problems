public class max_sub_product {

    public static int generateMaxProduct(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0; // Handle the case of an empty array or null input.
        }

        int maxEndingHere = 1; // Initialize maxEndingHere and minEndingHere to 1.
        int minEndingHere = 1;
        int maxSoFar = Integer.MIN_VALUE;

        for(int num : arr){
            if(num < 0){
                int temp = maxEndingHere;
                maxEndingHere = minEndingHere;
                minEndingHere = temp;
            }

            maxEndingHere = Math.max(num, num * maxEndingHere);
            minEndingHere = Math.min(num, num * minEndingHere);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] array = {-1, 2, 3, -1, 5, 8, 5, -5, 2};
        int maxProd = generateMaxProduct(array);
        System.out.println(maxProd);
    }
}
