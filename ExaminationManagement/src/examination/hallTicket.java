package examination;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class hallTicket {
	  void selectRecord() throws Exception {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Roll No to generate Hall Ticket:");
		String r=s.next();
		String query="select * from studentD where rollNo=" +r;
		Connection con=econnection.getConnection();
		Statement st=con.createStatement();
		ResultSet result=st.executeQuery(query);
		
		
		if(result.next()){
		 System.out.println("-------------EXAMINATION HALL TICKET-------------");
		 System.out.println("SWARNANDHRA COLLEGE OF ENGINEERING AND TECHNOLOGY");
		 System.out.println("Name:"+result.getString("name"));
		 System.out.println("Roll NO:"+result.getString("rollNo"));
		 System.out.println("Email:"+result.getString("email"));
		 System.out.println("Password:"+result.getString("password"));
		 System.out.println("Subject: Programming in java");
		 System.out.println("Date: 30/12/2023");
		 System.out.println("-------------------------------------------------");
		}
		else {
			System.out.println("NO RECORDS FOUND");
			
		}
		
	}
}
