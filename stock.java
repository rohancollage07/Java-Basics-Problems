public class stock {
    public static void main(String[] args) {
        int[] Days = {7,1,5,3,6,4};
        int l =0;
        int r = 1;
        int MaxP = 0;
        while (r < Days.length){
            if (Days[l]< Days[r]){
                int profit = Days[r] - Days[l];
                MaxP = Math.max(MaxP, profit);
            }else{
                l = r;
            }
            r++;


        }
        System.out.println(MaxP);
    }
}
