package Tasks;

import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		int reverse = 0;
		int temp = num;
		
		while(num > 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;
		}
		if(temp == reverse) {
			System.out.println(reverse + " is Palindrom");
		}
		else {
			System.out.println(reverse + " is not Palindrome");
		}
	}

}
