import java.util.*;

public class SortStack{
	public static int curr;
  //public Stack st;
   static  Stack temp_s=new Stack(5);
   public  void sort(Stack st){
   

     while(!st.isEmpty()){
        if(temp_s.isEmpty()){
        temp_s.push(st.peak());
        st.pop();
        }else{
        	curr=st.peak();
        	st.pop();
          if(curr<=temp_s.peak()) {
       	     temp_s.push(curr);
           }else{
            

              while(curr>temp_s.peak()){
               st.push(temp_s.peak());
               temp_s.pop();
                  if(temp_s.isEmpty()) {
                    temp_s.push(curr);
                    break;
               }
               temp_s.push(curr);

            }
           
           }

        }//end of else




     }//end of while

     st=temp_s;
      System.out.println(st.peak());


   } //


   public static void main(String[] args) {
   	Stack st=new Stack(5);
    st.push(2);
    st.push(1);
    st.push(5);
    st.push(3);
    st.push(4);
    
    
  SortStack sortstack=new SortStack();
     sortstack.sort(st);
     //st = temp_s;
     System.out.println(st.peak());

   }//

}//