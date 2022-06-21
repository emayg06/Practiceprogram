import java.util.Scanner;
public class Countdown {
	
	public static void countdown(int n) {
		if (n <= 0) {
			System.out.println();
		}
		else {
			System.out.print(n);
			countdown(n - 1);
		}
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		int num;
		System.out.print("Enter the startting number: ");
		num = sc.nextInt();
		countdown(num);
	}
	
	
}
