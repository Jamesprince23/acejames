package day5;
public class ExtendThreadClass {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("A");
		Threads t1=new Threads(sb);
		Threads t2=new Threads(sb);
		Threads t3=new Threads(sb);
		t1.start();
		t2.start();
		t3.start();		
	}
	
}
class Threads extends Thread{
	StringBuffer sbr;
	Threads(StringBuffer sbr){
		this.sbr=sbr;
	}
	@Override
	public void run() {
		synchronized(sbr) {
			for(int i =1;i<=100;i++) {
				System.out.print(sbr+" ");
			}
			System.out.println();
			int v=sbr.charAt(0);
			v++;
			sbr.replace(0, 1, (char)v+"");
			
		}
	}
}
