import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
     static class Employee {
          String name;
          int id;
          String designation;
          int exp;
          int age;
     }

    static int max=20;
    static int num;
    static Employee e[] =new Employee[max];
    static Scanner sc=new Scanner(System.in);

 static void Built()  {
    
    System.out.print("Enetr the Number of Entries:");
    while(true){
        num = sc.nextInt();
        if(num < max) break;
        System.out.println("Only 20 max entries allowed!");
        Built();
    }
    try{

    for(int i=0;i<num;i++){
        System.out.println(" \n Enter the following data: "+i);    
        e[i]=new Employee();
        System.out.print(i+")Enetr the Name:");
        e[i].name=sc.next();
        System.out.print(i+")Enetr the Id:");
        e[i].id=sc.nextInt();
        System.out.print(i+")Enetr the designation:");
        e[i].designation=sc.next();
        System.out.print(i+")Enetr the Exp:");
        e[i].exp=sc.nextInt();
        System.out.print(i+")Enetr the Age:");
        e[i].age=sc.nextInt();
    }
   }catch(NullPointerException e){
      System.out.println(" null Pointer exception..");
   }catch(InputMismatchException e){
    System.out.println(" Enetr the carrect input ");
   }finally{
    mainMenu();
   }
 }
 static void InsertEntries(){
        
        if(num<max){
          int i=num;
          num++;
        System.out.println("Enter the following data: "+i);    
        e[i]=new Employee();
        System.out.print(i+")Enetr the Name:");
        e[i].name=sc.next();
        System.out.print(i+")Enetr the Id:");
        e[i].id=sc.nextInt();
        System.out.print(i+")Enetr the designation:");
        e[i].designation=sc.next();
        System.out.print(i+")Enetr the Exp:");
        e[i].exp=sc.nextInt();
        System.out.print(i+")Enetr the Age:");
        e[i].age=sc.nextInt();

        }else{
            System.out.println("Employeey table is full..!");
        } 

        mainMenu();

 }
    static void DeleteEntries(){
         System.out.print("Enter the Emp Id to Delete Record: ");
         int code=sc.nextInt();
        for(int i=0;i<num;i++){
          if(e[i].id==code){
            Deleteindex(i);
            num--;
           break;
          }else{
            System.out.println(" Not record Found !");
        } 
      }
      mainMenu();
    }
    static void Deleteindex(int i){
        for(int j=i;j<num-1;j++){
        e[j].id=e[j+1].id;
        e[j].name=e[j+1].name;
        e[j].designation=e[j+1].designation;
        e[j].exp=e[j+1].exp;
        e[j].age=e[j+1].age;
        }

        return ;
    }
    static void SearchRecord(){
        System.out.print("Enter the Emp Id to Search Record: ");
        int code=sc.nextInt();
        for(int i=0;i<num;i++){
          if(e[i].id==code){
           System.out.println("Employe name "+e[i].name+" id "+e[i].id+" Working on "+e[i].designation+" Exp "+e[i].exp+" age "+e[i].age);
           break;
          }else{
            System.out.println(" Not record Found !");
        } 
      }
      mainMenu();
    }
    static void ShowAllRecord(){
        if(num!=0){
           for(int i=0;i<num;i++){
            System.out.println("Employe name "+e[i].name+" id "+e[i].id+" Working on "+e[i].designation+" Exp "+e[i].exp+" age "+e[i].age);
           }
        }else{
            System.out.println(" Not record Found !");
        }
        mainMenu();
    }
 static void mainMenu(){
    System.out.print("\n");
    System.out.println("*** HouseKeeping Employee Management System ***");
    System.out.print("1.Built The Employee Table.\r\n" + //
                "2.Insert New Entries.\r\n" + //
                "3.Delete The Entries.\r\n" + //
                "4.Search A Record. \r\n" + //
                "5.Show all Record. \r\n"+//
                "6.Exit \r\n"+//
                "Select Option: ");
                int num=sc.nextInt();

    switch (num) {
        case 1:
            System.out.print("\n");
            Built();
            break;
        case 2:
            System.out.print("\n");
            InsertEntries();
            break;
        case 3:
            System.out.print("\n");
            DeleteEntries();
            break;
        case 4:
            System.out.print("\n");
            SearchRecord();
            break;   
        case 5:
            System.out.print("\n");
            ShowAllRecord();
            break;         
        case 6:
            System.out.println(" Exit...");
            break;
        default:
            System.out.print("Enter carect option");
            mainMenu();
    }            




}

    public static void main(String[] args) throws Exception {
        mainMenu();
    }
}
