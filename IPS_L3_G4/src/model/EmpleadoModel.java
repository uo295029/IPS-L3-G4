package model;

import java.util.Date;

import util.Util;

public class EmpleadoModel {

	public static final String SQL_ADD_EMPLOYEE = "insert into empleados (eNombre, eApellido, eDni, eTelefono, eFecha, eEmpleo, eSueldo, eDeportivo) values (?, ?, ?, ?, ?, ?, ?, ?)"; 
	
	public void addEmployee(Empleado e) {
		validate(e.getNombre(), e.getApellido(), e.getDni(), e.getTelefono(), e.getFecha(), e.getEmpleo(), e.getSueldo()); 
		
	}
	
	public void validate(String nombre, String apellido, String dni, String telefono, Date fecha, String empleo, int sueldo) {
		Util.validateNotNull(nombre, "El nombre no puede ser null");
		Util.validateNotNull(apellido, "El apellido no puede ser null");
		Util.validateNotNull(dni, "El dni no puede ser null");
		Util.validateNotNull(telefono, "El teléfono no puede ser null");
		Util.validateNotNull(fecha, "La fecha no puede ser null");
		Util.validateNotNull(empleo, "El empleo no puede ser null");
		Util.validateCondition(telefono.length() == 9, "El teléfono debe tener nueve dígitos");
		Util.validateCondition(dni.length() == 9, "El teléfono debe tener nueve dígitos");
	}
}
