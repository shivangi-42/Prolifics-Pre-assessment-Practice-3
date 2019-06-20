//constructor

class phone{
   private String name;
  private int other;
  private int num;
   phone (){
     // the first statement should be constructor call System.out.println("hii");
       //we can not call constructor using the name like phone(null,0)
     this(null,0);
     System.out.println("i am in 1 parameter cons");
       //we can not call more than one constructor at a time
   } 
  phone(String name,int number){
      this(null,0,0);
      System.out.println("i am in 2 parameter cons");
      this.name=name;
       this.other=number;
         
    }
   phone(String name,int number,int num1){
     System.out.println("i am in 3 parameter cons");
      this.name=name;
       this.other=number;
        this.num=num1;
    }
  
}


 public class prac14{
   static public void main(String name1[]){
  
     phone dd=new phone();
    
     

    }
 }

 
