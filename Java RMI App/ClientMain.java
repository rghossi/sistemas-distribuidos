import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientMain {

    public static void main(String[] args) {
        String host = (args.length < 1) ? null : args[0];
        try {
            Registry registry = LocateRegistry.getRegistry(host);
            ServerInterface stub = (ServerInterface) registry.lookup("Hello");
            Observer observer = new Observer("Observer");
            stub.subscribe(observer);
            // stub.notifyObservers();
            stub.notifyObserver(observer);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}