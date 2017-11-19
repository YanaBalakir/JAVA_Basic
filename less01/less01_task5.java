package tasks;

import java.util.Scanner; 

public class less01_task5 {
public static void main (String []args) {
	
	Scanner scan = new Scanner (System.in);
	
	System.out.println ("Enter a:");
	System.out.println ("Enter b:");
	System.out.println ("Enter c:");
	System.out.println ("Enter d:");
	
	int a = scan.nextInt();
	int b = scan.nextInt();
	int c = scan.nextInt();
	int d = scan.nextInt();
	
	int sum = 0;
		 
   sum = a+b+c+d; 
   
   System.out.println("Amount = " + sum);
	
}
}
//вычисление суммы четырех слагаемых