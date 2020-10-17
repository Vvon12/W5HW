package au.edu.unsw.business.infs2605.W4E1IndiefyLoginScreen;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.sql.*;
import org.mindrot.jbcrypt.BCrypt;

public class LoginScreenController {

    //Initiate JavaFX nodes (visual elements), how do we connect these variables to the FXML view?
    @FXML
    TextField userName;

    @FXML
    TextField password;

    @FXML
    Label errorInfo;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
     
    /* What should happen when you click the login button?
       How do we connect this function to the FXML view? */
    @FXML
    private void handleLoginButtonAction(ActionEvent event) throws IOException, SQLException {
        
        // Get the user's input from the GUI
        String userInput = userName.getText();
        String passwordInput = password.getText();
        if(DatabaseManager.login(userInput, passwordInput)){
            errorInfo.setText("");
            App.setRoot("Tracks");
        }else{
            errorInfo.setText("Sorry, incorrect credentials.");
        }

    }


    private void handleNextButtonAction(ActionEvent event) throws IOException {
        // What method should we call?
    }

    
    public void initialize() {
        // What should the user see when the screen loads?
    }

}

/*What should we test?*/
