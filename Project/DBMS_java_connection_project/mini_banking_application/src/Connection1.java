import java.sql.*;
public class Connection1{
    static Connection con;

    public static Connection getConnection(){
        try{
        String url="jdbc:mysql://localhost:3306/Union_bank";
        String username="root";
        String password="9309";
        Class.forName("com.mysql.cj.jdbc.Driver");
         con = DriverManager.getConnection(url, username, password);
         
        System.out.println("Connection Establish Succesfully.");
        }catch(Exception e){
            System.out.println("Connection Failed! " + e.getMessage());
        }
        return con;
    }

}