package oop;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.*;

class  Students {

    String name;
    int id;

    public Students(String name,int id){
        this.id=id;
        this.name=name;
    }
    
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

    //ovrride a method to access the values in string format
   public String toString(){
        return "Student name "+name+" and Id "+id;
    }
}

//Using Deserialization

 class Student_1 implements Serializable {

    private String name;
    public Student_1(String name){
         this.name=name;
    }
    public String toString()
    {
        return "Student name "+name;
    }
}

// crate a lass clone
class CloneClass implements Cloneable{
    String name="Swapnil ";
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}


public class class_and_object {

    public static void main(String[] args) {
        
        Students s=new Students("swapnil", 1);
        System.out.println(s);





        //crate a clone 
        try{

            CloneClass a=new CloneClass();
            CloneClass a1= (CloneClass) a.clone();
            System.out.println(a1.name);
        }
        catch(Exception e){
            e.printStackTrace();
        }


        // Deserialization

        // try(ObjectOutputStream Out=new ObjectOutputStream(FileOutputStream("student.ser"))){
            
        //     out.writeObject(new Student_1("Swapnil"));
        // }


    }
}
