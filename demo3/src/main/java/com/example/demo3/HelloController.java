package com.example.demo3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.awt.event.ActionEvent;

public class HelloController {

    private long number1;
    private String operator;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }


    @FXML
    private void processNumPad(AnctionEvent event)
    {
        String value = ((Button) event.getSource()).getText();
    }

    @FXML
    private void processOperation(AnctionEvent event)
    {

    }

    private String calculate(long number1, long number2, String op)
    {
        switch (op)
        {
            case "+":
                return String.valueOf(number1 + number2);
            case "-":
                return String.valueOf(number1 - number2);
            case "*":
                return String.valueOf(number1 * number2);
            case "/":
                if(number2 == 0)
                {
                    return "ERROR";
                }
                return String.valueOf(number1 / number2);
        }
        return "EROR";
    }




}