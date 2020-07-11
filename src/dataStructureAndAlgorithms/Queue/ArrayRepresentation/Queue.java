package dataStructureAndAlgorithms.Queue.ArrayRepresentation;

public class Queue {
    private int queue[] = new int[5];
    int rear;
    int front;
    int size;

    public void enqueue(int data){
        if(isFull()){
            System.out.println("Array is full... you cann't add more than 5 elements.. I am showing first 5 elements");
        }
        else {
            queue[rear] = data;
            rear++;
            size++;
        }

    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("There is no element in the array...Please add some value in the queue..");
        }

            // first pick data in the data variable..
            // then update front +1 ....
            // decrease the size
            // return data;
            int data = queue[front];
            front++;
            size--;
            return data;
    }

    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size == 5;
    }


    public void show(){
        for (int i = 0; i<size; i++){
            System.out.print(queue[front+i]+"---->");
        }
    }
}
