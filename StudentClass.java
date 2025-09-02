class StudentClass{
  public static void main(String[] args){
    Student s = new Student();
    System.out.println(s.name);
    System.out.println(s.age);
  }
}
class Student{
  String name = "Alice";
  int age = 18;  
}
