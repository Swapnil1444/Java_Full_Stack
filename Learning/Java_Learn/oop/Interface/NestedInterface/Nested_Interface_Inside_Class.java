package oop.Interface.NestedInterface;

class Outer{
    interface inner{
        void show();
    }
}



public class Nested_Interface_Inside_Class implements  Outer.inner {

    public void show(){
          System.out.println("dispaly show method");
    }
    public static void main(String[] args) {
        
        Outer.inner obj= new  Nested_Interface_Inside_Class();
        obj.show();

    }
}
