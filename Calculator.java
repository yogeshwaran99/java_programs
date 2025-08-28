import java.util.Scanner;

public class Calculator {

  public int add(int a, int b){
    return a+b;
  }
  public int sub(int a,int b){
    return a-b;
  }
  public int mul(int a, int b){
    return a*b;
  }
  public int div(int a, int b){
    return a/b;
  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in)  ;
      System.out.println("Enter the first number");
      int a = sc.nextInt();
      System.out.println("Enter the second number");
      int b = sc.nextInt();
      System.out.println("Enter the operator(+,-,*,/)");
      char c = sc.next().charAt(0);
      
      Calculator o = new Calculator();
      if(c=='+'){
        System.out.println("Answer "+o.add(a,b));
      }else if(c=='-'){
        System.out.println("Result "+o.sub(a, b));
      }else if(c=='*'){
        System.out.println("Result "+o.mul(a, b));
      }else if(c=='/'){
        System.out.println("Result "+o.div(a,b));
      }else{
        System.out.println("Invalid input");
      }
      sc.close();
  }
}
