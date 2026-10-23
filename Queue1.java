class Queue {
    Node front=null,rear=null;
    void enQueue(int data){
        Node newNode=new Node(data);
        if(front==null){
            front=rear=newNode;
        }else{
            rear.next=newNode;
            rear=newNode;
        }
    }
    void deQueue(){
        if(front==null){
            System.out.println("Queue is Empty");
        }else if(front==rear){
            front=rear=null;
        }else{
            front=front.next;
        }
    }
    int peek(){
        if(front==null) return -1;
        else return front.data;
    }
    boolean isEmpty(){
        return front==null;
    }
    void display(){
        if(front==rear) System.out.println("Queue is Empty");
        else {
            Node temp=front;
            while (temp!=null) {
                System.out.println(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }
    }
}
