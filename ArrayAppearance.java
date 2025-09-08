
import java.util.Scanner;
class ArrayAppearance{

  public static void main(String[] args){

    Scanner s = new Scanner(System.in);
    System.out.println("enter the array size");
    int n = s.nextInt();
    int[] a = new int[n];
    System.out.println("Enter the array elements");
    for(int i=0;i<n;i++){
      a[i]=s.nextInt();
    }
    boolean[] visited = new boolean[n];
    for(int i=0;i<n;i++){
      if(visited[i])continue;
      int c =1;
      for(int j=i+1;j<n;j++){
        if(a[i]==a[j]){
        c++;
        visited[j]=true;
        }                
      }
      System.out.println(a[i]+" Appearce "+c+" times");
    }s.close();
  }
}
