package thread.synchronizedBlock;

class Display{
	public void wish(String name) {
		// 1 lack of code
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				System.out.println("Good Morning..."+ name);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					System.out.println(name);
				}
			}
		}
		// 1 lack of code
	}
}

class MyThread extends Thread{
	Display d;
	String name;
	
	public MyThread(Display d, String name) {
		this.d = d;
		this.name = name;
	}
	@Override public void run() {
		d.wish(name);
		
	}
}


public class SyncBlockDemo {

	public static void main(String[] args) {
		
		MyThread thread1 = new MyThread(new Display(), "Dhoni");
		thread1.start();
		
		MyThread thread2 = new MyThread(new Display(), "Yuvraj");
		thread2.start();
		

	}

}
