class BasicCalculator implements Calculator{

  public static void main(String[] args){
    
    BasicCalculator b = new BasicCalculator();
    int a =4;
    int c =2;
    System.out.println("Addition of "+a+" and "+c+" = "+b.add(a,c));
    System.out.println("Subtraction of "+a+" and "+c+" = "+b.subtract(a,c));
    System.out.println("Multiplication of "+a+" and "+c+" = "+b.multiply(a,c));
    System.out.println("Division of "+a+" and "+c+" = "+b.divide(a,c));
  }

  public int add(int a ,int b){
    return a+b;
  }
  public int multiply(int a,int b){
    return a*b;
  }
  public int subtract(int a,int b){
    return a-b;
  }
  public int divide(int a,int b){
    return a/b;
  }

}
interface Calculator{
  public int add(int a,int b);
  public int subtract(int a,int b);
  public int multiply(int a,int b);
  public int divide(int a,int b);
}
