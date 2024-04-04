package Models;


import java.util.ArrayList;
import java.util.List;
import java.io.*;


public class LoginModel {
	private List<String> users;

	public LoginModel() {
		this.users = new ArrayList<>();
	}

    public boolean isValidUser(String username, char[] password) {
    	return users.contains(username) && String.valueOf(password).equals("134679258a"); 
    }

	public void loadUsersFromFile(String filePath) {
	    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
	    	users = reader.lines().toList();
	    } catch (IOException e) {
	    	e.printStackTrace();
	    }
	}
}
