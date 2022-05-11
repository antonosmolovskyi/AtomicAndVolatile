package atomicValitate;

public class MainChest {

	public static void main(String[] args) {
		Chest chest = new Chest(100);
		Player player1 = new Player("Oleg");
		Player player2 = new Player("Ivan");
		Player player3 = new Player("Andrij");

		Thread t1 = new Thread(new Runnable()  {
			@Override
			public void run() {
				chest.withDraw(50, player1);
				
			}
		});
		Thread t2 = new Thread(new Runnable()  {
			@Override
			public void run() {
				chest.withDraw(50, player2);
				
			}
		});
		Thread t3 = new Thread(new Runnable()  {
			@Override
			public void run() {
				chest.withDraw(50, player3);
				
			}
		});
		try {
			t1.start();
			t2.start();
			t3.start();
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		chest.info();
	}

}
