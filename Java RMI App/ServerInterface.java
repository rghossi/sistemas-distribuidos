import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServerInterface extends Remote {
	void notifyObserver(Observer o) throws RemoteException;
    void notifyObservers() throws RemoteException;
    void subscribe(Observer o) throws RemoteException;
    void unsubscribe(Observer o) throws RemoteException;
}