import java.util.Scanner;
import java.sql.*;

class Bank {

   // String user="Swapnil123";jn
   // String pass="Swapnil123"z[\
   // XRrvvvvvvvvp-'[123'];
    String Cname;
    String Cpass;
    int Caccount_no;
    String url="jdbc:mysql://localhost:3306/Union_bank";
    String username="root";
    String password="9309";

    Scanner sc=new Scanner(System.in);
     public void newAccout(){
        try{
           Connection con = DriverManager.getConnection(url, username, password);
           Class.forName("com.mysql.cj.jdbc.Driver");
           
        // System.out.println("Connection Establish Succesfully.");
        try{

            System.out.println("Create new Account");
            System.out.print("Custamer UserName:");
            String cname=sc.nextLine();
            System.out.print("Password:");
            String cpass=sc.nextLine();
            if(cname==null||cpass==null){
                System.out.println("Enter Username and Password");
                // newAccout();
            }else{

                String sql="insert into customer(cname,balance,password)values(?,1000,?);";
                PreparedStatement ps=con.prepareStatement(sql);
                ps.setString(1, cname);
                ps.setString(2, cpass);
                int row= ps.executeUpdate();

                if(row==1){
                    System.out.println("Account created successfully! You can now login.");
                }
            }
        }catch(SQLIntegrityConstraintViolationException e){
            System.out.println("Username already exists! Try another one.");
            newAccout();
        }

        }catch(Exception e){
            System.out.println("Connection Failed! " + e.getMessage());
        }
    }
    public void login(){

        try{

           Connection con = DriverManager.getConnection(url, username, password);
           Class.forName("com.mysql.cj.jdbc.Driver");

           try {
                System.out.print("UserName: ");
                String userName=sc.nextLine();
                System.out.print("Password: ");
                String Password=sc.nextLine();
                String sql="select * from customer where cname=? && password=?";
                PreparedStatement ps=con.prepareStatement(sql);
                ps.setString(1,userName);
                ps.setString(2,Password);
                ResultSet rs=ps.executeQuery();

                
                while(rs.next()){
                    Cname=rs.getString("cname");
                    Cpass=rs.getString("password");
                    Caccount_no=rs.getInt("account_no");
                }

                if (userName.equals(Cname)&&Password.equals(Cpass)) {
            
                    System.out.print("1.view balance \n2.transfer money \n3.LogOut\n Select Option: ");
                    int n=sc.nextInt();
                    switch(n){
                        case 1:
                            ViewBalance(Caccount_no);
                            break;
                        case 2:
                            TransferMoney(Caccount_no);
                            break;
                        case 3:
                            System.out.println("LogOut...");   
                            break;
                        default:
                            System.out.println("Enter carrect Option..");         
                    }
                }else{
                    System.out.println("invalid userId and password!");
                    login();
                }
           } catch (Exception e) {
           }



        }catch(Exception e){
              System.out.println("Connection Failed! " + e.getMessage());
        }
       
    }

    public void ViewBalance(int ac_no){

        try{
            Connection con = DriverManager.getConnection(url, username, password);
           Class.forName("com.mysql.cj.jdbc.Driver");

           String sql="select * from customer where account_no=?";
           PreparedStatement ps=con.prepareStatement(sql);
           ps.setInt(1, ac_no);
           ResultSet rs=ps.executeQuery();
           while(rs.next()){
            int Ano=rs.getInt("account_no");
            String name=rs.getString("cname");
            int balance =rs.getInt("balance");

            System.out.println("Account No "+Ano+" Custamer Name "+name+" Balance "+balance);

           }
        }catch(Exception e){
            System.out.println("Connection Failed! " + e.getMessage());
        }
    }
    public void TransferMoney(int ac_no){

        int balance;
        try{
            Connection con = DriverManager.getConnection(url, username, password);
           Class.forName("com.mysql.cj.jdbc.Driver");

           String CkeckBalance="select balance from customer where account_no=?";
           PreparedStatement ps=con.prepareStatement(CkeckBalance);
           ps.setInt(1, ac_no);
           ResultSet rs=ps.executeQuery();
           while(rs.next()){
            balance=rs.getInt("balance");
            System.out.println(balance);

            System.out.print("Enter Receiver A/c No:");
            int rno=sc.nextInt();
            System.out.print("Enter Amount: ");
            int amount=sc.nextInt();
            if(balance<=amount){
               System.out.println("Insufficient Balance!");
            }else{

                String cradit="update customer set balance=balance+? where account_no=?;";
                PreparedStatement psc=con.prepareStatement(cradit);
                psc.setInt(1, balance);
                psc.setInt(2, rno);
                psc.executeUpdate();

                String debit="update customer set balance=balance-? where account_no=?;";
                PreparedStatement psd=con.prepareStatement(debit);
                psd.setInt(1, balance);
                psd.setInt(2, ac_no);
                psd.executeUpdate();

                 System.out.println("Transaction successful!");

            }
           }


        }catch(Exception e){
            System.out.println("Connection Failed! " + e.getMessage());
        }

    }



}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        Bank b=new Bank();

        System.out.println("*** MINI BANKING APPLICTION ***");

        
        System.out.print("1.Create new Account \n2.Login \n3.Exit \n Select Option:");
        int num=sc.nextInt();

        switch(num){
            case 1:
                b.newAccout();
                break;

            case 2:
                b.login();
                break;
            case 3:
                System.out.print("Exit...");
            
             default:
                System.out.println("Enter carrect option.");   
        }
    

    }
}
