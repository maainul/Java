package thread.extendsThread;

class MyThread extends Thread {
	@Override
	public void run() {
		Thread curr = Thread.currentThread();
		System.out.println(curr.getName());
	}
}

class MainThread {
	public static void main(String[] args) {

		MyThread myThread = new MyThread();
		myThread.setName("Extended Thread");
		myThread.start();

		String c = Thread.currentThread().getName();
		System.out.println(c);
	}
}
