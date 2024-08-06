package org.group8.assignment3javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField input1;
    @FXML
    private TextField input2;
    @FXML
    private Button calculateButton;
    @FXML
    private Label resultLabel;

    private Model model = new Model();

    @FXML
    public void initialize() {
        calculateButton.setOnAction(event -> {
            int num1 = Integer.parseInt(input1.getText());
            int num2 = Integer.parseInt(input2.getText());
            int result = model.add(num1, num2);
            resultLabel.setText(String.valueOf(result));
        });
    }
}
