//return practise

class phone{
   String name;
  
   phone (){
    
   } 
  public void setname(String name){
    this.name=name;
   }
  void rename(int a){
   //this works 
     if(a==2)
      return ;
    int b=9;
   }
/* can'nt use the args before the any other parameter it should be the last

public int days(String... months,int a){
  return 1;


   }
*/
public int days(String... months){
  return 1;


   }
  /*
  this does not works 
  void rename(int a){
      return ;
    int b=9;
   }*/

}

 public class prac18{
   static public void main(String name1[]){
  
     phone dd=new phone();
     // invalid invocation dd->setname("java");
    dd.setname("shshhsh");
    dd.rename(2);
    String a[]={"1","2"};
   //int[] aa={1,2,3};
    dd.days(a);
    System.out.println(dd.name);
     

    }
 }

 
