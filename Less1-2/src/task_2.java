import java.util.Scanner;

public class task_2 {
	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);	
	System.out.println("Введите количество цифр");//Размер массива
	int count = scan.nextInt();
	int i = 0; 
	int[] array = new int [count];
	System.out.println("Введите цифры"); //Значения массива
	for (i = 0; i < count; i++ ) {
		array [i] = scan.nextInt();
	}
		
	int chet = 0; //Четные числа
	
	for (i = 0; i < count; i++) {
		if (array [i]%2 == 0) {
			chet++;
		}
	System.out.println("Четных чисел:" + chet);
		
	int sum = 0; //Сумма кратных трем 
	
	for (i = 0; i < count; i++) {
		if (array [i]%3 == 0) {
			sum = sum + array [i];
		}
	}
	System.out.println("Сумма кратных трем:" + sum);
	
	int mod3 = 0; // Модуль <3
	
	for (i = 0; i < count; i++)	{
		if (Math.abs(array [i]) < 3);{
			mod3++;
		}
	}
	System.out.println("Количетсво чисел, модуль которых <3:" + mod3);

		}
	}
}
