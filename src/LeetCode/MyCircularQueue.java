package LeetCode;

import java.util.List;

public class MyCircularQueue {

    private int size;
    private int[] list;
    private int front;
    private int rear;

    /**
     * Initialize your data structure here. Set the size of the queue to be k.
     */
    public MyCircularQueue(int k) {
        this.size = k;
        this.list = new int[k];
        this.front = -1;
        this.rear = -1;
    }

    public static void main (String args[]){
        MyCircularQueue circularQueue  = new MyCircularQueue(3);
        circularQueue.enQueue(1);  // 返回 true

        circularQueue.enQueue(2);  // 返回 true

        circularQueue.enQueue(3);  // 返回 true

        circularQueue.enQueue(4);  // 返回 false，队列已满

        circularQueue.Rear();  // 返回 3

        circularQueue.isFull();  // 返回 true

        circularQueue.deQueue();  // 返回 true

        circularQueue.enQueue(4);  // 返回 true

        circularQueue.Rear();  // 返回 4
    }

    /**
     * Insert an element into the circular queue. Return true if the operation is successful.
     */
    public boolean enQueue(int value) {
        if(this.isEmpty()){
            this.list[0] = value;
            this.front = 0;
            this.rear = 0;
        }else{
            if(!this.isFull()){
                this.rear = this.rear + 1 < size ? this.rear + 1 : 0;
                this.list[this.rear] = value;
                return true;
            }else{
                return false;
            }
        }
        return true;
    }

    /**
     * Delete an element from the circular queue. Return true if the operation is successful.
     */
    public boolean deQueue() {
        if(this.isEmpty()) return false;
        this.list[this.front] = 0;
        if(this.front == this.rear) {
            this.front = -1;
            this.rear = -1;
        }else{
            this.front = this.front + 1 < size ? this.front + 1 : 0;
//            if(this.front == this.rear) {
//                this.front = -1;
//                this.rear = -1;
//            }
        }
        return true;
    }

    /**
     * Get the front item from the queue.
     */
    public int Front() {
        if (this.isEmpty()) {
            return -1;
        } else {
            return this.list[this.front];
        }
    }

    /**
     * Get the last item from the queue.
     */
    public int Rear() {
        if (this.isEmpty()) {
            return -1;
        } else {
            return this.list[this.rear];
        }
    }

    /**
     * Checks whether the circular queue is empty or not.
     */
    public boolean isEmpty() {
        return this.front == -1;
    }

    /**
     * Checks whether the circular queue is full or not.
     */
    public boolean isFull() {
        return (this.rear + 1) % size == this.front;
    }
}
