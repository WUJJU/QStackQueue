import java.util.*;
/**
*the idea is put stacks to an array; use csize to follow stack size, use set_i to follow array position, 
*this will avoid iterator all elements
*
**/
public class SetofStacks{

   public class Stack{

     public int value;
     public Stack next;
     public int size=3;
     public int csize;

     public Stack(int t){
     	this.value=t;

     	this.csize=0;
     	next=null;
     }
  
   }

   Stack [] sets=new Stack[3];
   public Stack top;
   public int set_i=0;

    // public Boolean isFull(){
    // 	return 
    // }

    public void pop(){
        Stack top;
         if(set_i==sets.length){
            if(sets[set_i-1]!=null){
               top=sets[set_i-1].next;
               sets[set_i-1]=top;
           }
            else{
                set_i--;
                pop();
               }

          }else if(set_i>=0){

            if(sets[set_i]!=null){
                top=sets[set_i].next;
                sets[set_i]=top;
            }else{
                set_i--;
                pop();
            }

             
    }else{
        System.out.println("pop but setsofstack is empty!!");
        throw new EmptyStackException();
    }
    }

     

     public Boolean push(int t){
     	Stack n_item=new Stack(t);
       // System.out.println("sets.length: "+sets.length);
        if(set_i==sets.length){
             System.out.println("the sets are full!!!");
                    return false;

        }
  
        if(top!=null){
            if(top.csize>=top.size){
       

                if(sets[set_i]==null&&set_i<sets.length) {
                    sets[set_i]=top;
                   // System.out.println("sets_i :" +set_i);
                    set_i++;
                     System.out.println("sets_i :" +set_i);
                    top=null;
                       if(set_i==sets.length){
                      System.out.println("the sets are full!!!");
                    return false;

                     }
                  //System.out.println("top.csize "+top.csize);
                 }else{

                       System.out.println("the sets are full");
                    return false;
                 }
            
        
        }



        }
      


        n_item.next=top;
        if(top!=null)  n_item.csize=top.csize;
        top=n_item;
        top.csize++;
        System.out.println("top csize: "+top.csize);

        return true;
     }

     public int peak(){

    if(set_i==sets.length){
        if(sets[set_i-1]!=null)  return sets[set_i-1].value;
        else{
            set_i--;
            return peak();
        }
    }else if(set_i>=0){
        if(sets[set_i]!=null) 
            return sets[set_i].value;
        else {
          set_i--;
        return  peak();
        }
         
    }
       throw new EmptyStackException();
     }
     
     public static void main(String[] args) {
     	SetofStacks setsof=new SetofStacks();
     	setsof.push(5);
        setsof.push(6);
        setsof.push(3);
        
        setsof.push(7);
        setsof.push(1);
        setsof.push(6);

        setsof.push(7);
        setsof.push(5);
        setsof.push(6);
        
        setsof.push(3);
        setsof.push(7);
          setsof.pop();
            setsof.pop();
              setsof.pop();
              setsof.pop();
        int j=setsof.peak();
        System.out.println("peak is:"+j);
    
              for(int i=0;i<setsof.sets.length;i++){
                System.out.println(setsof.sets[i]);
              }
     }


}