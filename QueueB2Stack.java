import java.util.*;
public class QueueB2Stack{



	Stack s1=new Stack(10);
	Stack s2=new Stack(10);

	public void add(int v){

		s1.push(v);
	}
	public void remove(){
		if(isEmpty()) throw new EmptyStackException();
		else if(s2.al.size()==0&&s1.al.size()!=0) {
			while(s1.al.size()!=0){
				int temp=s1.peak();
			    s2.push(temp);
				s1.pop();
			}
			s2.pop();
			
		} else{
			s2.pop();
		}
	}

	public int peak(){
		if(isEmpty()) throw new EmptyStackException();
		else if(s2.al.size()==0&&s1.al.size()!=0){
			while(s1.al.size()!=0){
				int temp=s1.peak();
			    s2.push(temp);
				s1.pop();
			}
			return s2.peak();
		}
		else return s2.peak();
	}
    public Boolean isEmpty(){
    	if(s2.al.size()==0&&s1.al.size()==0) return true;
    	else return false;
    }

    public static void main(String[] args) {
    	QueueB2Stack qb2s=new QueueB2Stack();

    	qb2s.add(1);
    	qb2s.add(2);
    	qb2s.add(3);
    	qb2s.remove();
    	qb2s.add(4);
    	qb2s.remove();
    	qb2s.remove();
    	//qb2s.remove();

    	System.out.println(	qb2s.peak());
  
    }
}
