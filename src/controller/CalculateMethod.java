package controller;

public class CalculateMethod {

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
