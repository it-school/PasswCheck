package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class WelcomeController
{

    public void registration()
    {
        Parent registrationForm = null;
        try
        {
            registrationForm = FXMLLoader.load(getClass().getResource("registration.fxml"));
            Stage RegistrationStage = new Stage();

            RegistrationStage.setTitle("Registration form");
            RegistrationStage.setScene(new Scene(registrationForm, 600, 400));
            RegistrationStage.show();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void tryToLogin(ActionEvent actionEvent)
    {
        // todo check if user exists and active password correct
    }
}
