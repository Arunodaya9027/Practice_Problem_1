import java.util.*;

public class NumInWords{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number (between 0 - 9): ");
		int num = sc.nextInt();
		switch(num){
			case 0:
				System.out.println("Your Number: Zero");
				break;
			case 1:
            System.out.println("Your Number: One");
				break;
			case 2:
            System.out.println("Your Number: Two");
				break;
			case 3:
            System.out.println("Your Number: Three");
				break;
			case 4:
            System.out.println("Your Number: Four");
				break;
			case 5:
            System.out.println("Your Number: Five");
				break;
			case 6:
            System.out.println("Your Number: Six");
				break;
			case 7:
            System.out.println("Your Number: Seven");
				break;
			case 8:
            System.out.println("Your Number: Eight");
				break;
			case 9:
            System.out.println("Your Number: Nine");
				break;	
			default:
				System.out.println("Invalid Input, Try again!");
		}
	}
}
