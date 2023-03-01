package day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizedAccess {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		Show show = new Show();
		es.execute(() -> {
			show.print("[-----");
		});
		es.execute(() -> {
			show.print("Message");
		});
		es.execute(() -> {
			show.print("-----]");
		});
		es.shutdown();

	}

}

class Show {
	synchronized void print(String s) {
		System.out.print(s);
	}
}
