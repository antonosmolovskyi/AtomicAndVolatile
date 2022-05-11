package atomicValitate;

public class Chest {
	private int money = 0;
	public Chest(int money) {
		this.money = money;
	}
	
	public synchronized void withDraw(int amount, Player player) {
		if(money >= amount) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			money -= amount;
			System.out.println("Money has been taken : " + amount + ", by " + player.getName());
		} else {
			System.out.println(player.getName() + ", ther is not enought gold!");
		}
	}
	
	public void info() {
		System.out.println("Chest gold : " + money);
	}
	
	
}
