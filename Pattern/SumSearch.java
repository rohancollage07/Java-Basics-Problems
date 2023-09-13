public class SumSearch {
    public static void main(String[] args) {
        int[] Numbers = {0, -1, 2, -3, 1};
        int val = -2;

        boolean found = false; // A flag to indicate whether a pair is found

        for (int i = 0; i < Numbers.length; i++) {
            for (int j = i + 1; j < Numbers.length; j++) {
                int sum = Numbers[i] + Numbers[j];
                if (sum == val) {
                    System.out.println("Yes, there is a pair (" + Numbers[i] + ", " + Numbers[j] + ") with the sum " + val);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No such pair found with the sum " + val);
        }
    }
}
