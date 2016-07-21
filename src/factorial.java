import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);
		
		String choice = "yes";
		
		while( choice.equalsIgnoreCase("yes"))
		{
			
			
			
			
			System.out.println("Welcome Enter an Integer between 1 and 10: ");

			int input = scan1.nextInt();
			scan1.nextLine();
			

			while (input < 1 || input > 10) {
				System.out.println("Invalid number!");
				 input = scan1.nextInt();
				scan1.nextLine();
			}

			System.out.println("The factorial is:");
				factorial(input);
			
			
			
			
			
			
			System.out.println("continue?");
			choice= scan1.nextLine();
		
		}
	}

	public static void factorial(int input) {
		long factorial = 1;
		for (int i = 1; i <= input; i++) {
			factorial = factorial * i;

		}
		System.out.println(factorial);

	}
}
