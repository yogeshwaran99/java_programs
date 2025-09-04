public class StudentConstructor {

  public static void main(String[] args) {
    Student s = new Student("Nick", 20);
    System.out.println("Student name "+s.name);
    System.out.println("Student age "+s.age);
  }
}

class Student{
    String name;
    int age;
    
    public Student(String name, int age){
      this.name = name;
      this.age= age;
    }
}

