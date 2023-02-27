package day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizedAccess {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		Show d=new Show();
		es.execute(()->{
			d.Show("[-----");
		});
		es.execute(()->{
			d.Show("Message");
		});
		es.execute(()->{
			d.Show("-----]");
		});
		es.shutdown();
		
	}

}
class Show{
	void Show(String s) {
		System.out.print(s);
	}
}
