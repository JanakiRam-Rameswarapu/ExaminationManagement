package examination;
import java.util.*;
public class ExamMode {
	public static void selectMode() throws Exception{
	Scanner s = new Scanner(System.in) ;
		System.out.println("Do you want attempt exam");
		System.out.println("Enter your choice:");
		System.out.println("1. Online mode");
		System.out.println("2. Offline mode");
		int ch=s.nextInt();
		if(ch==2) {
			System.out.println("Three centers available to attempt in offline");
			System.out.println("Enter center number:");
			System.out.println("1. VISHNU COLLEGE ");
			System.out.println("2. SRKR COLLEGE ");
			System.out.println("3. DNR COLLEGE ");
			int center=s.nextInt();
			switch(center) {
			case 1:
				System.out.println("You can go and attempt exam at VISHNU College ,Bhimavaram");
				System.out.println(".............Thank u for Visiting...........");
				
				break;
			case 2: 
				System.out.println("You can go and attempt exam at SRKR College ,Bhimavaram");
			    System.out.println(".............Thank u for Visiting...........");
			break;
			case 3:
				System.out.println("You can go and attempt exam at DNR College ,Bhimavaram");
			    System.out.println(".............Thank u for Visiting...........");
			break;
			default: 
				break;
			}
			
		}
		else if(ch==1) {
			System.out.println("Ready for Exam");
			Questions_and_Grading.question();
			System.out.println("Exam Completed");

			s.close();
		}
		else {
			System.out.println("Invallid Option");
   }

  }
}