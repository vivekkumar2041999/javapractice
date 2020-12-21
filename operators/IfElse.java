package operators;
import java.util.Scanner;


public class IfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of petals = ");
		int NoOfPetals = sc.nextInt();
		if (NoOfPetals%2==0) {
			System.out.println("He Loves me");
		}
		else {
			System.out.println("He loves me not");
		}

	}

}
