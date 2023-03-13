package com.example.demo3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.*;

public class HelloController {

    private long number1;
    private String operator;

    @FXML
    private Label output;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }


    @FXML
    private void processNumPad(ActionEvent event)
    {
        String value = ((Button) event.getSource()).getText();
        output.setText(output.getText() + value);
    }

    @FXML
    private void processOperation(ActionEvent event)
    {
        String value = ((Button) event.getSource()).getText();
        if(!value.quals("="))
        {
            if(!operator.isEmpty())
            {
                return;
            }
            operator = value;
            number1 = long.parseLong(output.getText());
            output.setText("");
        }
        else
        {
            if (operator.isEmpty())
            {
                return;
            }
            if (output.getText().isEmplty())
            {
                output.setText("ERROR");
                operator = "";
            }
            output.setText(calculate(number1, long.parseLong(output.getText()), operator));
            operator = "";
        }
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