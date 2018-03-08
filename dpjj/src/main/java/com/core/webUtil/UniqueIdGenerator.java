package main.java.com.core.webUtil;

public class UniqueIdGenerator {
	
	private static final UniqueIdGenerator generator = new UniqueIdGenerator(); 
	
	public static UniqueIdGenerator getInstant(){
		return generator;
	}
	
	public String getUniqueId(){
		Thread thread = Thread.currentThread();
		Long id = thread.getId();
		return id+""+System.currentTimeMillis();
	}
}
