import java.sql.*;
import java.util.Scanner;

public class UpdateData {
    public static void main(String[] args) 
{
try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "Hitesh");
             Statement s = con.createStatement()) 
 
{

            Scanner sc = new Scanner(System.in);
            System.out.println("Update Data in student table:");
            System.out.println("________________________________________");

            System.out.print("Enter student id: ");
            int sid = sc.nextInt();
            System.out.print("Enter student name: ");
            String sname = sc.next();
System.out.print("Enter student age: ");
            int sage = sc.nextInt();
            System.out.print("Enter student email: ");
            String semail = sc.next();

            String updateQuery = "UPDATE students SET name='" + sname + "', age='" + sage + "',email='" + semail + "'  WHERE id=" + sid;
            s.executeUpdate(updateQuery);

            System.out.println("Data updated successfully");

        } catch (SQLException err) {
            System.out.println("ERROR: " + err);
        }
    }
}
