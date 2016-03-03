import java.util.*;
public class NStack{
	 public int size=0;
	  public Stack top;
public class Stack{
	
     public Stack next;
 
     public int value;
     public int [] array;

     public Stack(int t){
      array=new int[t];
      next=null;

     }
    
}
    

      public void  pop(){
        
        if(top==null) System.out.println("stack is empty");
        else  {
        	top=top.next;
            size--;
        }
        	
        }
    // add an item to the top
       
    public void push(int v){
      
    	 Stack n_item=new Stack();
    	 n_item.value=v;
    	  n_item.next=top;

    	 top=n_item;
        size++;
       }
    //return top of stack
    public Object peak(){
    	  if(top==null) System.out.println("stack is empty");
    	  return top.value;
    } 
      public Boolean isFull(){
          if (size==this.capacity) return true;
          else return false;
      }

      public static void main(String[] args) {
     NStack ns=new NStack();
      	ns.push(2);
      		ns.push(3);
       System.out.println(ns.isFull());
      			ns.push(5);
      	System.out.println(ns.isFull());
      }
    }