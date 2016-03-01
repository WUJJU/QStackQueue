import java.util.*;

public class Threeinone{
     public static final int SIZE=3;

     Object [] array;
     int [] three=new int[SIZE];
     int [] three2=new int[SIZE];
     int top;
     int end;
     public Threeinone(int t){

       array=new Object [SIZE*t];
       three[0]=-1;
       three[1]=2;
       three[2]=5;
       three2[0]=-1;
       three2[1]=2;
       three2[2]=5;
     }


     public Boolean push(int i,Object b){
         
    
         top=three[i];

     	if(++top>three2[i]+SIZE) {
    
     		return false;
     	}
     	else{
         array[top]=b;
         three[i]=top;
         return true;
     	}
     }

     public Object peak(int i){
     	top=three[i];
     	System.out.println("top in peak "+top);
     	if(array[top]==null) return false;
     	else{
     		return array[top];
     	}
     }

     public Boolean pop(int i){
     	top=three[i];
     	System.out.println("top in pop "+top);
     	if(array[top]==null) return false;
     	else {
     		array[top]=null;
     		three[i]=--top;
     		return true;
     	}
     }

	public static void main(String[] args) {
	   Threeinone tione=new Threeinone(10);
	   tione.push(0,2);
	   tione.push(0,"hihi");
	   tione.push(0,"lili");
	    //tione.pop(0);
	

	   System.out.println(tione.pop(0));

      Object ttt=tione.peak(0);
      System.out.println("ttt---->"+ttt);
      System.out.println("------------------------->");
       tione.push(1,3);
     tione.push(1,4);
     tione.push(1,"titi");
     tione.push(1,"gg");
     tione.pop(1);
     System.out.println(tione.peak(1));
	}
}