package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcsqlmavendemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/whole","root","Gvaibhav522@");
		Statement stm=con.createStatement();
//		stm.execute("insert into employee (id,age,name,dept) values(7,26,'ddd','PE')");
		ResultSet rs=stm.executeQuery("select * from employee where id<5");
		rs.next();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
		
//		PreparedStatement pstm=con.prepareStatement("update employee set name=? where id=?");
//		pstm.setString(1, "YOYO");   //this will replace ? in name , first one (1) is like srno.,
//		pstm.setInt(2,2 );  //this will replace ? in id
//		pstm.executeUpdate();
//		con.close();
}catch(Exception e) {
	e.printStackTrace();
}
		
		
	}

}





//
//1. Write a Java program to check whether a string contains only a certain set of characters (in this case a-z, A-Z and 0-9).
//2. Write a Java program that matches a string that has a p followed by zero or more q's.
//3. Write a Java program to find sequences of lowercase letters joined with a underscore.
//4. Write a Java program to find the sequences of one upper case letter followed by lower case letters
//5. Write a Java program that matches a string that has a 'p' followed by anything, ending in 'q'.
//6. Write a Java program to check a word contains the character 'g' in a given string.
//7. Write a Java program that matches a word containing 'g', not at the start or end of the word.
//8. Write a Java program to match a string that contains only upper and lowercase letters, numbers, and underscores.
//9. Write a Java program where a string starts with a specific number
//10. Write a Java program to remove leading zeros from a given IP address.