import java.util.Scanner;

public class ArraySum {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Array size");
    int n =s.nextInt();
    int[] a = new int[n];
    System.out.println("Enter the array elements");
    for(int i=0;i<n;i++){
     a[i]=s.nextInt();
    }
    int odd=0,even=0;
    for(int i=0;i<n;i++){
      if(a[i]%2==0){
        even+=a[i];
      }else{
        odd+=a[i];
      }
    }
    System.out.println("Sum of odd elements "+odd);
    System.out.println("Sum of even elements "+even);
    s.close();
  }
}
