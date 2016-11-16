import java.util.*;

class Server implements ServerInterface {
	private ArrayList<Observer> listOfObservers;

	Server(){
		listOfObservers = new ArrayList<>();
	}

	public void subscribe(Observer o){
		if (!listOfObservers.contains(o))
			listOfObservers.add(o);
	}

	public void unsubscribe(Observer o){
		listOfObservers.remove(o);
	}

	public void notifyObservers(){
		for (Observer observer : listOfObservers){
			observer.receiveNotify("Hello World!");
		}
	}
	public void notifyObserver(Observer o){
		o.receiveNotify("Hello World!");
	}

	public void notifyObservers(String message){
		for (Observer observer : listOfObservers){
			observer.receiveNotify(message);
		}
	}

	public void receiveMessage(String message){
		notifyObservers(message);
	}
}