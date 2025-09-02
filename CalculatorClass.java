class CalculatorClass{
  public static void main(String[] args){
 
    CalculatorClass c = new CalculatorClass();
    System.out.println(c.add(10,20));
    System.out.println(c.subtract(10,20));
    System.out.println(c.multiply(10,20));
    System.out.println(c.divide(10,20));
  }
 
  public int add(int a, int b){
    return a+b;
  }
  public int subtract(int a,int b){
    return a-b;
  }
  public int multiply(int a,int b){
    return a*b;
  }
  public int divide(int a, int b){
    return a/b;
  }

}
