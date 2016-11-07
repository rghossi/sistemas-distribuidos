class Main {
	public static void main(String[] args){
		Server s = new Server();
		Observer o1 = new Observer("Livinha", s);
		Observer o2 = new Observer("Rodolfo", s);

		s.subscribe(o1);
		s.subscribe(o2);
		// s.notifyObservers();
		o1.sendMessage("Oi lindos");
		o2.sendMessage("E ai guys");
	}
}