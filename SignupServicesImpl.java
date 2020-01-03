package signup.services;

import java.util.ArrayList;

import signup.SignupDAO.SignUpDatabase;

import signup.model.SignUpModel;

public class SignupServicesImpl implements signUpServicesInterface {

	public void addUserInfo(String email, String name, String fatherName, String motherName,
		String address, String contact, String gender, String password) {
		SignUpModel signObj = new SignUpModel();
		signObj.setEmail(email);
		signObj.setName(name);
		signObj.setFatherName(fatherName);
		signObj.setMotherName(motherName);
		signObj.setAddress(address);
		signObj.setContact(Long.parseLong(contact));

		signObj.setGender(gender);
		signObj.setPassword(password);
		
	 SignUpDatabase.addUser(signObj);
	}

	@Override
	public  ArrayList<SignUpModel> displayAllUser() {
		// TODO Auto-generated method stub
		return SignUpDatabase.displayAllUser();
	}

}
