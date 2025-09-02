class StudentEn{
  public static void main(String[] args){
    Student s = new Student();
    s.setRollNumber(23);
    s.setName("nick");
    s.setMarks(99);
    System.out.println("Student roll number "+s.getRollnumber());
    System.out.println("Student name "+s.getName());
    System.out.println("Student marks "+s.getMarks());
  }
}
class Student{
  private int rollNumber;
  private String name;
  private int marks;

  public void setRollNumber(int rollNumber){
    this.rollNumber = rollNumber;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setMarks(int marks){
    if(marks>0){
      this.marks = marks;
    }    
  }
  public int getRollnumber(){
    return rollNumber;
  }
  public String getName(){
    return name;    
  }
  public int getMarks(){
    return marks;
  }
}
