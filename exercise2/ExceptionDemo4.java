package day4;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionDemo4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator = 0, denominator;
        while(true) {
            System.out.println("Enter the numerator:");
            try {
                numerator = sc.nextInt();
            }  catch(InputMismatchException e) {
                break;
            }
            System.out.println("Enter the denominator:");
            denominator = sc.nextInt();
            testDivisionOperation(numerator, denominator);
        }
    }

    public static void testDivisionOperation(int numerator, int denominator) {
        try {
            if(denominator == 0) {
                throw new ArithmeticException();
            }
            else if(numerator == 'q' || numerator == 'Q') {
                System.exit(0);
            }
            else {
                System.out.println("Quotient  - "+((float)numerator/denominator));
            }
        } catch(ArithmeticException exception) {
            System.out.println("Poor input data!");
            System.out.println(exception);
        }
    }

}
