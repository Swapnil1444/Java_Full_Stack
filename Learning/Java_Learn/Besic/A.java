package Besic;
import java.util.Scanner;


//multipal ineritas
  interface Emp{

   public void data();

 }
  interface Emp_info {
   public void acceptdata();

}

 class Empdata implements Emp,Emp_info {
    

    int id;
    String name;
    double salary;

   public void acceptdata(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter name of Emp:");
        name=sc.nextLine();

        System.out.println("Enter Emp id:");
        id=sc.nextInt();

        System.out.println("Enter Emp salary:");
        salary=sc.nextDouble();
    }

    public void data(){

        System.out.println(" name: "+name+" \n Id: "+id+" \n salary"+salary);
    }
    
}
 


public class A{
    public static void main(String s[]){
        
    }
}