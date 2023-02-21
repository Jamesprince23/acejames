package review;

public class Day1_2 {
	static byte b;
	static short s;
	static int i;
	static long l;
	static float f;
	static double d;
	static char c;
	static boolean bool;
	public static void main(String[] args) {
		numberType();
		decimalType();
		charType();
		booleanType();
	}
	
	public static void numberType() {
		System.out.println("Default byte value:"+b);
		System.out.println("Default short value:"+s);
		System.out.println("Default int value:"+i);
		System.out.println("Default long value:"+l);
	}
	
	public static void decimalType() {
		System.out.println("Default float value:"+f);
		System.out.println("Default double value:"+d);
	}
	
	public static void charType() {
		System.out.println("Default char value:"+c);
	}
	
	public static void booleanType() {
		System.out.println("Default bool value:"+bool);
	}
}
