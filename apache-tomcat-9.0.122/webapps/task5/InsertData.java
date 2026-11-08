import java.sql.*;
import java.util.Scanner.*;

public class InsertData{
    public static void main(String args[]){
        
        scanner sc =new scanner(System.in);
        
        String sql="Insert into students (id,name,age,email) values (?,?,?,?)";

        try(
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/studentdb","uname","upassword");
            PreparedStatement ps = con.prepareStatement(sql);
        ){
            //read values 
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            System.out.print("Enter Name: ");
            String name = sc.next();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            System.out.print("Enter Email: ");
            String email = sc.next();
        
            ps.setInt(1,id);
            ps.setString(2,name);
            ps.setInt(3, age);
            ps.setString(4, email);


            // 4. Execute
            ps.executeUpdate();
            System.out.println("Inserted Successfully");

        }
        catch(SQLException e){
            system.out.println(e);
        }
    }
}