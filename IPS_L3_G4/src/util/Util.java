package util;

public class Util {

	public static void validateNotNull(String obj, String message) {
		if (obj == null || obj.isBlank()) {
			throw new NullPointerException(message);
		}
	}
	
	public static void validateNotNull(Object obj, String message) {
		if (obj == null) throw new NullPointerException(message);
	}
	
	public static void validateCondition(boolean condition, String message) {
		if (!condition) throw new RuntimeException(message); //Cambiar por excepcion de la aplicacion
	}
	
}
