// public class DubNum {
//     public static void main(String[] args) {
//         int[] array = {2,10,80,10,10};
//         final int val = 10;
//         int count = 0;
//         for(int i =0; i <array.length; i++){
//             if(array[i] == val){
//                 count++;
//             }
            
//         }
//         System.out.println(count);
//     }
// }

import java.util.*;

public class DubNum {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 3, 2, 5, 6, 7, 5, 8, 9, 1, 2};
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each number in the array
        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int maxFrequency = 0;
        int maxNumber = 0;

        // Find the number with the maximum frequency
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int frequency = entry.getValue();
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                maxNumber = entry.getKey();
            }
        }

        // Print the number that occurs the maximum number of times
        System.out.println("Number with maximum occurrences: " + maxNumber);
        System.out.println("Frequency: " + maxFrequency);
    }
}
