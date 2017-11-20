import java.util.Scanner;

public class task_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n");// количетсво чисел = размер массива
		int n = scan.nextInt();
		int i = 0;
		int[] array = new int[n];
		System.out.println("Enter numbers"); // элемены массива
		for (i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}

		int a = 0; // числа > 15 и < 2
		int sum = 0; // сумма чисел, которые делятся на 5 с остатком 4

		for (i = 0; i < n; i++) {
			if ((array[i] > 15) || (array[i] < 2))
				a++;
		}

		System.out.println("Количетсво чисел > 15 и < 2:" + a);

		for (i = 0; i < n; i++) {
			if (array[i] % 5 == 4)
				;
			sum = sum + array[i];
		}
		System.out.println("Сумма чисел, которые делятся на 5 с остатком 4:" + sum);
	}
}
