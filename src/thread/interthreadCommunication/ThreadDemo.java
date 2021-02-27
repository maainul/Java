package thread.interthreadCommunication;

class MYThread extends Thread{
	int total = 0;
	public void run() {
		synchronized (this) {
			System.out.println("Child thread start calculation ");
			for(int i = 0; i <= 100; i++) {
				total = total + i;
			}
			
			System.out.println("Child Thread giving notification to the main");
			this.notify();
			
		}
	}
	
}


public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException{
		MYThread thread = new MYThread();
		thread.start();
		synchronized (thread) {
			System.out.println("Main Thread calling wait");
			thread.wait();
			System.out.println("Main Thread Got notificaiton");
			System.out.println(thread.total);
		}

	}

}
