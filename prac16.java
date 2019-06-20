//calling methods on objects

class phone{
   String name;
  
   phone (){
    
   } 
  public void setname(String name){
    this.name=name;
   }
 
  
}

 public class prac16{
   static public void main(String name1[]){
  
     phone dd=new phone();
     // invalid invocation dd->setname("java");
    dd.setname("shshhsh");
    System.out.println(dd.name);
     

    }
 }

 
