package examination;
import java.util.*;
public class mainClass {

	public static void main(String[] args) throws Exception{
		Scanner s=new Scanner(System.in);
		boolean isRunning=true;
		while(isRunning) {
			System.out.println("Enter Choice:");
			System.out.println("1.Enter 1 to Register");
			System.out.println("2.Enter 2 to get Hall Ticket");
			System.out.println("3.Enter 3 to select Exam Mode");
			int choice=s.nextInt();
			switch(choice) {
			
			case 1:
				Registration reg=new Registration();
				reg.addStudent(reg);
				break;
			case 2:
				hallTicket h=new hallTicket();
				h.selectRecord();
				break;
			case 3:
				ExamMode em=new ExamMode();
				em.selectMode();
			default:
				isRunning=false;
			}
		
		}
		
		
	}

}
