package dk.navicon.binpack.logging;

public class Logger<T> {
	
	private T owner;
	
	public Logger(T owner) {
		this.owner = owner;
	}
	
	public void debug(Object message) {
		System.out.println(owner.toString()+ " :" + message.toString());
	}
}
