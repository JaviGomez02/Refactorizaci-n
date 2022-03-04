package com.test.refactoring.Business;
/**
 * Clase para el camion
 * @author Javier Gómez
 *
 */
public class Camion {

	/**
	 * Matricula del camion
	 */
	private String matricula;
	/**
	 * Color del camion
	 */
	private String color;
	/**
	 * Tipo de combustible
	 */
	private String combustible;
	/**
	 * Tipo de carnet del conductor
	 */
	private String tipoCarnet;
	/**
	 * Nombre del conductor
	 */
	private String nombreConductor;
	/**
	 * DNI del conductor
	 */
	private String dniConductor;
	/**
	 * Constructor que no recibe ningún parámetro
	 */
	public Camion() {
		super();
	}
	/**
	 * Constructor que recibe todos los parámetros
	 * @param matricula Matricula del camion
	 * @param color Color del camion
	 * @param combustible Tipo de combustible
	 * @param tipoCarnet Tipo de carnet
	 * @param nombreConductor Nombre del conductor
	 * @param dniConductor DNI del conductor
	 */
	public Camion(String matricula, String color, String combustible, String tipoCarnet, String nombreConductor, String dniConductor) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.combustible = combustible;
		this.tipoCarnet = tipoCarnet;
		this.nombreConductor = nombreConductor;
		this.dniConductor = dniConductor;
	}

	/**
	 * Método que devuelve la matricula del camion
	 * @return Matricula del camion
	 */
	public String getMatricula() {
		return matricula;
	}
	
	/**
	 * Método que recibe la matricula para asignarla al camion
	 * @param matricula Matricula nueva del camion
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	/**
	 * Método que devuelve el color del camion
	 * @return Color del camion
	 */
	public String getColor() {
		return color;
	}
	/**
	 * Método que recibe un color para asignarle al camion
	 * @param color Color nuevo del camion
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * Método que devuelve el tipo de combustible del camion
	 * @return Tipo de combustible
	 */
	public String getCombustible() {
		return combustible;
	}
	/**
	 * Método que recibe un tipo de combustible para asignarle al camion
	 * @param combustible Tipo de combustible
	 */
	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	/**
	 * Método que devuelve el tipo de carnet
	 * @return Tipo de carnet
	 */
	public String getTipoCarnet() {
		return tipoCarnet;
	}
	/**
	 * Método que recibe el tipo de carnet del conductor para asignarlo al camion
	 * @param tipoCarnet Tipo de carnet
	 */
	public void setTipoCarnet(String tipoCarnet) {
		this.tipoCarnet = tipoCarnet;
	}

	/**
	 * Método que devuelve el nombre del conductor
	 * @return Nombre del conductor
	 */
	public String getNombreConductor() {
		return nombreConductor;
	}

	/**
	 * Método que recibe el nombre del conductor para asignarlo a la clase
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
	 * Método que recibe el DNI del conductor para asignarlo
	 * @param dniConductor DNI del conductor
	 */
	public void setDniConductor(String dniConductor) {
		this.dniConductor = dniConductor;
	}
	/**
	 * Método para informar de la aceleracion del vehículo
	 * @param velocidad Velocidad del camion
	 */
	public void acelerar(Integer velocidad) {
		System.out.println("La aceleraci�n del cami�n se realizar� progresivamente para conservar sus neum�ticos");
		
		//TO DO
		//Incluir l�gica de movimiento
	}
	/**
	 * Método para informar de la detención del vehículo
	 */
	public void detener() {
		System.out.println("CUIDADO!! La detenci�n de un veh�culo de gran tama�o puede ocasionar accidentes de tr�fico");
	}

	@Override
	/**
	 * Método que devuelve toda la informacion del camion
	 */
	public String toString() {
		return "Camion [matricula=" + matricula + ", color=" + color + ", combustible=" + combustible + ", tipoCarnet="
				+ tipoCarnet + ", nombre_conductor=" + nombreConductor + ", dniConductor=" + dniConductor + "]";
	}
	
}
