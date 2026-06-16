
import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Data_App  {

    //  static class Employee {
    //       String name;
    //       int id;
    //       String designation;
    //       int exp;
    //       int age;
    //  }
            static Scanner sc=new Scanner(System.in);
            static String url="jdbc:mysql://localhost:3306/Emp";
            static String useName="root";
            static String password="9309";
            static Connection con; 

        public static Connection getConnection(){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                con=DriverManager.getConnection(url,useName,password);
            }catch(Exception e){
              System.out.println("Connection Failed!");
            }
                System.out.println("Connection Establish Succesfully.");
                return con;
                
        }   

    static void updateEntries(){
        System.out.print("which Update the coloum. Enetr the id:");
        int id=sc.nextInt();
        try{
        String sql="select id from emp_data where id=?";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs=ps.executeQuery();
           while (rs.next()) {
            if( rs.getInt("id")==id){
               String updatesql="update emp_data set name=?,designation=?,exp=?,age=? where id=?";
               PreparedStatement psUpdate=con.prepareStatement(updatesql);
               System.out.println("Update the following data: ");  
               psUpdate.setInt(5, id);  
                System.out.print("Enetr the Name:");
                String name=sc.next();
                psUpdate.setString(1, name);

                System.out.print("Enetr the designation:");
                String designation=sc.next();
                psUpdate.setString(2, designation);

                System.out.print("Enetr the Exp:");
                int exp=sc.nextInt();
                psUpdate.setInt(3, exp);

                System.out.print("Enetr the Age:");
                int age=sc.nextInt();
                psUpdate.setInt(4, age);

                if(psUpdate.executeUpdate()==1) System.out.println("Update data..");


            }else{
                throw new SQLException(" data are not found ");
            }
          } 
        }catch(SQLException e){
            System.out.println("Error : "+e);
            updateEntries();
        }
        mainMenu();

    }
    static void InsertEntries(){
        try{
            String sql="insert into emp_data(id,name,designation,exp,age)values(?,?,?,?,?);";
            PreparedStatement ps=con.prepareStatement(sql);
            System.out.println("Enter the following data: ");    
            System.out.print("Enetr the Name:");
            String name=sc.next();
            ps.setString(2, name);

            System.out.print("Enetr the Id:");
            int id=sc.nextInt();
            ps.setInt(1, id);

            System.out.print("Enetr the designation:");
            String designation=sc.next();
            ps.setString(3, designation);

            System.out.print("Enetr the Exp:");
            int exp=sc.nextInt();
            ps.setInt(4, exp);

            System.out.print("Enetr the Age:");
            int age=sc.nextInt();
            ps.setInt(5, age);

            ps.execute();
            System.out.print("Add Emp data...");

        }catch(SQLException e){
            System.out.println(e);
        }
        mainMenu();

 }
    static void DeleteEntries(){
         System.out.print("Enter the Emp Id to Delete Record: ");
         int code=sc.nextInt();
          try{
               String sql="delete from emp_data where id=?";
               PreparedStatement ps=con.prepareStatement(sql);
               ps.setInt(1, code);
               ps.execute();
               System.out.print("delete data from id "+code);
          }catch(SQLException e){
            System.out.println(e);
          }
      mainMenu();
    }
    
    static void SearchRecord(){
        System.out.print("Enter the Emp Id to Search Record: ");
        int code=sc.nextInt();
 
        try{
            String sql="select * from emp_data where id=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, code);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
                if(rs.getInt("id")==code){
                  System.out.println("Employe name "+rs.getString("name") +" id "+rs.getInt("id")+" Working on "+rs.getString("designation")+" Exp "+rs.getInt("exp")+" age "+rs.getInt("age")); 
                }
                else
                    {
                    System.out.println(" Not Emp data ! in id " +code);
                    SearchRecord();
                }
          }
        }catch(SQLException e){
            System.out.println(""+e);
        }
      mainMenu();
    }
    static void ShowAllRecord(){
        String sql ="select * from emp_data";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
                System.out.println("Employe name "+rs.getString("name") +" id "+rs.getInt("id")+" Working on "+rs.getString("designation")+" Exp "+rs.getInt("exp")+" age "+rs.getInt("age"));
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }        
        mainMenu();
    }
    static void mainMenu(){
    System.out.print("\n");
    System.out.println("*** HouseKeeping Employee Management System ***");
    System.out.print("1.Update The Employee Table.\r\n" + //
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
            updateEntries();
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
         getConnection();
        mainMenu();
       
    }
}
