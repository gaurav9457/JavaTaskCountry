package StudentPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

class RegisterStudentBase {

	String firstName,lastName,emailId,city,state,collegeName,department;
	int age;
	long mobileNo;
	Scanner scanner=new Scanner(System.in);
	
	public void formData() {
		System.out.println("Enter FirstName :");
		firstName=scanner.next();
		
		System.out.println("Enter LastName :");
		lastName=scanner.next();
		
		System.out.println("Enter age :");
		age=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Email_id :");
		emailId=scanner.next();
		
		System.out.println("Enter Mobile-no :");
		mobileNo=scanner.nextLong();
		long mono=mobileNo/1000000000;
		while (true) {
			if (mobileNo/1000000000<6 ||  mobileNo/1000000000>9) {
				System.out.println("Enter mobile no starting with 6 to 9");				
				mobileNo=scanner.nextLong();
			}
			
			else {
				//System.out.println("Accepted");
				break;
			}
			
		}
		
		
		scanner.nextLine();
		System.out.println("Enter City :");
		city=scanner.next();
		
		System.out.println("Enter State :");
		state=scanner.next();
		scanner.nextLine();
		System.out.println("Enter College Name :");
		collegeName=scanner.nextLine();
		
		System.out.println("Enter department : ");
		department=scanner.nextLine();
		
		System.out.println("-----------------------------Form Submitted------------------------------");
		
		//System.out.println(firstName+" "+lastName+" "+age+" "+emailId+" "+mobileNo+" "+city+" "+state+" "+collegeName+" "+department);
	}
	
	public void display() {
		
		System.out.println("-------------------------Registred user-information--------------------");
		System.out.println("First Name : "+firstName);
		System.out.println("Last Name : "+lastName);
		System.out.println("Age : "+age);
		System.out.println("Mobile no : "+mobileNo);
		System.out.println("Email-id : "+emailId);
		System.out.println("City : "+city);
		System.out.println("State : "+state);
		System.out.println("College Name : "+collegeName);
		System.out.println("Department : "+department);

	}
	public void update() {
		System.out.println(firstName);
		
	}
}
 public class RegisterStudent{
	 
	public static void main(String[] args) {
//		Connection connection;
//		try {
//			connection=DriverManager.getConnection("");
//		} catch (SQLException e) {
//			
//			e.printStackTrace();
//		}
		
		
		System.out.println("----------------------------Student Registration form---------------------");
		RegisterStudentBase registerStudentBase=new RegisterStudentBase();
		registerStudentBase.formData();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your choice ");
		System.out.println("1. Register Again \n2. View User");
		int choice= sc.nextInt();
		
		switch (choice) {
		case 1:
			registerStudentBase.formData();
			break;
		case 2:
			registerStudentBase.display();
			break;
		default:
			 System.out.println("Invalid choice.");
             System.exit(0);
			
		}
		
		sc.close();
		//System.out.println("End");
	}
	
}
