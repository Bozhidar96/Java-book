import java.util.Scanner;


public class CompanyDatabase {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Name of company: ");
		String nameCompany = input.nextLine();
		
		System.out.print("Address of company: ");
		String addressCompany = input.nextLine();
		
		System.out.print("Phone number of compnay: ");
		int phoneNumber = input.nextInt();
		
		System.out.print("Fax number of company: ");
		int faxNumber = input.nextInt();
		
		System.out.print("Web site of company: ");
		String webSite = input.nextLine();
		
		System.out.print("Firstname of manager: ");
		String firstnameManager = input.nextLine();
		
		System.out.print("Lastname of manager: ");
		String lastnameManager = input.nextLine();
		
		System.out.print("Phone number of manager: ");
		int phoneNumberManager = input.nextInt();
		
		System.out.println(nameCompany);
		System.out.println(addressCompany);
		System.out.println(phoneNumber);
		System.out.println(faxNumber);
		System.out.println(webSite);
		System.out.println();
		System.out.println(firstnameManager);
		System.out.println(lastnameManager);
		System.out.println(phoneNumberManager);
		
	}

}
