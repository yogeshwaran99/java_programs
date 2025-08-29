import java.util.Scanner;

enum Light{
  Red, Yellow, Green, invalid;
}

public class TrafficLight {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the signal (stop,wait,go)");
    String signal = s.nextLine();
    Light l;
    switch (signal) {
      case "stop": l= Light.Red; break;
      case "wait": l= Light.Yellow; break;
      case "go" : l= Light.Green; break;
      default: l=Light.invalid; break;
    }
    System.out.println("signal color is "+l);
    s.close();
  }
}
