//passing object reference to the method

class person{
   String name;
  
   person(){
    
   } 
  public void setname(String name){
    this.name=name;
   }
  public String getname(){
    return name;
   }


}

 public class prac20{
public static void swappp(person p11){
 p11.setname("shiv");

}
   static public void main(String name1[]){
  
     person p1=new person();
     
     
    p1.setname("shivangi");
    
    System.out.println(p1.getname());
     
     swappp(p1);
     System.out.println(p1.getname());
     
    
    }
 }

 
