package dataStructureAndAlgorithms.Queue.CircularQueue;

public class Main {
    public static void main(String args[]){
        Queue queue = new Queue();
        queue.enqueue(8);
        queue.enqueue(3);
        queue.enqueue(7);
        queue.enqueue(68);
        queue.enqueue(39);
       // queue.enqueue(7);
        queue.show();
        System.out.println("size : "+queue.getSize());
		/*
		 * queue.dequeue(); queue.show(); queue.dequeue(); queue.show();
		 * queue.dequeue(); queue.show(); queue.dequeue(); queue.show();
		 * queue.dequeue(); queue.show(); queue.dequeue(); queue.show();
		 */
    }
}
// 8---->3---->7---->68---->39---->
// size : 5