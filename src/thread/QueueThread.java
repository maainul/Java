package thread;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueThread {
	

	public static void main(String[] args) throws InterruptedException {
		
		LinkedBlockingQueue<Thread> queue = new LinkedBlockingQueue<>();

		Thread thread1 = new Thread(new Mainul());
		Thread thread2 = new Thread(new Mainul());
		
		queue.add(thread1);
		queue.add(thread2);
		
	
		for (; ; ) {
			Thread  pollThread = queue.take();
			System.out.println(pollThread.getName());
		    pollThread.start();
		}
		
		
		
		
		
		
		
		
		//System.out.println(queue.size());
		
		//List<Thread> queue = new LinkedList<>();
		//ArrayList<Thread> queue = new LinkedList<>();
		//for (;;) {
			//System.out.println("j");
		//}
		//thread1.setName("abdullah");
				//thread2.setName("kamrul");
		//System.out.println(queue);
		
		//int removeElement = queue.remove();
		//System.out.println("Remove element "+removeElement);
		
		//System.out.println(queue);
		
		//int head = queue.peek();
		//System.out.println("Head of queue "+head);

	}

}
