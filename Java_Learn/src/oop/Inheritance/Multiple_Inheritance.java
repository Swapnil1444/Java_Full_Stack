package oop.Inheritance;

interface Ab1{
    int Sum();
    
}
interface Bb1{
    int Mul();
}

class cal implements Ab1,Bb1{
    int a,b;
    public cal(int a,int b){
        this.a=a;
        this.b=b;
    }
    public int Sum(){
        return a+b;
    }
    public int Mul(){
        return a*b;
    }
}

public class Multiple_Inheritance {
    public static void main(String[] args) {
      
        cal c=new cal(10, 20);
        System.out.println(c.Sum());
        System.out.println(c.Mul());
    }
}
