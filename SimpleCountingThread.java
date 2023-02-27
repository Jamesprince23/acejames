package day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleCountingThread {
	static int count=0;
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(()->{
			for(int i=1;i<101;i++) {
				System.out.println(i);
				try{
					Thread.sleep(1000);
					count++;
				}catch(Exception e) {}
				if(count%10==0) {
					System.out.println("reached");
				}
						
		
		}
		});
	}

}
