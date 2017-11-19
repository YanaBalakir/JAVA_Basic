package tasks;

import java.util.Scanner;

public class less01_task6 {
public static void main (String []args) {
Scanner scan = new Scanner (System.in);
	
	System.out.println ("Enter a:");
	System.out.println ("Enter b:");
	System.out.println ("Enter c:");
		
	int a = scan.nextInt();
	int b = scan.nextInt();
	int c = scan.nextInt();
	double result = 0; 
	
	result = a*a - (b-c)*(b-c)+ Math.log(b*b - 1);
	
			
	System.out.println ("Result = " + result);
	
}
}
//ѕрограмма запрашивает у пользовател€ a,b,c ,вычислить значение выражени€ 
