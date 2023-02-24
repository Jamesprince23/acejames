package day4;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String str) {
		super(str);
	}
}
public class OwnException {
	static void validate(int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("age is not valid to drive");
			
		}
		else {
			System.out.println("welcome to drive");
		}
	}
	public static void main(String args[]) {
		try {
			validate(14);
		}
		catch(InvalidAgeException ex)
		{
			System.out.println("Caught the exception");
			System.out.println("Exception occured"+ex);
			
		}
		System.out.println("rest of the code");
	}


}
