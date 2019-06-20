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

 public class prac19{
public static void swap(person p11,person p22){
 person temp=p11;
 p11=p22;
 p22=temp;

}
   static public void main(String name1[]){
  
     person p1=new person();
     person p2=new person();
     
    p1.setname("shivangi");
    p2.setname("shiva");
    System.out.println(p1.getname());
    System.out.println(p2.getname());  
     swap(p1,p2);
     System.out.println(p1.getname());
    System.out.println(p2.getname()); 
    
    }
 }

 
