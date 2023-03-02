package exercise5;

import java.util.ArrayList;
import java.util.List;

public class MementoPattern {
	public static void main(String[] args) {

		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();

		originator.setState("Number 1");
		originator.setState("Number2");
		careTaker.add(originator.saveStateToMemento());

		originator.setState("Number3");
		careTaker.add(originator.saveStateToMemento());

		originator.setState("Number4");
		System.out.println("Current State: " + originator.getState());

		originator.getStateFromMemento(careTaker.get(0));
		System.out.println("First saved State: " + originator.getState());
		originator.getStateFromMemento(careTaker.get(1));
		System.out.println("Second saved State: " + originator.getState());
	}
}

class Memento {
	private String state;

	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}
}

class Originator {
	private String state;

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public Memento saveStateToMemento() {
		return new Memento(state);
	}

	public void getStateFromMemento(Memento memento) {
		state = memento.getState();
	}
}

class CareTaker {
	private List<Memento> mementoList = new ArrayList<Memento>();

	public void add(Memento state) {
		mementoList.add(state);
	}

	public Memento get(int index) {
		return mementoList.get(index);
	}
}

//behavioural design pattern
//offers a solution to implement undoable actions
//We can do this by saving the state of an object at a given instant and restoring it if the actions performed since need to be undone.
//we don't expose the internal state of the Originator to the outside world
//As we can see, the Originator can produce and consume a Memento
//However, if the state of the Originator is heavy, using the Memento Design Pattern can lead to an expensive creation process and increased use of memory.
//Memento contains state of an object to be restored.
//it must do without violating encapsulation
//restore the state of an object to its previous state
//this case is useful in case of error and failures
//simplifies the originator
//used in undo and redo operations
//used in database transactions
//stores internal state of the originator object
//two interfaces
//Originator — The object whose internal state we like to store
//Caretaker — The object which knows why and when the Originator needs to save and restore itself
//The classic example of the Memento Pattern is a pseudorandom number generator
