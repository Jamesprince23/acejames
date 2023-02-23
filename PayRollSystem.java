package day2;
import java.util.Scanner;

import java.time.LocalDate;
class Employee
{
	int CommonSalary=14500;
}
class SalesPerson extends Employee
{
    LocalDate d= LocalDate.of(2023, 01,21);
    int SalesSalary=900;
    int SalesPersonSalary=25000;
    void print()
    {
    	int t=CommonSalary+SalesSalary+SalesPersonSalary;
    	System.out.println("TotalSalary= " + t);
		System.out.println("Joining Date is "+d);
    }

}
class Worker extends Employee
{
	
	LocalDate e= LocalDate.of(2023, 02,05);
	int workerSalary=9000;
	void print()
	{
		int t=CommonSalary+workerSalary;
		System.out.println("TotalSalary= " + t);
		System.out.println("Joining Date is "+e);
	}
}
class SalesManager extends SalesPerson
{
	int ManagerSalary=10000;
	void print()
	{
		int t=SalesSalary+ManagerSalary+CommonSalary;
		System.out.println("TotalSalary= "+t);
		System.out.println("Joining Date is "+d);
	}
}
class SalesTerritoryManager extends SalesManager
{
	int TManagerSalary=5000;
	void print()
	{
		int t=SalesSalary+TManagerSalary+CommonSalary;
		System.out.println("TotalSalary= "+t);
		System.out.println("Joining Date is "+d);
	}
	
}
public class PayRollSystem
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Name :");
	String EmpName=sc.next();
	System.out.println("Select Designition::");
	System.out.println();
	System.out.println("1.Sales Person");
	System.out.println("2.Worker");
	System.out.println("3.Sales Manager");
	System.out.println("4.Sales Territory Manager");
	int choice=sc.nextInt();
	System.out.println("Employee Name: "+EmpName);
	switch(choice)
	{
	case 1:
		System.out.println("Designation: Sales Person");
		SalesPerson sp=new SalesPerson();
		sp.print();
		break;
	case 2:
		System.out.println("Designation: worker");
		Worker w = new Worker();
		w.print();
		break;
	case 3:
		System.out.println("Designation: Sales Manager");
		SalesManager sm = new SalesManager();
		sm.print();
		break;
	case 4:
		System.out.println("Designation: Sales Territory Manager");
		SalesTerritoryManager stm= new SalesTerritoryManager();
		stm.print();
		break;
	}
	
	
	
	
	
}
}


