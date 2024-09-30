package model;

import java.util.Date;

import util.Util;

public class EmployeeModel {

	public static final String SQL_ADD_EMPLOYEE = "insert into empleados(eNombre, eApellido, eDni, eTelefono, eFecha, eEmpleo, eSueldo, eDeportivo) values (?, ?, ?, ?, ?, ?, ?, ?)"; 
	
	public void addEmployee(Employee e) {
		validate(e.getName(), e.getSurname(), e.getDni(), e.getPhone(), e.getBirthdate(), e.getJob(), e.getSalary(), e.isSport()); 
		
	}
	
	public void validate(String name, String surname, String dni, String phone, Date birthdate, String job, int salary, boolean sport) {
		Util.validateNotNull(name, "El nombre no puede ser null");
		Util.validateNotNull(surname, "El apellido no puede ser null");
		Util.validateNotNull(dni, "El dni no puede ser null");
		Util.validateNotNull(phone, "El teléfono no puede ser null");
		Util.validateNotNull(birthdate, "La fecha no puede ser null");
		Util.validateNotNull(job, "El empleo no puede ser null");
		Util.validateCondition(phone.length() == 9, "El teléfono debe tener nueve dígitos");
		Util.validateCondition(dni.length() == 9, "El teléfono debe tener nueve dígitos");
		Util.validateCondition(salary > 0, "El sueldo debe ser superior a 0");
		if(!sport) Util.validateCondition(checkAdult(birthdate), "Debe ser mayor de edad si no es empleado deportivo");
	}
	
	@SuppressWarnings("deprecation")
	private boolean checkAdult(Date birthdate) {
		Date now = new Date();
		int year = now.getYear();
		now.setYear(year - 18);
		return birthdate.before(now);
	}
}
