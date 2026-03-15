import java.sql.*;

class MySQlConnection{

}
public class Connection1 {
    public static void main(String[] args) throws Exception{

        String url="jdbc:mysql://localhost:3306/testdb";
        String username="root";
        String password="9309";
        String query="select * from stud";
        
       // MySQlConnection m=new MySQlConnection();

       // oracal  Class.forName(“oracle.jdbc.driver.OracleDriver”);
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Establish connection
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Connection Establish Succesfully.");

        Statement st=con.createStatement(); //create statment

        int id=3;
        String user="jay";
        String pass="3333";
        String adduser="insert into stud(username,password) values(?,?)";
       // st.executeUpdate(adduser);

        PreparedStatement ps=con.prepareStatement(adduser);
        ps.setString(1,user);
        ps.setString(2, pass);

        int row=ps.executeUpdate();
        if(row==3){
            System.out.println("update jay");
        }

        ResultSet rs=st.executeQuery(query); //exceuted query


        

        

        

        //procees the result
        while(rs.next()){
            int id1=rs.getInt("userid");
            String userName=rs.getString("username"); //retrive the name 
            String passWord=rs.getString("password");
            System.out.println("Id "+id1+" username  "+userName +" password  "+passWord);
        }

        st.close();
        con.close();
        System.out.println("Connection close...");






    }
    
}
