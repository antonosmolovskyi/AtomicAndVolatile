package atomicValitate;

import java.util.concurrent.atomic.AtomicInteger;

public class VolatileCounter {
	private volatile int count = 0;  // it would not work, because volatile is not about synchronized!!!!1
	
	public int getcount() {
		return count;
	}
	
	public void inc() { 
		this.count++;
	}
	public void dec() { 
		this.count--;
	}
}
