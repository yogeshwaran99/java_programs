class EmployeeEncap{
  public static void main(String[] args){
    Employee e = new Employee();
    e.setName("Nathan");
    e.setSalary(12000);
    System.out.println(e.getName());
    System.out.println(e.getSalary());
  }
}
class Employee{
  private String name;
  private int salary;
  
  public void setName(String name){
    this.name = name;
  }
  public void setSalary(int salary){
    this.salary = salary;
  }
  public String getName(){
    return name;
  }
  public int getSalary(){
    return salary;
  }

}
