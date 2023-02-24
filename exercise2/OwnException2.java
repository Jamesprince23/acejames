package day4;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String str) {
		super(str);
	}
}
public class OwnException2 {
	static void validate(int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("age is not valid to drive");
			
		}
		else {
			System.out.println("welcome to drive");
		}
	}
	public static void main(String args[]) {
		validate(14);
		System.out.println("rest of the code");
	}


}
