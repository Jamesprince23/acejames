package day2;

public class ChangeStateOfObject {
	public static void main(String[] args) {
		final finalobj fb=new finalobj("james",10);
		fb.str="jp";
		}

	}
	class finalobj{
		String str;
		finalobj(String name,int a){
			System.out.print(name);
			System.out.println(a);	
		}

}
