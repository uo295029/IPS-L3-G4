package model;

import java.util.Date;

public class Empleado {

	private String nombre;
	private String apellido;
	private String dni;
	private String telefono;
	private Date fecha;
	private String empleo;
	private int sueldo;
	private boolean deportivo;
	
	@SuppressWarnings("deprecation")
	public Empleado(String nombre, String apellido, String dni, String telefono, int ano, int mes, int dia, String empleo, int sueldo, boolean deportivo) {
		setNombre(nombre);
		setApellido(apellido);
		setDni(dni);
		setTelefono(telefono);
		setFecha(new Date(ano, mes, dia));
		setEmpleo(empleo);
		setSueldo(sueldo);
		setDeportivo(deportivo);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	private void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getDni() {
		return dni;
	}
	
	private void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	private void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public Date getFecha() {
		return fecha;
	}
	
	private void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public String getEmpleo() {
		return empleo;
	}
	
	private void setEmpleo(String empleo) {
		this.empleo = empleo;
	}
	
	public int getSueldo() {
		return sueldo;
	}
	
	private void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	
	public boolean getDeportivo() {
		return deportivo;
	}
	
	private void setDeportivo(boolean deportivo) {
		this.deportivo = deportivo;
	}
}
