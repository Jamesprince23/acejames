package day5;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class InventorySystem {
	public static void main(String[] args) {
		ExecutorService executorService=Executors.newFixedThreadPool(2);
		Shop shop=new Shop();
		executorService.execute(()->{
			for(int i=0;i<10;i++) {
				shop.produce();
			}
		});
		executorService.execute(()->{
			for(int i=0;i<10;i++) {
				shop.consume();
			}
		});
		executorService.shutdown();
	}
}
class Shop{
	int count=0;
	synchronized public void produce() {
		if(count==1) {
			try{wait();}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("add one product.....");
		count=1;
		notify();
	}
	
	synchronized public void consume() {
		if(count==0) {
			try{wait();}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("give one product.....");
		count=0;
		notify();
	}
}
