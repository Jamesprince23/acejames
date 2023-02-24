package day4;
import java.util.Scanner;

public class ExceptionDemo6 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int studentMarks[] = new int[10];
        float avg = 0.0f;
        boolean flag = true;

        while(flag) {
            BACK:try {
                System.out.println("Enter the marks of 10 student:");
                for(int i=0; i<10; i++) {
                    studentMarks[i] = sc.nextInt();
                    if(studentMarks[i] < 0)
                        throw new NegativeNumberException("The number is less than zero, it is unacceptable!");
                    else if(studentMarks[i] > 100)
                        throw new OutOfMarksRangeException("The number doesn't belong to the range (1-100) heance, it is unacceptable!");
                    avg += studentMarks[i];
                }
                avg /= 10;
                System.out.println("Average marks of 10 students: "+avg);
            } catch(NumberFormatException e) {
                System.out.println(e);
                break BACK;
            } catch(NegativeNumberException e) {
                System.out.println(e);
                break BACK;
            } catch(OutOfMarksRangeException e) {
                System.out.println(e);
                break BACK;
            }
        }
        sc.close();
    }
}

class NegativeNumberException extends Exception {
    String msg;

    NegativeNumberException(String msg) {
        super(msg);
        this.msg = msg;
    }
}

class OutOfMarksRangeException extends Exception {
    String msg;

    OutOfMarksRangeException(String msg) {
        super(msg);
        this.msg = msg;
    }

}
