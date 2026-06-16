package oop.class_object;


class student11 implements Cloneable {

    String name;
    int age;
    int id=101;
    public student11(String name,int age){
        this.name=name;
        this.age=age;
    }
    public student11(){}
    @Override //convart object to string 
    public String toString() {
        // TODO Auto-generated method stub
        return "name "+name+"age "+age;
    }
    public int hashCode(){ //castam hashcode mthode
        return id*4;
    }

    //create the clone of class
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    
}
class book{
    String title;
    public book(String title){
        this.title=title;
    }

    
    public boolean equals(Object obj){

        book b=(book)obj;
        return this.title.equals(b.title);
    }
}


public class object_class {
    public static void main(String[] args) {

        student11 s=new student11("swapnil", 10);
        System.out.println(""+s); //return the String valus in object 
        
        System.out.println("return hascode "+s.hashCode());

        book b=new book("java");
        book c=new book("java");
        System.out.println("chack equals object:"+b.equals(c));

        //return the class name 
        System.out.println("get class name:"+c.getClass());

        object_class o=new object_class();
        System.out.println(o.hashCode());

        o=null;
        System.gc(); //call garbeg collection
        System.out.println("End");

       // student11 s2= (student11) s.clone();


        


    }
    @Override  protected void finalize(){
        System.out.println("finalize method call..");
    }
}
