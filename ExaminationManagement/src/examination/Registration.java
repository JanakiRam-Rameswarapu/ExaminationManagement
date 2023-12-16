package examination;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.*;
public class Registration {
	String name,rollNo,email,password;
	Registration(){
		Scanner s=new Scanner(System.in);
		System.out.printf("Enter Name:");
		name=s.nextLine();
		System.out.printf("Enter Roll No:");
		rollNo=s.next();
		System.out.printf("Enter Email:");
		email=s.next();
		System.out.printf("Enter Password:");
		password=s.next();
	}
	public void addStudent(Registration r) throws Exception {
		String query="insert into studentD values(?,?,?,?)";
		Connection con=econnection.getConnection();
		PreparedStatement pst=con.prepareStatement(query);
		pst.setString(1,r.name);
		pst.setString(2,r.rollNo);
		pst.setString(3,r.email);
		pst.setString(4,r.password);
		pst.executeUpdate();
	}
}
