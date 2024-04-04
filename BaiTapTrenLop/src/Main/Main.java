package Main;

import Controllers.LoginController;
import Models.LoginModel;
import Views.LoginView;

public class Main {
	 public static void main(String[] args) {
	     LoginModel model = new LoginModel();
	     LoginView view = new LoginView();
	     LoginController controller = new LoginController(model, view);
	     controller.loadUsersFromFile("/Volumes/VKU/JAVA/BaiTapTrenLop/users.txt");
	    }
}
