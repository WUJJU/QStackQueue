import java.util.*;

public class StackMin{

    public class Stack{

     public Stack next;
     public int value;
     public int min=Integer.MAX_VALUE;
     public Stack(){

     }

     public Stack(int b){
      value=b;
      next=null;
    
     }
    }
    public Stack top=new Stack();
    //remove the top item in stack
    public void  pop(){
        
        if(top==null) System.out.println("stack is empty");
        else  top=top.next;
        	
        }
    // add an item to the top
       
    public void push(int ob){

    	Stack n_item=new Stack(ob);

    	n_item.next=top;
     

     //associate min with top
        if(ob<top.min) n_item.min=ob;
        else n_item.min=top.min;

    	top=n_item;

        
       }
    //return top of stack
    public int peak(){
    	  if(top==null) System.out.println("stack is empty");
    	  return top.value;
    }

    public int min(){
        return top.min;
    }

    public static void main(String[] args) {
        StackMin mystack=new StackMin();
        mystack.push(5);
          System.out.println(mystack.min()); 
        mystack.push(6);
          System.out.println(mystack.min()); 
        mystack.push(3);
          System.out.println(mystack.min()); 
        mystack.push(7);
        
        //mystack2.push("hello");
     
     mystack.pop();
     mystack.pop();
    System.out.println(mystack.min());
    }

}