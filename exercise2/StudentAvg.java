package day4;
import java.util.Scanner;

public class StudentAvg {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int studentMarks[] = new int[10];
        float avg = 0.0f;
        boolean flag = true;

        while(flag) {
            James:try {
                System.out.println("Enter the marks of 10 student:");
                for(int i=0; i<10; i++) {
                    studentMarks[i] = sc.nextInt();
                    avg += studentMarks[i];
                }
                avg /= 10;
                System.out.println("Average marks of 10 students: "+avg);
            } catch(NumberFormatException e) {
                System.out.println(e);
                break James;
            }
        }
        
    }

}
