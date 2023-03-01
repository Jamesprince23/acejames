package day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OddEven {
	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(() -> {

			for (int i = 1; i < 100; i = i + 2) {
				System.out.println(i);
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		executorService.execute(() -> {
			for (int i = 2; i <= 100; i = i + 2) {
				System.out.println(i);
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		executorService.shutdown();

	}

}
