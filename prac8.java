
class phone{
  static boolean softkeyboard=true;
int a=0;
}

 public class prac8{
   static public void main(String name1[]){

     phone.softkeyboard=false;
     phone p1=new phone();
     phone p2=new phone();
     System.out.println(p1.softkeyboard);
     p1=null;

     System.out.println(p2.a);
     System.out.println(p1.softkeyboard);
   System.out.println(p1.a);


    }
 }

 
