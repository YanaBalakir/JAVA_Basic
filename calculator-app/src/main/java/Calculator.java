import java.util.Scanner;

public class Calculator {
    static Scanner sc = new Scanner(System.in);

    public static double getNumber() {
        System.out.println("Enter number:");
        double x;
        if (sc.hasNextDouble()) {
            x = sc.nextDouble();
        } else {
            System.out.println("Please enter another number!");
            sc.next();
            x = getNumber();
        }
        return x;
    }

    public static char getOperation() {
        System.out.println("Choose operation(+,-,*,/) : ");
        char operation;
        if (sc.hasNext()) {
            operation = sc.next().charAt(0);
        } else {
            System.out.println("Invalid operation! Please enter another operation:");
            sc.next();
            operation = getOperation();
        }
        return operation;
    }

    public static double calculation(double x, double y, char operation) {
        double result;
        switch (operation) {
            case '+':
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '*':
                result = x * y;
                break;
            case '/':
                result = x / y;
                break;
            default:
                System.out.println("Invalid operation! Please enter another operation:");
                result = calculation(x,y, getOperation());
        }
        return result;
    }

    public static void main (String [] args){
        double x = getNumber();
        double y = getNumber();
        char operation = getOperation();
        double result = calculation (x,y,operation);
        System.out.println("Result = " + result);
    }
}