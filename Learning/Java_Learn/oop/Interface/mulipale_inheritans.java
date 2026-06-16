package oop.Interface;

// mutipale inherites with interface
interface A{
     void show();
}
interface B extends A{
      void confi();
}
interface C{
      void div(int a,int b);
}
class D implements  C,B{
      
    public void show(){
        System.out.println("show methethod");
    }
    public void confi(){
         System.out.println("confi method ");
    }
    public void div(int a,int b){
        System.out.println(a/b);
    }
}

public class mulipale_inheritans {
    public static void main(String[] args) {
      
        D obj=new D();
        obj.show();
        obj.confi();
        obj.div(10, 20);
    }
}
