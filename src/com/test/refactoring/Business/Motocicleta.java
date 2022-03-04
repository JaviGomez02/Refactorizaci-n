package com.test.refactoring.Business;

/**
 * Clase para la motocicleta
 * @author Javier Gómez
 *
 */
public class Motocicleta {
	/**
	 * Matricula de la motocicleta
	 */
	private String matricula;
	/**
	 * Color de la motocicleta
	 */
	private String color;
	/**
	 * Combustible de la motocicleta
	 */
	private String combustible;
	/**
	 * Cilindrada de la motocicleta
	 */
	private Integer cilindrada;
	/**
	 * Nombre del conductor
	 */
	private String nombreConductor;
	/**
	 * DNI del conductor
	 */
	private String dniConductor;
	
	/**
	 * Constructor que recibe informacion sobre todos los atributos
	 * @param matricula Matricula de la motocicleta
	 * @param color Color de la motocicleta
	 * @param combustible Combustible
	 * @param cilindrada Cilindrada
	 * @param nombreConductor Nombre de conductor
	 * @param dniConductor DNI de conductor
	 */
	public Motocicleta(String matricula, String color, String combustible, Integer cilindrada, String nombreConductor,
			String dniConductor) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.combustible = combustible;
		this.cilindrada = cilindrada;
		this.nombreConductor = nombreConductor;
		this.dniConductor = dniConductor;
	}

	/**
	 * Método que devuelve la matrícula
	 * @return Matrícula de la motocicleta
	 */
	public String getMatricula() {
		return matricula;
	}
	/**
	 * Método que recibe la matrícula
	 * @param matricula Matricula
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * Método que devuelve el color 
	 * @return Color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Método que recibe el color
	 * @param color Color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Método que devuelve el combustible
	 * @return Combustible
	 */
	public String getCombustible() {
		return combustible;
	}
	/**
	 * Método que recibe el combustible
	 * @param combustible Combustible
	 */
	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	/**
	 * Método que devuelve la cilindrada
	 * @return Cilindrada
	 */
	public Integer getCilindrada() {
		return cilindrada;
	}

	/**
	 * Método que recibe la cilindrada
	 * @param cilindrada Cilindrada
	 */
	public void setCilindrada(Integer cilindrada) {
		this.cilindrada = cilindrada;
	}

	/**
	 * Método que devuelve el nombre del conductor
	 * @return Nombre del conductor
	 */
	public String getNombreConductor() {
		return nombreConductor;
	}
	

	/**
	 * Método que recibe el nombre del conductor
	 * @param nombreConductor Nombre del conductor
	 */
	public void setNombreConductor(String nombreConductor) {
		this.nombreConductor = nombreConductor;
	}

	/**
	 * Método que devuelve el DNI del conductor
	 * @return DNI del conductor
	 */
	public String getDniConductor() {
		return dniConductor;
	}

	/**
	 * Método que recibe el DNI
	 * @param dniConductor DNI
	 */
	public void setDniConductor(String dniConductor) {
		this.dniConductor = dniConductor;
	}
	
	/**
	 * Método para acelerar
	 * @param velocidad Velocidad de la motocicleta
	 */
	public void acelerar(Integer velocidad) {
		//TO DO
	}
	
	/**
	 * Método para detener el vehículo
	 */
	public void detener() {
		//TO DO
	}

	@Override
	/**
	 * Método que devuelve toda la información
	 */
	public String toString() {
		return "motocicleta [matricula=" + matricula + ", color=" + color + ", combustible=" + combustible
				+ ", cilindrada=" + cilindrada + ", nombre_conductor=" + nombreConductor + ", dniConductor="
				+ dniConductor + "]";
	}	

}
