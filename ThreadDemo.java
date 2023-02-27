package day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo {
	public static void main(String[] args) {
		Thread t=new Thread();
		t.start();
		t.start();
	}
	

}
//after finishing the job the thread will get destroyed ,therefore it cannot be started again 
