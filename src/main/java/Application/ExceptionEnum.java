package Application;

public enum ExceptionEnum {
		DIVISION_BY_ZERO(1, "Division by zero not authorized"),
		UNKNOWN_OPERATION(2, "operation not implemented yet"),
		FACTORIAL_GREATER_THAN_ZERO(3,"Factorial parameter should be greater than 0");

private final int code;
private final String defaultMessage;

ExceptionEnum(int code, String defaultMessage){
	this.code = code;
	this.defaultMessage = defaultMessage;
}

public int getCode(){
	return code;
}		

public String getDefaultMessage() {
	return defaultMessage;
}

public static String getDefaultMessageByCode(int code) {
	for(ExceptionEnum e : ExceptionEnum.values()) {
		if(e.getCode() == code) {
			return e.getDefaultMessage();
		}
	}
	return "";
	}
}
