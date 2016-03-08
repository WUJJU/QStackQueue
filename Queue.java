import java.util.*;

public class Queue{
   LinkedList<Dog> queuelist1=new LinkedList<Dog>();
      LinkedList<Cat> queuelist2=new LinkedList<Cat>();
   public int order=0;

   
   public void enqueue(Animal animal){
   	animal.timestamp=order;
   	order++;
   	if(animal instanceof Dog)   	  queuelist1.add((Dog)animal);
   	else if(animal instanceof Cat)  queuelist2.add((Cat)animal);
   }
   public void dequeue(){

   	if(queuelist1.size()==0||queuelist2.size()==0) throw new NullPointerException();
   	if(queuelist1.getFirst().timestamp<queuelist2.getFirst().timestamp) dequeueDog();
   	else    dequeueCat(); 
   }

   public void  dequeueDog(){
   	   	if(queuelist1.size()==0) throw new NullPointerException();
   	     queuelist1.removeFirst();
   	 
   }
    public void  dequeueCat(){
   	   	if(queuelist2.size()==0) throw new NullPointerException();
   	     queuelist2.removeFirst();
   	 
   }
   public void print(){
   		if(queuelist1.size()==0) throw new NullPointerException();
   	 for(int i=0;i<queuelist1.size();i++){
   	 	Animal a=(Animal)queuelist1.get(i);
   	 	System.out.println(a.name);
   	 }

   	  	 for(int i=0;i<queuelist2.size();i++){
   	 	Animal a=(Animal)queuelist2.get(i);
   	 	System.out.println(a.name);
   	 }
   }

  public static void main(String[] args) {
  	Dog d1=new Dog("fujun");
  	Dog d2=new Dog("hengheng");
  	Cat c1=new Cat("chenyi");
  	Cat c2=new Cat("langzong");

  	Queue q=new Queue();
  	q.enqueue(c1);
  	q.enqueue(c2);
  	q.enqueue(d1);
  	q.enqueue(d2);
   if(d1 instanceof Dog){
   	 System.out.println("d1 is instanceof dog");
   }
  	q.dequeue();
  	q.print();

  }


}