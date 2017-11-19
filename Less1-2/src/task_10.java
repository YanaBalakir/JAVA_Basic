import java.util.Scanner;

public class task_10 {
public static void main (String []args) {
	Scanner scan = new Scanner (System.in);
	
	double x = 0;
	double f = 0; 
	
	System.out.println ("Enter x");
	x= scan.nextDouble();
	
	if (x <= -3) {
		f = 9;
		System.out.println("F(x) = " +f);
	} 
	else if (x > 3) {
	f = 1/(x*x+1);
	System.out.println("F(x) = " +f);
}
}
}
