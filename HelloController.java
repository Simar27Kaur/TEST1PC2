package com.example._1test;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;




public class HelloController {


    public TextField username;
    public PasswordField password;
    @FXML
    private Label welcomeText;

    String x = "SIMAR";

    String y = "54321";

    Integer counter = 6;

    @FXML
    protected void onHelloButtonClick() {


        welcomeText.setText("");
        String u = username.getText();

        String p = password.getText();


        if (x.equals(u) && y.equals(p)) {

            counter = 6;

            welcomeText.setText("Login Successful");

        }else if (x.equals(u) && y!=p) {


            if (counter==0) {

                welcomeText.setText("Account Locked");

            }else{

                counter--;

                welcomeText.setText("You have "+ counter +"Attempt left");
            }
        }else{

            welcomeText.setText("Invalid Username or Password");
        }

    }
}

