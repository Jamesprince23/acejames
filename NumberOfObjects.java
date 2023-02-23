package day2;

public class NumberOfObjects {
private static int count;  
	
	public NumberOfObjects()   
	{  
	
	count++;  
	}  
	public static void main(String args[])   
	{  
	 
	NumberOfObjects ob1 = new NumberOfObjects();  
	NumberOfObjects ob2 = new NumberOfObjects();  
	NumberOfObjects ob3 = new NumberOfObjects();  
	NumberOfObjects ob4 = new NumberOfObjects();  
	NumberOfObjects ob5 = new NumberOfObjects();  
	  
	System.out.print("Total Number of Objects: " + NumberOfObjects.count);  
	}  

}
