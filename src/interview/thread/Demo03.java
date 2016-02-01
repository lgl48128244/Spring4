package interview.thread;

public class Demo03 implements Runnable {
	int ticketCount = 50;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			if (ticketCount <= 0) {
				break;
			}
			System.out.println(Thread.currentThread().getName() + "\t" + ticketCount--);
		}
	}

	public static void main(String[] args) {
		Demo03 demon03 = new Demo03();
		Thread thread = new Thread(demon03, "张三");
		Thread thread2 = new Thread(demon03, "李四");
		Thread thread3 = new Thread(demon03, "王五");
		thread.start();
		thread2.start();
		thread3.start();
	}
}
