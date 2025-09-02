class EmployeeClass{
  public static void main(String[] args){
    Employee e = new Employee();
    e.displayDetails();
  }
}
class Employee{
  String name = "Bob";
  int salary = 10000;
   public void displayDetails (){
     System.out.println(name+" salary is "+salary);
   }

}
