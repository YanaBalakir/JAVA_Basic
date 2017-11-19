import java.util.Random;



public class task_6 {
	public static void main (String []args) {
	
			
		int a = 2;
		int b = 3;
		int c = 6; 
		int d = 4;
		
		double x1 = (b + Math.sqrt(b*b+4*a*c)% 2 * a - (Math.pow(a,3)*c + b));
		double x2 = (a%c)*(b%d) - (a*b-c)% (c*d);
		System.out.println("Result 1:" + x1);
		System.out.println("Result 2:" + x2);
	}

}
