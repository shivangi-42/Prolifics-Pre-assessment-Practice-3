//******same name concept


class phone{

//******class and instance variable can not be use with the name

  static boolean softkeyboard=true;
    //boolean softboard=true;

//*******method parameter and local variable can not have same name
/*
void see(int b){
  int a=b;
}
*/


int a=0;

   void setup(){
   int a=9;
    }

}
//class can have same instance name and local variable name

 public class prac9{
   static public void main(String name1[]){
  

     phone.softkeyboard=false;
     phone p1=new phone();
     
     p1.setup();
     System.out.println(p1.softkeyboard);
     
  //this will print 0
     System.out.println(p1.a);


    }
 }

 
