import java.util.Scanner;

public class SecondLargestElementInArray {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter the array size");
    int n = s.nextInt();
    int[] a = new int[n];
    System.out.println("enter the array elements");
    for(int i=0;i<n;i++){
      a[i]=s.nextInt();
    }
    int large = Integer.MIN_VALUE;
    int secondLarge = Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
      if(a[i]>large){
        secondLarge=large;
        large=a[i];
      }else if(a[i]>secondLarge&&a[i]!=large){
        secondLarge=a[i];
      }
    }
    System.out.println("Secong Largest Number is "+secondLarge);
    s.close();
  }
}
