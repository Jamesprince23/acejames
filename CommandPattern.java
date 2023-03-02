package exercise4;

import java.util.ArrayList;
import java.util.List;

public class CommandPattern {
	public static void main(String[] args) {

		Item biscuitItem = new Item();

		BuyItem buyItemOrder = new BuyItem(biscuitItem);
		SellItem sellItemOrder = new SellItem(biscuitItem);

		Broker broker = new Broker();
		broker.takeOrder(buyItemOrder);
		broker.takeOrder(sellItemOrder);

		broker.placeOrders();
	}

}

interface Order {
	void execute();
}

class Item {

	private String name = "Biscuit";
	private int quantity = 21;

	public void buy() {
		System.out.println("Item [ Name: " + name + ", Quantity: " + quantity + " ] bought");
	}

	public void sell() {
		System.out.println("Item [ Name: " + name + ", Quantity: " + quantity + " ] sold");
	}
}

class BuyItem implements Order {
	private Item biscuitItem;

	public BuyItem(Item biscuitItem) {
		this.biscuitItem = biscuitItem;
	}

	public void execute() {
		biscuitItem.buy();
	}
}

class SellItem implements Order {
	private Item biscuitItem;

	public SellItem(Item biscuitItem) {
		this.biscuitItem = biscuitItem;
	}

	public void execute() {
		biscuitItem.sell();
	}
}

class Broker {

	private List<Order> orderList = new ArrayList<Order>();

	public void takeOrder(Order order) {
		orderList.add(order);
	}

	public void placeOrders() {

		for (Order order : orderList) {
			order.execute();
		}
		orderList.clear();
	}
}
