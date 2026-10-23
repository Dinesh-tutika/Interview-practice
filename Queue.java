public class Queue {
    int size=5;
    int queue[]=new int[size];
    int front=-1,rear=-1;
    void enQueue(int data){
        if(rear==(rear+1)%size){
            System.out.println("Queue is overflow");
        }else if(front==-1){
            front=rear=0;
            queue[rear]=data;   
        }else{
            queue[++rear]=data;
        }
    }
    boolean isEmpty(){
        return front==-1;
    }
    boolean isFull(){
        return rear==(rear+1)%size;
    }
    void display(){
        if(front==-1){
            System.out.println("Queue is underflow");
        }else{
            for (int i = front; ; i=(i+1)%size) {
                System.out.print(queue[i]+" ");
                if(i==rear) break;
            }
            System.out.println();
        }
    }
    void deQueue(){
        if(front==-1){
            System.out.println("Queue is underflow");
        }else if(front==rear){
            front=rear=-1;
        }else{
            front++;
        }
    }
    
    public static void main(String[] args) {
        Queue ob=new Queue();
        ob.enQueue(10);
        ob.enQueue(20);
        ob.enQueue(30);
        ob.enQueue(40);
        ob.enQueue(50);
        ob.display();
        ob.deQueue();
        ob.deQueue();
        ob.display();
    }
}