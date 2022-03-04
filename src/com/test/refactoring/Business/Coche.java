package com.test.refactoring.Business;

/**
 * Clase para el coche
 * @author Javier Gómez
 *
 */
public class Coche {
	/**
	 * Matricula del coche
	 */
	private String matricula;
	/**
	 * Color del coche
	 */
	private String color;
	/**
	 * Tipo de combustible del coche
	 */
	private String combustible;
	/**
	 * Numero de plazas del coche
	 */
	private Integer numPlazas;
	/**
	 * Nombre del conductor
	 */
	private String nombreConductor;
	/**
	 * DNI del conductor
	 */
	private String dniConductor;
	/**
	 *Constructor que no recibe ningún parámetro
	 */
	public Coche() {
		super();
	}
	/**
	 *Constructor que recibe información de todos los atributos
	 * @param matricula Matricula del coche
	 * @param color Color del coche
	 * @param combustrible Tipo de combustible
	 * @param numPlazas Numero de plazas del coche
	 * @param nombreConductor Nombre del conductor
	 * @param dniConductor DNI del conductor
	 */
	public Coche(String matricula, String color, String combustrible, Integer numPlazas, String nombreConductor, String dniConductor) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.combustible = combustrible;
		this.numPlazas =  numPlazas;
		this.nombreConductor = nombreConductor;
		this.dniConductor = dniConductor;
	}
	/**
	 * Método que devuelve la matrícula del coche
	 * @return Matrícula del coche
	 */
	public String getMatricula() {
		return matricula;
	}
	/**
	 * Método que recibe una matrícula para asignarla al vehículo
	 * @param matricula Matrícula del coche
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	/**
	 * Método que devuelve el color del coche
	 * @return Color del coche
	 */
	public String getColor() {
		return color;
	}
	/**
	 * Método que recibe un color para asignarlo al coche
	 * @param color Color del coche
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * Método que devuelve el tipo de combustible del coche
	 * @return Tipo de combustible
	 */
	public String getCombustible() {
		return combustible;
	}
	/**
	 * Método que recibe un tipo de combustible y se lo asigna al coche
	 * @param combustible Tipo de combustible
	 */
	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	
	/**
	 * Método que devuelve el número de plazas del vehículo
	 * @return Numero de plazas del coche
	 */
	public Integer getNumPlazas() {
		return numPlazas;
	}
	
	/**
	 * Método que recibe el número de plazas para asignarlo al coche
	 * @param numPlazas Numero de plazas
	 */
	public void setNumPlazas(Integer numPlazas) {
		this.numPlazas = numPlazas;
	}
	
	/**
	 * Método que devuelve el nombre del conductor
	 * @return Nombre del conductor
	 */
	public String getNombreConductor() {
		return nombreConductor;
	}
	/**
	 * Método que recibe el nombre del conductor para asignarlo
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
	 * Método que recibe el DNI del conductor y lo asigna
	 * @param dniConductor DNI del conductor
	 */
	public void setDniConductor(String dniConductor) {
		this.dniConductor = dniConductor;
	}
	
	/**
	 * Método para informar de la velocidad del vehículo
	 * @param velocidad Velocidad del coche
	 */
	public void acelerar(Integer velocidad) {
		if (velocidad > 0 && velocidad < 120) {
			System.out.println("El coche est� acelerando y llegar� la velocidad de " + velocidad.intValue() + " km/h");
		} else {
			System.out.println("La velocidad indicada no est� permitida en un coche seg�n la DGT");
		}
	}
	/**
	 * Método que informa sobre la detención del coche
	 */
	public void detener() {
		System.out.println("El coche se detendr� en breve, aseg�rese de buscar un lugar adecuado para estacionar");
	}

	@Override
	/**
	 * Método que devuelve toda la información del coche
	 */
	public String toString() {
		return "Coche [matricula=" + matricula + ", color=" + color + ", combustible=" + combustible + ", numPlazas="
				+ numPlazas + ", nombre_conductor=" + nombreConductor + ", dniConductor=" + dniConductor + "]";
	}

}
