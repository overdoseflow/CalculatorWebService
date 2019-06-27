package controller;

public class Main  {

	public static int calculate(float first_number, float second_number, String operation) {
	int result;
	String operational_result;

	if ("ADD".equals(operation)) {
		result = first_number + second_number;
		operational_result = "+";
	} else if ("SUB".equals(operation)) {
		result = first_number - second_number;
		operational_result = "-";
	} else if ("MULT".equals(operation)) {
		result =first_number * second_number;
		operational_result = "*";
	} else if ("DIV".equals(operation)) {
		result = first_number / second_number;
		operational_result = "/";
	} else {
	}

	return result;
}

}
