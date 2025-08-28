import java.util.Scanner;

public class DivisibleBy12 {

  public boolean Divisible(int n ){
    return n%12==0;
  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number");
      int a  = sc.nextInt();

      DivisibleBy12 o = new DivisibleBy12();
      boolean r = o.Divisible(a);
      if(r){
        System.out.println("Number "+a+" is Divisible By 12");
      }else{
        System.out.println("Number "+a+" is not Divisible  By 12");
      }
    sc.close();
  }
}
