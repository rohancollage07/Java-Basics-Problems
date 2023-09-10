public class printNum {

  public static void main(String[] args) {
    // 12345 Inc
    int n = 5;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
    // 12345 desc
    // int n = 5;
    // for(int i = 5; i >= 1  ; i--){
    //     for(int j =1 ; j <=i ; j++){
    //         System.out.print(j + " " );
    //     }
    //     System.out.println();
    // }

    // from 54321 desc
    //  int n = 5;
    // for(int i = 1; i <= n  ; i++){
    //     for(int j =n ; j >=i ; j--){
    //         System.out.print(j + " " );
    //     }
    //     System.out.println();
    // }

  }
}
