package day5;
public class ExtendThreadClass {
	public static void main(String[] args) {
		StringBuffer stringBuffer=new StringBuffer("A");
		Threads thread1=new Threads(stringBuffer);
		Threads thread2=new Threads(stringBuffer);
		Threads thread3=new Threads(stringBuffer);
		thread1.start();
		thread2.start();
		thread3.start();		
	}
	
}
class Threads extends Thread{
	StringBuffer stringbuffer1;
	Threads(StringBuffer stringbuffer1){
		this.stringbuffer1=stringbuffer1;
	}
	@Override
	public void run() {
		synchronized(stringbuffer1) {
			for(int i =1;i<=100;i++) {
				System.out.print(stringbuffer1+" ");
			}
			System.out.println();
			int v=stringbuffer1.charAt(0);
			v++;
			stringbuffer1.replace(0, 1, (char)v+"");
			
		}
	}
}
