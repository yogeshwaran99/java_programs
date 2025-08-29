import java.util.Scanner;

public class Ternary {

    public static void main(String[] args) {
      
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the number");
      int a = s.nextInt();
      String r = (a%2==0)? "Divisible by 2" : "Not divisible by 2";
      System.out.println(r);
      s.close();
    }  
}
