public class ThreeSum {
    public static void findThreeSum(int[] arr, int n){
        for(int i =0 ; i < n-2;i++){
            for(int j =i+1 ; j < n-1; j++){
            for(int k = j+1 ; k < n;k++){
               if(arr[i]+ arr[j]+arr[k] == 0){
                    System.out.println(arr[i]+ " " + arr[j] + " "+ arr[k]); 
               }
               
        }
        }    
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,5,8,-8,5,-7,-1};
        int n = arr.length;
        findThreeSum(arr, n);
    }
}
