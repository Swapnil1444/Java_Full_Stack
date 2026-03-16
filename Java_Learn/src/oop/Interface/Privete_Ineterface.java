package oop.Interface;

interface cal{
    int add(int a,int b);  //java 7 

    public static int mul(int a,int b){ // java 8 to add static and default methode in interface
        System.out.println(sub(10,20));
        return a+b;
    }
    default int div(int a,int b){
        return a/b;
        
    }

    
    // java 9 to add the private methode and private static methode
    private static int sub(int a,int b){ // acsept only this interface 
        return a-b;
    }
}
class ans implements cal{
    public  int add(int a,int b){
        return a+b;
     }
}
public class Privete_Ineterface{

    public static void main(String[] args) {

        ans a=new ans();
        System.out.println( a.add(10, 19));
        System.out.println(a.div(10, 12));
        System.out.println(cal.mul(10, 20));
        
        
        
    }
}