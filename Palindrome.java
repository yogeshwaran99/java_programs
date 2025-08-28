import java.util.Scanner;

public class Palindrome {

  public boolean Check(int n){
    int original = n;
    int reverse = 0;
    while(n>0){
      int digit = n%10;
      reverse = reverse *10 + digit;
      n /=10;
    }
    return original==reverse;
  }
  
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Number");
     int a = sc.nextInt();   
     Palindrome o = new Palindrome();
     boolean r = o.Check(a);
     if(r){
       System.out.println("Number "+a+" is Palindrome");
     }else{
       System.out.println("Number "+a+" is not a Palindrome");
     }
     sc.close();
  }
}
