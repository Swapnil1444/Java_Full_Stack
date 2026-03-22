package ExceptionHandling;

class demo1 {
    void show() throws ClassNotFoundException{
        Class.forName("demo1"); 
    }
}

public class throws_Exception {
     public static void main(String args[]){

        demo1 d=new demo1();
        try{
        d.show();
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
     }
}
