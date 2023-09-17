public class maxSub {

    public static int[] findMaxSubarray(int[] arr) {
        int max_so_far = Integer.MIN_VALUE; // Initialize to the smallest possible integer value
        int max_ending_here = 0;
        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 0; i < arr.length; i++) {
            max_ending_here = max_ending_here + arr[i];

            if (max_ending_here > max_so_far) {
                max_so_far = max_ending_here;
                start = tempStart;
                end = i;
            }

            if (max_ending_here <= 0) {
                max_ending_here = 0;
                tempStart = i + 1;
            }
        }

        // Extract the subarray with the maximum sum
        int[] subarray = new int[end - start + 1];
        System.arraycopy(arr, start, subarray, 0, subarray.length);

        return subarray;
    }

    public static void main(String[] args) {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] subarr = findMaxSubarray(array);

        System.out.println("Maximum Sum Subarray:");
        for (int num : subarr) {
            System.out.print(num + " ");
        }
    }
}
