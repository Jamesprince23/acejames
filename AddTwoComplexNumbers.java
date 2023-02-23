package day2;

public class AddTwoComplexNumbers {
	
	public static void main(String[] args) {
		compAdd c1=new compAdd(12.4f,32.4f);
		compAdd c2=new compAdd(64.5f,09.8f);
		c1.add(c2);
	}
	}
class compAdd
	{
	float r,i;
	compAdd(float a,float b)
	{
		r=a;
		i=b;
	}
	void add(compAdd c)
	{
		float real=c.r+r;
		float img=c.i+i;
		System.out.println(real+ "+i" +img);
		}

}

