//calling methods on objects

class phone{
   String name;
  
   phone (){
    
   } 
  public void setname(String name){
    this.name=name;
   }
  public char rename(){
    char aa=12;
    return aa;
   }
   public long rname(){
    long aa=12;
    return aa;
   }

  public double nme(){
    //long gets automatically converted to double
    long aa=12;
    return aa;
   }
  public int me(){
    //we need to convert higher to lower
    long aa=1245;
    return (int)aa;
   }
}

 public class prac17{
   static public void main(String name1[]){
  
     phone dd=new phone();
     // invalid invocation dd->setname("java");
    dd.setname("shshhsh");
   int aa=dd.rename();
    byte a=(byte)dd.rname();
    double b=dd.nme();
   double c=dd.me();
    System.out.println(c);
    System.out.println(dd.name);
     

    }
 }

 
