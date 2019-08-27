
    
import java.sql.Connection;
import java.util.Random;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.*;

public class BankAccount {
	public void doentry() throws Exception
	{
		String url ="jdbc:mysql://localhost:3306/atm";
		String uname="root";
		String pass ="";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		int Acno=rand.nextInt(1000);
		System.out.println("Your name:\n");
		String name =sc.next();
		
		System.out.println("Create pin:\n");
		int pin =sc.nextInt();
		
		
		String sql="Insert into accountinfo(username,account_no,pin)values('"+name+"',"+Acno+","+pin+")";
		st.executeUpdate(sql);
		System.out.println("------ACCOUNT INFORMATION------\n");
		System.out.println("AC NO.:\n"+Acno);
		System.out.println("NAME:\n"+name);
		
		
		

		
		
	}

}