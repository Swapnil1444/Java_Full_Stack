package oop.Interface;

@FunctionalInterface
interface Abc{
    void dispaly();
     // void a(); functional interface not a create multipal method in singale intrface

}

public class functionInterface_alotestion {
    public static void main(String argd[]){

        Abc obj=()-> System.out.println("display method");

        obj.dispaly();
    }
}
