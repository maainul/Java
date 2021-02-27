package thread.stopAthread._1_Program;

class Display {
	public void wishMessage(String name) 
	{
		for(int i = 0; i < 10; i++) {
			System.out.println("Good Morning" + name);
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			System.out.println(name);
		}
	}
}



class MyThread extends Thread {
	Display d;
	String name;
	
	
	public MyThread(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	@Override
	public void run() {
		d.wishMessage(name);
		
	}
}

public class SynchronizedDemo {
	public static void main(String[] args) {
		Display display = new Display();
	
		MyThread thread1 = new MyThread(display,"Mainul");
		thread1.start();

		MyThread thread2 = new MyThread(display, "Dhoni");
		thread2.start();
	}

}
