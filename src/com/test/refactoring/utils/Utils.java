package com.test.refactoring.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Clase Utils
 * @author Javi Gómez
 *
 */
public class Utils {
	/**
	 * Método que devuelve la hora actual
	 * @return Hora actual
	 */
	public static String horaActual() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        //System.out.println("HH:mm:ss-> "+dtf.format(LocalDateTime.now()));
        
        return dtf.format(LocalDateTime.now());
	}
	/**
	 * Método que devuelve la fecha actual
	 * @return Fecha actual
	 */
	public static String fechaActual() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        //System.out.println("yyyy/MM/dd-> "+dtf.format(LocalDateTime.now()));
        
        return dtf.format(LocalDateTime.now());
	}
	
	/**
	 * Método para calcular el precio de alquiler
	 * @param dias Días de alquiler
	 * @return Precio calculado
	 */
	public static float calcularPrecioAlquiler (Integer dias) {
		float result = 0;
		//El coste de un d�a de alquiler son 50� + 21% de IVA
		result = dias * 50 * 1.21f;
		return result;
	}
	
	/**
	 * Método para calcular el precio del Renting
	 * @param meses Meses de rentado
	 * @return Precio calculado
	 */
	public static float calcularPrecioRenting (Integer meses ) {
		//El coste de un mes de renting son 750� + 21% IVA
		return meses * 750 * 1.21f;
	}

}
