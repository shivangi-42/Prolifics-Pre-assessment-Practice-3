//object creation and dereference

class phone{
   private String name;
  private phone other;
  public phone(String name){
      this.name=name;
    }
  public void setphone(phone ph){
       other=ph;
    }
}


 public class prac12{
   static public void main(String name1[]){
  

     phone p1=new phone("php");
     phone p2=new phone("sql");
 
    /* we can not use nullobject to pass to the other class
      p2=null;
      */
      //p1.name="shh";
      p1.setphone(p2);
       p2.setphone(p1);
      
     p2=null;
       p1=null;
     

    }
 }

 
