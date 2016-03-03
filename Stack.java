import java.util.*;

public class Stack{


    public  ArrayList<Integer> al;
    public int capacity;
	public Stack(int t){
     al=new ArrayList<Integer>();
    capacity=t;
	}
	public void push(int v){
		if(al.size()==capacity) throw new NullPointerException();
        al.add(v);
	}
	public int peak(){
		return al.get(al.size()-1);
	}
	public void pop(){
		if(al.size()==0) throw new  EmptyStackException();
		al.remove(al.size()-1);
	}

	public static void main(String[] args) {
		Stack st=new Stack(3);
		st.push(1);
		st.push(2);
		st.push(3);
		st.pop();
		System.out.println(
		st.peak()
			);


	}
}