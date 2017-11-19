import java.util.Scanner;
import java.util.Random;

public class task_3 {
	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);	
	System.out.println("Enter count of numbers");//размер массива
	int n = scan.nextInt();
	int i = 0;
	
	// массив вещественных чисел 
	double[] array = new double[n];
	Random rand = new Random ();
			for (i = 0; i < n; i++ ) {
		array [i] = rand.nextDouble();
		System.out.println("Real number :" + array [i]+"");
		
		// усекаем вещественные числа 
		array [i] *= 100;
		array [i] = (int) array [i];
		System.out.println("Integer : " + array [i]+"");
			}
		
		 //количество четных чисел 
		
		int a = 0; 
		for (i=0;i<n;i++) {
		if (array [i]%2 == 0){
			a++;
		}
		}
		
		System.out.println("Total - even numbers : " +a);
		
		// кол - во чисел > 15
		
		int b = 0;
		for (i=0;i<n;i++) {
		if (array [i] > 15) {
			b++;
		}
		}
		System.out.println("Total - numbers > 15: " +b);	
		
	}
		
}
		
		
			
	
