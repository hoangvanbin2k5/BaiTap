package Controllers;

import javax.swing.JOptionPane;

import Models.LoginModel;
import Views.LoginView;

public class LoginController {
    private LoginModel model;
    private LoginView view;

    public LoginController(LoginModel model, LoginView view) {
        this.model = model;
        this.view = view;

        this.view.addLoginListener(e -> {
            String username = view.getUsername();
            char[] password = view.getPassword();
            boolean isValid = model.isValidUser(username, password);
            if (isValid) {
                JOptionPane.showMessageDialog(null, "Đăng nhập thành công");
            } else {
                JOptionPane.showMessageDialog(null, "Sai tài khoản hoặc mật khẩu");
            }
        });
    }

    public void loadUsersFromFile(String filePath) {
        model.loadUsersFromFile(filePath);
    }
}
