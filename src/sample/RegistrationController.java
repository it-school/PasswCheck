package sample;

import javafx.fxml.FXML;

import java.awt.*;

import static sample.Main.users;

public class RegistrationController
{
    @FXML
    TextField regLogin;

    @FXML
    TextField regPassword;

    public void registration()
    {
//        String loginNew = regLogin.getText();
//        String passwordNew = regPassword.getText();
        String loginNew = "user";
        String passwordNew = "QWer45&*";

        // todo check if login exists
            for (User user:users)
            {
                if (user.login.equals(loginNew))
                    return;
            }
        System.out.println("User is new");

        // todo check if password valid
        int errCode = Password.isValid(passwordNew);
        System.out.println(ErrorsInfo.getMessage(errCode));

        if (errCode > 0)
        {
            return;
        }

        User user = new User(loginNew, new Passwords());


        users.add(user);
    }
}