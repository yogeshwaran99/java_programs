import java.util.Scanner;

public class Factorial {
  
  public int fact(int n){
    int r=1;
    for(int i=1;i<=n;i++){
      r*=i;
    }return r;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int a = sc.nextInt();
    Factorial f = new Factorial();
    int b = f.fact(a);
    System.out.println("Factorial of "+a+" is "+b);
    sc.close();
  }
  
}
