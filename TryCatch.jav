// try {
//     int a = 10/0 ;
// } catch (Exception e) {
//     System.out.println(Exception);
// } catch(ArthimeticException e){
//     System.out.println(Arthimetic.Exception);

// }

public class TryCatch{
    public static void main(String[] args) {
    try {
    int a = 10 / 0;
    } catch (ArithmeticException e) {
    System.out.println("ArithmeticException caught: Division by zero");
    } catch (Exception e) {
    System.out.println("Exception caught: " + e.getMessage());
    }

    }
}
