public class ForLoop{
  public static void main(String[] args){

    //divisible by 2    
    for(int i=100;i>=50;i--){
      if(i%2==0)
        System.out.println(i);
    }

    //divisible by 4
    for(int i=100;i>=50;i--){
      if(i%2==0)
        System.out.println(i);
    }

    //divisible by both 2 and 4
    for(int i=100;i>=50;i--){
      if(i%4==0&&i%2==0)
        System.out.println(i);
    }


    //pattern printing from rightside
    for(int i=0;i<=5;i++){
      for(int j=i;j<5;j++){
        System.out.print(" ");
      }      
      for(int k=0;k<=i;k++){
        System.out.print("*");
      }
      System.out.println();
    }


  }
}
