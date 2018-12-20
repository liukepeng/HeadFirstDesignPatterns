package chapter12.combining.observer;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
	ArrayList<Quackable> ducks = new ArrayList<Quackable>();
  
	public void add(Quackable duck) {
		ducks.add(duck);
	}
  
	public void quack() {
		Iterator<Quackable> iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = iterator.next();
			duck.quack();
		}
	}
   
	public void registerObserver(Observer observer) {
		Iterator<Quackable> iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = iterator.next();
			duck.registerObserver(observer);
		}
	}
  
	public void notifyObservers() {
		Iterator<Quackable> iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = iterator.next();
			duck.notifyObservers();
		}
	}
  
	public String toString() {
		return "Flock of Ducks";
	}
}
