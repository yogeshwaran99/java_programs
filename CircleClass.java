class CircleClass{
  public static void main(String[] args){
    Circle c = new Circle();
    System.out.println("Radius "+c.radius);    
    System.out.println("Area "+c.calculateArea());
    System.out.println("Circumference "+c.calculateCircumference());
  }
}
class Circle{
  int radius = 5;
  
  public double calculateArea(){
    return Math.PI*radius*radius;
  }

  public double calculateCircumference(){
    return 2*Math.PI*radius;
  }
}
