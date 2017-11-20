import java.util.Scanner;

public class task_7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a");
		int a = scan.nextInt();

		if (a >= 0) {
			int a1 = a * a;
			System.out.println("Квадрат положительного числа" + a + " = " + a1);
		} else {
			double a2 = Math.pow(a, 4);
			System.out.println("Четвертая степень отрицательного числа" + a + "=" + a2);
		}

		System.out.println("Please enter b");
		int b = scan.nextInt();

		if (b >= 0) {
			int b1 = b * b;
			System.out.println("Квадрат положительного числа" + b + " = " + b1);
		} else {
			double b2 = Math.pow(b, 4);
			System.out.println("Четвертая степень отрицательного числа" + b + "=" + b2);
		}

		System.out.println("Please enter c");
		int c = scan.nextInt();

		if (c >= 0) {
			int c1 = c * c;
			System.out.println("Квадрат положительного числа" + c + " = " + c1);
		} else {
			double c2 = Math.pow(c, 4);
			System.out.println("Четвертая степень отрицательного числа" + c + "=" + c2);
		}
	}

}
