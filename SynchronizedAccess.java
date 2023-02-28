package day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizedAccess {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		Show show=new Show();
		es.execute(()->{
			show.Show("[-----");
		});
		es.execute(()->{
			show.Show("Message");
		});
		es.execute(()->{
			show.Show("-----]");
		});
		es.shutdown();
		
	}

}
class Show{
	void Show(String s) {
		System.out.print(s);
	}
}
