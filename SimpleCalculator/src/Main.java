import java.util.Scanner;

/**
 * A simple CLI calculator application with some validation of the input
 *
 * @author Wil K Edwards
 */
public class Main {

	public static void main(String[] args) {
		Double firstNumber;
		Double secondNumber;
		Double result = null;
		char operation;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number");
		firstNumber = sc.nextDouble();

		System.out.println("Enter an operator");
		operation = sc.next().charAt(0);

		System.out.println("Enter the next number");
		secondNumber = sc.nextDouble();

		sc.close();
		switch (operation) {
			case '+':
				result = firstNumber + secondNumber;
				break;
			case '-':
				result = firstNumber - secondNumber;
				break;
			case '/':
				if (secondNumber != 0) {
					result = firstNumber / secondNumber;
				} else {
					System.out.println("ERROR! Cannot divide by 0");
				}
				break;
			case '*':
			case 'x':
				result = firstNumber * secondNumber;
				break;
			default:
				System.out.println("ERROR! Invalid input");
				break;
		}

		if (result != null) {
			System.out.print(firstNumber + " " + operation + " " + secondNumber + " = " + result);
		}
	}
}
