package atomicValitate;

public class TestVolatile extends Thread {
	volatile boolean keepRunning = true;

	
	@Override
	public void run() {
		long counter = 0;
		while (keepRunning) {
			counter++;
		}
		
		System.out.println("Thread is terminated : " + counter);
		
		
	}
	public static void main(String[] args) {
		TestVolatile test = new TestVolatile();
		test.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main is sleeping");
		test.keepRunning = false;
		try {
			test.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("In our variable has been change" + test.keepRunning);
	}
}
