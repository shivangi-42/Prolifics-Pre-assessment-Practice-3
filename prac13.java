//constructor

class phone{
   private String name;
  private int other;
   phone (){
     // the first statement should be constructor call System.out.println("hii");
       //we can not call constructor using the name like phone(null,0)
     this(null,0);

       //we can not call more than one constructor at a time
   } 
  phone(String name,int number){
      this.name=name;
       this.other=number;
    }
  
}


 public class prac13{
   static public void main(String name1[]){
  
     phone dd=new phone();
    
     

    }
 }

 
