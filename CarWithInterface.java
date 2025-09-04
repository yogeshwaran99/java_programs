public class CarWithInterface{

  public static void main(String[] args) {
    Car c = new Car();
    c.start();
    c.stop();
  }
}

class Car implements Vehicle{
  public void start(){
    System.out.println("Car is starting");    
  }
  public void stop(){
    System.out.println("Car has stoped");
  }
}

interface Vehicle {
  public void start();
  public void stop();
}
