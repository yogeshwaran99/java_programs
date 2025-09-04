public class BookConstructor {

  public static void main(String[] args) {
    Book b1 = new Book();
    System.out.println();
    Book b2 = new Book("Law of Attraction");
    System.out.println("Boot title "+b2.title);
    System.out.println();
    Book b3 = new Book("Crime and Punishment", "Dostoyevsky");
    System.out.println("Book title "+b3.title+" author "+b3.author);
   
  }
}
class Book{
   
  String title;
  String author;

  public Book(){
    System.out.println("Default Constructor from Book");
  }

  public Book(String title){
    this.title=title;
    System.out.println("Constructor with one parameter");
  }
  public Book(String title, String author){
    this.title = title;
    this.author = author;
    System.out.println("Constructor with two parameter");
  }
}
