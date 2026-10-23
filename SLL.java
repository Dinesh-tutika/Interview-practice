class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class SingleLL {
    Node head=null,tail=null;
    int size=0;
    void insertFirst(int data){
        Node newNode=new Node(data);
        if (head==null) {
            head=tail=newNode;
        } else {
            newNode.next=head;
            head=newNode;
        }
        size++;
    }

    void deleteFirst(){
        if (head==null) {
            System.out.println("List is empty");
            return;
        }else if (head==tail) {
            head=tail=null;
        } else {
            head=head.next;
        }
        size--;
    }
    void deleteLast(){
        if (head==null) {
            System.out.println("List is empty");
            return;
        }else if (head==tail) {
            head=tail=null;
        } else {
            Node temp=head;
            while (temp.next!=tail) {
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;
        }
        size--;
    }
    void deletePos(int pos){
        if(pos>=size || pos<0){
            System.out.println("Invalid position");
            return;
        }else if(pos==0){
            deleteFirst();
        }else if(pos==size-1){
            deleteLast();
        }else{
            Node temp=head;
            for(int i=0;i<pos;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
    }

    void searchKey(int key){
        Node temp=head;
        int flag=0;
        while (temp!=null) {
            if (temp.data==key) {
                System.out.println("Key found");
                flag=1;
                break;
            }
        }
        if (flag==0) {
            System.out.println("Key not found");
        }
    }
    void display(){
        if (head==null) {
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }

}


public class SLL {
    public static void main(String[] args) {
        SingleLL obj=new SingleLL();
        obj.insertFirst(10);
        obj.insertFirst(20);
        obj.insertFirst(30);
        obj.insertFirst(40);
        obj.insertFirst(50);
        obj.display();
        // obj.deleteFirst();
        // obj.display();
        // obj.deleteLast();
        // obj.display();
        obj.deletePos(3);
        obj.display();
        obj.searchKey(20);
    }
}
