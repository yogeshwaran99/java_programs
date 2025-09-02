public class CarClass{
  public static void main(String[] args){
    Car c = new Car();
    c.setBrand("Maruti");
    c.setModel("Swift");
    c.setYear(2018);
    System.out.println("Car brand "+c.getBrand());
    System.out.println("Car model "+c.getModel());
    System.out.println("Car year "+c.getYear());
  }
}
class Car{
  private String brand;
  private String model;
  private int year;

  public void setBrand(String brand){
    this.brand= brand;
  }
  public void setModel(String model){
    this.model = model;
  }
  public void setYear(int year){
    this.year= year;
  }
  public String getBrand(){
    return brand;
  }
  public String getModel(){
    return model;
  }
  public int getYear(){
    return year;
  }
}
