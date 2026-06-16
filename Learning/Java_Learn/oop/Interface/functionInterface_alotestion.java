package oop.Interface;

@FunctionalInterface
interface Abc{
    void dispaly();
     // void a(); functional interface not a create multipal method in singale intrface

}

//befor java 8 
interface Aaa{
    int Add(int a,int b);
}

public class functionInterface_alotestion {
    public static void main(String argd[]){

        
        Abc obj=()-> System.out.println("display method");

        obj.dispaly();

        //befor java 8
        Aaa l1=new Aaa() {
          public int Add(int a,int b)
            {
                return a+b;
            }
        };
        System.out.println(l1.Add(10, 20));

        //after java8
        Aaa l= (a,b) -> a+b;
        System.out.println(l.Add(10, 19));




    }
}
