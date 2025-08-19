import java.util.Scanner;

public class TemperatureConversion {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a numeric value: ");
    String input = scanner.nextLine();

    int intValue = Integer.parseInt(input);
    long longValue = Long.parseLong(input);
    float floatValue = Float.parseFloat(input);
    double doubleValue = Double.parseDouble(input);

    System.out.println("int: " + intValue);
    System.out.println("long: " + longValue);
    System.out.println("float: " + floatValue);
    System.out.println("double: " + doubleValue);

    TemperatureConversion obj = new TemperatureConversion();
    System.out.println();
    System.out.println("----Temperature Conversions----");
    System.out.println();
    System.out.println(doubleValue + " C = " + obj.celsiusToFahrenheit(doubleValue) + " F");
    System.out.println(doubleValue + " C = " + obj.celsiusToKelvin(doubleValue) + " K");
    System.out.println(doubleValue + " F = " + obj.fahrenheitToCelsius(doubleValue) + " C");
    System.out.println(doubleValue + " F = " + obj.fahrenheitToKelvin(doubleValue) + " K");
    System.out.println(doubleValue + " K = " + obj.kelvinToCelsius(doubleValue) + " C");
    System.out.println(doubleValue + " K = " + obj.kelvinToFahrenheit(doubleValue) + " F");

    scanner.close();
  }

  public double celsiusToFahrenheit(double c) {
    return c*9/5+32;
  }

  public double celsiusToKelvin(double c) {
    return c+273.15;
  }

  public double fahrenheitToCelsius(double f) {
    return (f-32)*5/9;
  }

  public double fahrenheitToKelvin(double f) {
    return (f-32)*5/9+273.15;
  }

  public double kelvinToCelsius(double k) {
    return k-273.15;
  }

  public double kelvinToFahrenheit(double k) {
    return (k-273.15)*9/5+32;
  }

}
