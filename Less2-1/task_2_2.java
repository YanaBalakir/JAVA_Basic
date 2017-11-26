/*Решите задачу, находящую сумму и произведение двух чисел, код которой приведен
ниже, с использованием методов. */

package tasks;

import java.util.Scanner;

public class task_2_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		System.out.println("Enter a");

		while (!sc.hasNextInt()) {
			sc.next();
		}

		a = sc.nextInt();

		System.out.println("Enter b");
		while (!sc.hasNextInt()) {
			sc.next();
		}

		b = sc.nextInt();

	}

	public int summa(int a, int b) {

		int x;
		return x = a + b;

	}

	public int proizvedenie(int a, int b) {
		int y;
		return y = a * b;
	}

}
