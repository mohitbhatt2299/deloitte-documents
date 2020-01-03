package signup.services;

import java.util.ArrayList;


import signup.model.SignUpModel;

public interface signUpServicesInterface {
	public void addUserInfo(String email, String name,String fathername,String motherName,String address,String contact,String gender,String password);
    public ArrayList<SignUpModel> displayAllUser();
    
}
