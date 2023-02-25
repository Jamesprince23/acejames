package day4;

public class ExceptionDemo2 {
	public void mth1() {
		mth2();
		System.out.println("caller");
		
	}
	public void mth2() {
		System.exit(0);
		try
		{
			
		}
		catch(Exception e) {
			System.out.println("catch-mth2");
		}
		finally {
			System.out.println("finally-mth2");
		}
	}
		public static void main(String p[]) {
			ExceptionDemo s=new ExceptionDemo();
			s.mth1();
		}

}
