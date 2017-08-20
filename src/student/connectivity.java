/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Anish
 */
import java.sql.*;
 
class MysqlCon{ 
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/stud","root","root");  
//here sonoo is database name, root is username and password  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from name");  
while(rs.next())  
System.out.println(rs.getString(1)+"  "+rs.getInt(2)+"  "+rs.getInt(3));  
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  