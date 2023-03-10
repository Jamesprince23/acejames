package exercise7;

import java.util.Scanner;

public class CountCharacters {
	public static void main(String[] args) {
		try(Scanner scanner=new Scanner(System.in)) {
			
			int count=0;
			while(scanner.hasNext()) {
				String line=scanner.nextLine();
				count+=line.length();
			}
			System.out.println("No. of characters entered"+count);
		}
	}

}
