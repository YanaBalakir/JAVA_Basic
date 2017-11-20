import java.util.Scanner;

public class task_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter count");
		int count = scan.nextInt();
		int i = 0;
		int[] array = new int[count];
		System.out.println("Enter numbers"); 
		for (i = 0; i < count; i++) {
			array[i] = scan.nextInt();
		}

		int chet = 0; // cetnye

		for (i = 0; i < count; i++) {
			if (array[i] % 2 == 0) {
				chet++;
			}
			System.out.println("Chetnyh:" + chet);

			int sum = 0; // summa kratnyh 3

			for (i = 0; i < count; i++) {
				if (array[i] % 3 == 0) {
					sum = sum + array[i];
				}
			}
			System.out.println("Summa kratnyh trem" + sum);

			int mod3 = 0; // Modul <3

			for (i = 0; i < count; i++) {
				if (Math.abs(array[i]) < 3)
					;
				{
					mod3++;
				}
			}
			System.out.println("Modul <3:" + mod3);

		}
	}
}
