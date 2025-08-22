public class NumberOperations {
  public static void main(String[] args) {

    int n=10;

    // 1. Check if number is positive, negative or zero
    if(n>0) {
      System.out.println(n+" is positive");
    }else if (n<0){
      System.out.println(n+" is negative");      
    }else{
      System.out.println("The number is zero");
    }

    // 2. Check if number is even or odd
    if (n%2==0) {
      System.out.println(n+ " is Even");
    } else {
      System.out.println(n+ " is Odd");
    }

    // 3. Check if number is prime
    if (isPrime(n)) {
      System.out.println(n+ " is Prime");
    } else {
      System.out.println(n+ " is Not Prime");
    }

    // 4. Print numbers 10 to 1 without increment operator
    
    while (n>=1) {
      System.out.println(n);
      n=n-1;
    }
  }

  //helper method for prime check
  public static boolean isPrime(int n) {
    if (n<=1) return false;
    for (int i=2;i<=n/2;i++) {
      if (n%i==0) return false;
    }
    return true;
  }   

}

