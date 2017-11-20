import java.util.Scanner;

public class task_1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a");
		System.out.println("Enter b");
		int a = scan.nextInt();
		int b = scan.nextInt();

		if (a == b) {
			System.out.println("Happy New Year!");
		}

		else {
			System.out.println("Enter c");
		}
		int c = scan.nextInt();
		int sum = a + b + c;
		int kv = a * a + b * b;

		System.out.println(sum);
		System.out.println(kv);
		System.out.println("My favorite footbal team");

	}
}