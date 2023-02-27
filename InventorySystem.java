package day5;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class InventorySystem {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		Shop item=new Shop();
		es.execute(()->{
			for(int i=0;i<10;i++) {
				item.producer();
			}
		});
		es.execute(()->{
			for(int i=0;i<10;i++) {
				item.consumer();
			}
		});
		es.shutdown();
	}
}
class Shop{
	int count=0;
	synchronized public void producer() {
		if(count==1) {
			try{wait();}catch(Exception e) {}
		}
		System.out.println("add one product.....");
		count=1;
		notify();
	}
	
	synchronized public void consumer() {
		if(count==0) {
			try{wait();}catch(Exception e) {}
		}
		System.out.println("give one product.....");
		count=0;
		notify();
	}}
