class MobilePhone{
    public static void main(String[] args){
      Mobile m = new Mobile();
      m.setBrand("Redmi");      
      m.setPrice(1200);
      System.out.println("mobile brand "+m.getBrand()+" price "+m.getPrice());
    }
}
class Mobile{
  private String brand;
  private int price;

  public void setBrand(String brand){
    this.brand = brand;
  }
  public void setPrice(int price){
    if(price>1000){
      this.price = price;
    }
  }
  public String getBrand(){
    this.brand = brand;   
    return brand; 
  }
  public int getPrice(){
    this.price = price;
    return price;
  }
}
