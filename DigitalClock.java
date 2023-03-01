package day5;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class DigitalClock {
	public static void main(String[] args) {
		Clock clock=new Clock();
		ExecutorService executorService=Executors.newFixedThreadPool(3);
		executorService.execute(()->{
			clock.getHours();
			
		});
		executorService.execute(()->{
			clock.getMinutes();
		});
		executorService.execute(()->{
			clock.getSeconds();
		});
		executorService.shutdown();
		}

}
class Clock{
	int hour;
	int minute;
	int second;
	
	void getHours()
	{
		while(true)
		{
			Date date=new Date();
			hour=date.getHours();
			
		}
		
	}
	void getMinutes()
	{
		while(true)
		{
			Date date=new Date();
			minute=date.getMinutes();
		}
		
	}
	void getSeconds()
	{
		while(true)
		{
			Date date=new Date();
			second=date.getSeconds();
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println(hour+":"+minute+":"+second);
			}
		}
	
	}

