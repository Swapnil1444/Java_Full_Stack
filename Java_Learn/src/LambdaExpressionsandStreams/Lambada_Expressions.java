package LambdaExpressionsandStreams;

import java.util.ArrayList;

//3.  Lambda with a Single Parameter

interface Cal{
    int cal(int a,int b);
}
//types
//1)  Lambda with Zero Parameters
interface zeroParameters{
    void display();
}

public class Lambada_Expressions {
    public static void main(String[] args) {

        // Lambda with a Single Parameter
        Cal obj= (a,b)-> a+b;  //lambada exprestion new java 8 fuchar

        System.out.println(obj.cal(10, 20));

        Cal mul= (a,b)-> a*b;
        int i;
        System.out.println(mul.cal(10,80));

        //type
        //zero parametars
        zeroParameters z=()-> System.out.println("zero parametars");
        z.display();

        //one parameters
        ArrayList list=new ArrayList<Integer>();
        list.add(10);
        list.add(11);
        list.add(12);

        list.forEach(n->System.out.println(n));

        // list.forEach(n-> {
        //     if(n%2 == 0)
        //         System.out.println(n);
        // });


    }
}
