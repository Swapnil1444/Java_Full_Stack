package oop.Interface.NestedInterface;

interface A{
    interface B{
        void show();
    }
}



public class Interface_Inside_Interface implements A.B{
    public void show(){
        System.out.println("display");
    }
    public static void main(String[] args) {
        A.B obj= new Interface_Inside_Interface();
        obj.show();
    }
}
