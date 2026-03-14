package oop;

class Stu{

    String name;
    int id;
    
    //defalut constractars
    public Stu(){
        name="swapnil";
        id=1;
    }

    //paramiter constaractar
    public Stu(String name,int id){
        this.id=id;
        this.name=name;
    }

    //privet constractar
    private Stu(String name){
        System.out.println("It  private constractar "+name);
    }

    //copy constractar
    public Stu(Stu s){
        this.name=s.name;
        this.id=s.id;
    }



    public String toString(){
     return "Student name "+name+ " id "+id;
    }

    
}

class Emp1{
    String name="";
    int id=0;
    double salery=0;

    //consractar overloding 
    
    public Emp1(){
        name="swapnil";
    }
    public Emp1(String name ,int id){
        this.id=id;
        this.name=name;
    }
    public Emp1(double salery){
        this.salery=salery;
    }

    public String toString(){
        return "Emp name "+name+" id "+id+" salary "+salery;
    }
}

//Constructor Chaining using this in single class 
class Temp {

    public Temp(){
        System.out.println("It is deflut constracar");
        this(10); // call the constractar to the using this in inside the class
    }
    public Temp(int a){
        System.out.println("paramatar "+a);
        this("swapnil",20);
    }
    public Temp(String name,int age){
        System.out.println(name+" "+age);
    }
    
}

class Bass extends Temp{


    // block to be executed before any constructor.
    {
        System.out.println("init block");
    }

    public Bass(){
        super(); // call a parent class constarct
        System.out.println("defult con");

    }

    
}


public class constractes {

    public static void main(String[] args) {
        

        //call defult

        Stu s1=new Stu();
        System.out.println(s1);

        // call parametar raes
        Stu s2=new Stu("Om",2);
        System.out.println(s2);

        //call private constarctar
       // Stu s3=new Stu("jay");

       //copy constractar
       Stu s4=new Stu("Jay",3);
       Stu s5=new Stu(s4);
       System.out.println(s5);

       //ovarloding
       Emp1 e1=new Emp1();
       System.out.println(e1);
       Emp1 e2=new Emp1(2000);
       System.out.println(e2);
       Emp1 e3=new Emp1("Om", 2);
       System.out.println(e3);


       
       new Bass(); //call the constractar
       new Temp(10); //call

       //exucut the last this init block
       {
        System.out.println("second");
       }








    }
}
