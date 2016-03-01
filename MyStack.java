import java.util.*;

public class MyStack{
    
    public class Stack{
     public Stack next;
     public Object value;

     public Stack(Object b){
      value=b;
      next=null;

     }
    }
    public Stack top;
    //remove the top item in stack
    public void  pop(){
        
        if(top==null) System.out.println("stack is empty");
        else  top=top.next;
        	
        }
    // add an item to the top
       
    public void push(Object ob){
    	 Stack n_item=new Stack(ob);
    	n_item.next=top;
    	top=n_item;
       }
    //return top of stack
    public Object peak(){
    	  if(top==null) System.out.println("stack is empty");
    	  return top.value;
    }

    public static void main(String[] args) {
        MyStack mystack=new MyStack();
        MyStack mystack2=new MyStack();
        mystack.push(3);
        mystack.push("hello");
        //mystack2.push("hello");
       System.out.print(mystack.peak()); 
       mystack.pop();
       System.out.print(mystack.peak());
    }

}