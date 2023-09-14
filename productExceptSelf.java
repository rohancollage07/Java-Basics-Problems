public class productExceptSelf {

    public static int[] constructProductArray(int[] arr){
        int n = arr.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int prod[] = new int[n];

        left[0] = 1;
        for(int i = 1; i<n; i++){
            left[i] = left[i-1] * arr[i-1];
        }

        right[n-1] = 1;
        for(int i = n-2; i >=0; i--){
            right[i] = right[i+1] * arr[i+1];
        }


        for(int i = 0; i<n; i++){
            prod[i] = left[i] * right[i];
        }
        
        return prod;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,10,20};
        int result[] = constructProductArray(arr);

        for(int num: result){
            System.out.print(num);
        }

    }
}
