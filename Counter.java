package atomicValitate;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
	private AtomicInteger count = new AtomicInteger();
	
	public Counter() {
		this.count.set(0);
	}
	
	public AtomicInteger getcount() {
		return count;
	}
	
	public void inc() { // not synchronized method
		this.count.incrementAndGet();
	}
	public void dec() { // not synchronized method
		this.count.decrementAndGet();
	}
	
}
