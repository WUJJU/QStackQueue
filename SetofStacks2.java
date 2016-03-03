import java.util.*;

public class SetofStacks2{



   ArrayList<Stack> stacks=new ArrayList<Stack>();
   public void push(int v){
   	Stack last=getLastStack();
   	if(last!=null&&!last.isFull()){
   		last.push(v);
   	}else{
   		Stack n=new Stack(3);
   		n.push(v);
   		stacks.add(n);
   	}

   }
   public void pop(int i){
   	Stack i_stack=stacks.get(i);
   	if(i_stack==null) throw new EmptyStackException();
   	i_stack.pop();
   	if(i_stack.al.size()==0){
   		stacks.remove(i_stack);
   	}
   }
   public void pop(){
   	Stack last=getLastStack();
   	if(last==null) throw new EmptyStackException();
   	else {
   		last.pop();
        if(last.al.size()==0){
        	stacks.remove(last);
        }
   	}
   }
   public int peak(){
   	Stack last=getLastStack();
   	   	if(last==null) throw new EmptyStackException();
   	else return last.peak();

   }
   public Stack getLastStack(){
   if(stacks.size()==0) return null;
     else
   	return stacks.get(stacks.size()-1);
   }
    
    public static void main(String[] args) {
    	SetofStacks2 sets=new SetofStacks2();
    	sets.push(1);

    	sets.push(2);
    	sets.push(3);
    	sets.push(4);
   
        sets.pop(0);
        sets.pop(0);
        sets.pop(1);
     sets.peak();
    	System.out.println(	sets.peak());
    
    }
}