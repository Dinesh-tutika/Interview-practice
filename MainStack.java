import java.util.*;
class Stack{
    int size;
    int[] stack;
    int top=-1;
    Stack(int size){
        this.size=size;
        stack=new int[size];
    }
    void push(int data){
        if(top==size-1) System.out.println("Stack is overFlow");
        else stack[++top]=data;
    }
    int pop(){
        if(top==-1 ) {
            System.out.println("Stack is UnderFlow");
            return -1;
        }else {
            int a=stack[top];
            top--;
            return a;
        }
    }
    int peek(){
        if(top==-1) return -1;
        else return stack[top];
    }
    boolean isEmpty(){
        return top==-1;
    }
    boolean isFull(){
        return top==size-1;
    }
    
    void display(){
        if(top==-1 ) System.out.println("Stack is UnderFlow");
        else {
            for(int i=top;i>=0;i--){
                System.out.print(stack[i]+" ");
            }
            System.out.println();
        }
    }
}
public class MainStack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Stack s= new Stack(n);

        // Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(60);
        s.display();
        System.out.println(s.pop());
        s.display();
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        System.out.println(s.isFull());

    }
}