package day5;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class DigitalClock {
	public static void main(String[] args) {
		Clock c=new Clock();
		ExecutorService es=Executors.newFixedThreadPool(3);
		es.execute(()->{
			c.hours();
			
		});
		es.execute(()->{
			c.mins();
		});
		es.execute(()->{
			c.secs();
		});
		es.shutdown();
		}

}
class Clock{
	int hrs;
	int min;
	int sec;
	
	void hours() {
		while(true) {
			Date d=new Date();
			hrs=d.getHours();
			
		}
		
	}
	void mins() {
		while(true) {
			Date d=new Date();
			min=d.getMinutes();
		}
		
	}
	void secs() {
		while(true) {
			Date d=new Date();
			sec=d.getSeconds();
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			System.out.println(hrs+":"+min+":"+sec);
			}
		}
	
	}

