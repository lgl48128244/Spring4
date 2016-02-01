package interview.thread;

public class Demo02 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			System.out.println("Demon02.run()" + i);

		}
	}

	public static void main(String[] args) {
		Demo02 demon02 = new Demo02();
		Demo002 demo002 = new Demo002();
		Thread thread1 = new Thread(demon02);
		Thread thread2 = new Thread(demo002);
		thread1.start();
		thread2.start();
	}
}

class Demo002 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			System.out.println("Demo002.run()" + i);
		}
	}
}