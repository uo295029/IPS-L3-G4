package model;

import java.util.Date;

public class Employee {

	private String name;
	private String surname;
	private String dni;
	private String phone; 
	private Date birthdate;
	private String job;
	private int salary;
	private boolean sport;
	
	@SuppressWarnings("deprecation")
	public Employee(String name, String surname, String dni, String phone, int year, int month, int day, String job, int salary, boolean sport) {
		setName(name);
		setSurname(surname);
		setDni(dni);
		setPhone(phone);
		setBirthdate(new Date(year, month, day));
		setJob(job);
		setSalary(salary);
		setSport(sport);
	}
	
	private void setName(String name) {
		this.name = name;
	}

	private void setSurname(String surname) {
		this.surname = surname;
	}

	private void setDni(String dni) {
		this.dni = dni;
	}

	private void setPhone(String phone) {
		this.phone = phone;
	}

	private void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	private void setJob(String job) {
		this.job = job;
	}

	private void setSalary(int salary) {
		this.salary = salary;
	}

	private void setSport(boolean sport) {
		this.sport = sport;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getDni() {
		return dni;
	}

	public String getPhone() {
		return phone;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public String getJob() {
		return job;
	}

	public int getSalary() {
		return salary;
	}

	public boolean isSport() {
		return sport;
	}	
}
