public class binarySearch {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int val = 2;
        if(val < array.length){
            
        }
        int l = 0;
        int r = array.length -1;
        for(int i = 0; i < array.length; i++){
            int mid = l + ( r-l /2);
            if(array[mid] == val){
                System.out.println(mid);
            }else if(array[mid] > val){
                r = mid - 1;
            }else{
                l = mid +1;
            }
        }
        System.out.println("no");
        
    }
}
