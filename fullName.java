package test;
import java.util.Scanner;
public class Im {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter your first name");
		String first = scanner.nextLine();
		System.out.println("Enter your middle name");
		String middle = scanner.nextLine();
		System.out.println("Enter your last name");
		String last = scanner.nextLine();
		
		String fullName = String.format("%s %s %s", first, middle, last);
		System.out.println(fullName);
		
		
	}

}
