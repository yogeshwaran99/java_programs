public class AnimalInheritance {

public static void main(String[] args) {
  Dog d = new Dog();

}  

}
class Animal{
  public Animal(){
    System.out.println("Animal constructor called");
  }
}
class Dog extends Animal{
  public Dog(){
    System.out.println("Dog constructor called");
  }
}
