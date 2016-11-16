import java.io.Serializable;

class Observer implements ClientInterface {
	private String name;
	private Server server;

	Observer(String name, Server server){
		this.name = name;
		this.server = server;
	}

	Observer(String name){
		this.name = name;
	}

	public void receiveNotify(String str){
		System.out.println(name + " received: " + str);
	}

	// public void sendMessage(String message){
	// 	server.receiveMessage(message);
	// }
}