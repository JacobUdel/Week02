import java.util.Scanner;
public class Application {
	
	public static void main(String[] args) {
		
		/* System.out.println(2 == 2);
		System.out.println(2 > 5);
		System.out.println(3 <= 5);
		System.out.println(5 <+ 5);
		System.out.println((2 == 2) && (1 < 5));
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(true || false);
		System.out.println(false || false);
		System.out.println(2 == 2 || 2 == 5); 
		*/
		String name = "Tom";
		if (name == "Sam") {
			System.out.println("Hello, Sam");
		} else {
			System.out.println("You are not Sam, " + name);
		}
		
		int age = 15;
		if (age >= 16) {
			System.out.println("You can get a license");
		} else {
			System.out.println("Please wait " + ( 16 - age) + " years");
		}
		
		double costOfMilk = 3;
		if (costOfMilk <= 2) {
			System.out.println("Buy 2");
		} else if (costOfMilk <= 3) {
			System.out.println("Buy 1");
		} else {
			System.out.println("Don't buy milk.");
		}
		
		char grade = 'B';
		switch (grade) {
			case 'A':
				System.out.println("90%");
				break;
			case 'B':
				System.out.println("80%");
				break;
			case 'C':
				System.out.println("70%");
				break;
			case 'D':
				System.out.println("60%");
				break;
			default:
				System.out.println("Fail");
		}
		
		for (int i = 0;i <= 100; i += 2) {
			System.out.println(i);
		}
		for (int i = 0;i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		int x = 0;
		while (x < 10) {
			System.out.println(x);
			x++;
		}
		x = 0;
		do {
			System.out.println(x);
			x++;
		} while (x < 20);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		name = sc.nextLine();
		System.out.println("Welcome " + name);
		int selection = 0;
		double total = 0;
		while (selection != 4) {
		
		System.out.println("Pick an option:");
		System.out.println("1) Candybar $1.99");
		System.out.println("2) Cheese $6.99");
		System.out.println("3) Soccar ball  $12.99");
		System.out.println("4) Checkout");
		selection = sc.nextInt();
		
		
		switch (selection) {
			case 1:
				total += 1.99;
				break;
			case 2:
				total += 6.99;
				break;
			case 3:
				total += 12.99;
				break;
			case 4:
				break;
			default:
				System.out.println("Please pick a valid option.");
		}
		}
		System.out.println("Your total is: " + total);
		
		
	}

}
