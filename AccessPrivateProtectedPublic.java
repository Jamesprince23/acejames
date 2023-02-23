package day2;

public class AccessPrivateProtectedPublic {
	public static void main(String[] args) {

	}
	}
	class A{
		public int a=9;
		protected String str="jp";
		private float f=7.9f;
		A(){
			System.out.println(a + str+f);
		}
	}
	class B extends A{
		B(){
			System.out.println(a);
		
			System.out.println(str);
		}

}
