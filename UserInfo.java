package signup.main;

import java.util.Scanner;

import signup.services.SignupServicesImpl;

public class UserInfo {
	public static void main(String[] args) {

		String email;
		String name;
		String fatherName;
		String motherName;
		String address;
		String contact;
		String gender;
		String password;
		SignupServicesImpl obj=new SignupServicesImpl();
		Scanner sc = new Scanner(System.in);
		String option;
		while (true) {
			
			System.out.println("1  add new user " + " 2 display all user" + " 3 login  " + "4   Exit");
			option = sc.next();
			switch (option) {
			case "1":
				System.out.println("enter email");
				email = sc.next();
				System.out.println("enter name");
				name = sc.next();
				System.out.println("enter father name");
				fatherName = sc.next();
				System.out.println("enter mother name");
				motherName = sc.next();
				System.out.println("enter address");
				address = sc.next();
				System.out.println("enter contact");
				contact = sc.next();
				System.out.println("enter gender");
				gender = sc.next();
				System.out.println("enter password");
				password = sc.next();
                obj.addUserInfo(email, name, fatherName, motherName, address,contact, gender, password);
                    
				break;
			case "2":
				System.out.println(obj.displayAllUser());
				break;
			case "3":
				break;
			case "4":
				sc.close();
				System.exit(0);
				break;
			}
		}

	}
}