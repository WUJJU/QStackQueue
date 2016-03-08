import java.util.*;

public class Reference{

   public static void giveMe(Dog d){
     d.setName("Liangchaowei");
     d=new Dog("GuoFucheng");
     d.setName("Haizeiwang");
   }

   public static class Dog{
   	 public String name;
   	 public Dog(String n){
   	 	this.name=n;
   	 }
   	 public void setName(String m){
   	 	name=m;
   	 }
   }
	public static void main(String[] args) {
		Dog mydog=new Dog("Fujun");
		giveMe(mydog);

         System.out.println(mydog.name);
	}

}