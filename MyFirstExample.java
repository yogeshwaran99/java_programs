import java.util.Scanner;

public class MyFirstExample {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		int a = sc.nextInt();
		System.out.println("enter the second number");
		int b = sc.nextInt();				
		int addition = a+b;
		int subtraction = a-b;
		int multiplication = a*b;
		int divide = a/b;
		int modulus = a%b;
		System.out.println("addition is "+addition);
		System.out.println("subtraction is "+subtraction);
		System.out.println("multiplication is "+multiplication);
		System.out.println("divide is "+divide);
		System.out.println("mod is "+modulus);		
		
		System.out.println("enter the first float");		
		float c = sc.nextFloat();
		System.out.println("enter the second float");
		float d = sc.nextFloat();
		float floatSum = c+d;		
		System.out.println("sum of float is "+floatSum);						
		
		sc.nextLine();
		System.out.println("enter the first String");
		String s1= sc.nextLine();
		System.out.println("enter the second String");
		String s2 = sc.nextLine();
		System.out.println("concatenated Strings :"+s1+" "+s2);		
		sc.close();		
	}
}
