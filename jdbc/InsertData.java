import java.sql.*;
import java.util.Scanner;

public class InsertData
 {
    public static void main(String[] args) 
{
        
String url = "jdbc:mysql://localhost:3306/studentdb";  // JDBC URL 
        String userName = "root";  // MySQL username
        String password = "Hitesh";  // MySQL password
             
try
{
Connection con = DriverManager.getConnection(url, userName, password);
System.out.println("Connected to database");
String sql = "INSERT INTO students (id, name,age,email) VALUES (?, ?, ?, ?)";  
PreparedStatement preparedStatement = con.prepareStatement(sql);   
       Scanner sc = new Scanner(System.in);
            System.out.println("Inserting Data into student table:");
            System.out.println("________________________________________");

            System.out.print("Enter student id: ");
            int sid = sc.nextInt();
              sc.nextLine();
            System.out.print("Enter student name: ");
            String sname = sc.nextLine();
            System.out.print("Enter student age: ");
            int sage= sc.nextInt();

              sc.nextLine();
             System.out.print("Enter students email: ");
            String semail = sc.nextLine();  
 preparedStatement.setInt(1, sid);     // Sets the first '?' to the integer sid
            preparedStatement.setString(2, sname); // Sets the second '?' to the string sname
            preparedStatement.setInt(3, sage);
            preparedStatement.setString(4, semail); 

int rowsAffected = preparedStatement.executeUpdate();
           
if (rowsAffected > 0) {
                System.out.println("Record Inserted Successfully!");
            } else {
                System.out.println("Record insertion failed.");
            }

        } 
catch (SQLException err) 
{
            System.out.println("ERROR: " + err);
        }
    }
}