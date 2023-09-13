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
        Map <Integer, Integer> frequencyMap = new HashMap<>();
        
        for(int num : numbers){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }


        int maxFrequency = 0;
        int maxNumber = 0;

        for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()){
            int frequency = entry.getValue();
            if(frequency > maxFrequency){
                maxFrequency = frequency;
                maxNumber = entry.getKey();
            }
        }

    // Hashmap FrequencyMap = new Hashmap(); 
        // Print the number that occurs the maximum number of times
        System.out.println("Number is : " + maxNumber);
        System.out.println("Frequency of it occurence is: " + maxFrequency);
    }
}


// Certainly, let's break down the line:

// ```java
// for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
// ```

// Here's an explanation word by word:

// - `for`: This keyword is used to start a loop. In this case, it's starting a "for-each" loop, which iterates over elements in a collection, such as an array or a `Map`.

// - `(Map.Entry<Integer, Integer> entry`: This part defines a loop variable `entry` of type `Map.Entry<Integer, Integer>`. It's a way of declaring a variable that will represent each key-value pair (entry) in the `frequencyMap`.

// - `:`: The colon (`:`) separates the loop variable declaration from the collection or iterable being iterated over.

// - `frequencyMap`: This is the name of the collection that is being iterated over. In this case, it's a `Map` called `frequencyMap`.

// - `.entrySet()`: `entrySet()` is a method of the `Map` interface that returns a set of all key-value pairs (entries) in the map. So, `frequencyMap.entrySet()` gets the set of entries in the `frequencyMap`.

// - `) {`: This part closes the loop declaration and starts the loop block.

// So, when you put it all together, this line is setting up a "for-each" loop to iterate over the entries (key-value pairs) in the `frequencyMap`. The loop variable `entry` will represent each entry in each iteration of the loop. This loop allows you to process each key-value pair in the map one at a time, in the order they appear in the map.