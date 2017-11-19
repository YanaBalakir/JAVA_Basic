import java.util.Scanner;

public class task_4 {
	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);	
	System.out.println("¬ведите количество чисел");//размер массива
	int n = scan.nextInt();
	int i = 0;
	int [] array = new int[n];
	System.out.println("¬ведите числа"); //значени€ массива 
	for (i = 0; i < n; i++ ){
		array [i] = scan.nextInt();
	}
	
	int a = 0; // кол-во чисел > 15 или < 2
	int sum = 0; // сумма чисел, которые дел€тс€ на 5 с остатком 4 
	
	for (i = 0; i < n; i++){
		if ((array [i] > 15) || (array [i] < 2)) 
			a++;
	}
	
	System.out.println("кол-во чисел > 15 или < 2:" +a);
	
	for (i = 0; i < n; i++){
	if (array [i]%5 == 4);
	sum = sum+array[i];
	}
	System.out.println("сумма чисел, которые дел€тс€ на 5 с остатком 4:" +sum);
}
}