package day4;
import java.util.Scanner;

public class ExceptionDemo3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator, denominator;
        while(true) {
            System.out.println("Enter the numerator:");
            numerator = sc.nextInt();
            System.out.println("Enter the denominator:");
            denominator = sc.nextInt();
            testDivisionOperation(numerator, denominator);
        }
    }

    public static void testDivisionOperation(int numerator, int denominator) {
        try {
            if(denominator == 0)
                throw new ArithmeticException();
            else
                System.out.println("Quotient  - "+((float)numerator/denominator));
        } catch(ArithmeticException exception) {
            System.out.println("Poor input data!");
            System.out.println(exception);
        }
    }

}
