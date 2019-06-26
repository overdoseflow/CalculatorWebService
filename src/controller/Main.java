package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main  {

	public static int calculate(int x, int y, String operation) {
	int result;
	String op;

	if ("ADD".equals(operation)) {
		result = x + y;
		op = "+";
	} else if ("SUB".equals(operation)) {
		result = x - y;
		op = "-";
	} else if ("MULT".equals(operation)) {
		result = x * y;
		op = "*";
	} else if ("DIV".equals(operation)) {
		result = x / y;
		op = "/";
	} else {
		// defaults to SUB
		result = x - y;
		op = "-";
	}

	//log(x, y, result, op);

	return result;
}

}
