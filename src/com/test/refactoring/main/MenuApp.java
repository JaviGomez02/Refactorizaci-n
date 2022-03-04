package com.test.refactoring.main;

import java.util.Scanner;

import com.test.refactoring.Business.Camion;
import com.test.refactoring.Business.Coche;
import com.test.refactoring.utils.Utils;

/**
 * Clase del menú del programa
 * @author Javi Gómez
 *
 */
public class MenuApp {
	/**
	 * Importación del escaner
	 */
	public static Scanner teclado= new Scanner(System.in);

	/**
	 * Método main donde se ejecuta el programa principal
	 * @param args Argumentos
	 */
	public static void main(String[] args) {
		
		mostrarPresentacion();
		mostrarBienvenida();
		
		int numCoches= leerEntero("Introduce el número de coches: ");
		Coche[] listaCoches = new Coche[numCoches];
		for (int i=0; i<numCoches; i++) {
			listaCoches[i] = new Coche();
			listaCoches[i].acelerar(10);
		}
		
		int numCamiones= leerEntero("Introduce el número de camiones");
		Camion[] listaCamiones = new Camion[numCamiones];
		for (int i=0; i<numCamiones; i++) {
			listaCamiones[i] = new Camion();
			listaCamiones[i].acelerar(10);
		}
		
		detenerVehiculos(listaCoches);
		detenerVehiculos(listaCamiones);
		
	}
	/**
	 * Método que muestra la presentación del programa
	 */
	private static void mostrarPresentacion () {
		System.out.println("/*******************************************************************************/");
		System.out.println("/***                                                                         ***/");
		System.out.println("/***     VAMOS A REFACTORIZAR...HAY QUE ELIMINAR LOS MALOR OLORES YA!!       ***/");
		System.out.println("/***                                                                         ***/");
		System.out.println("/*******************************************************************************/");
	}
	/**
	 * Método que pide al usuario sus datos y muestra la bienvenida
	 */
	private static void mostrarBienvenida () {
		String nombre = leerCadena("Introduce tu nombre: ");
		String primerApellido=leerCadena("Introduce tu apellido: ");
		System.out.println("/*******************************************************************************/");
		System.out.println("/***                                                                         ***/");
		System.out.println("/*** BIENVENIDO/A " + nombre + " " + primerApellido);
		System.out.println("/*** " + Utils.fechaActual() );
		System.out.println("/*** " + Utils.horaActual() );
		System.out.println("/***                                                                         ***/");
		System.out.println("/*******************************************************************************/");
	}
	
	/**
	 * Método para detener los coches
	 * @param listaCoches Lista de coches
	 */
	private static void detenerVehiculos(Coche[] listaCoches) {
		for (int i=0; i<listaCoches.length; i++) {
			listaCoches[i].detener();
		}
	}
	/**
	 * Método para detener los camiones
	 * @param listaCamiones Lista de camiones
	 */
	private static void detenerVehiculos(Camion[] listaCamiones) {
		for (int i=0; i<listaCamiones.length; i++) {
			listaCamiones[i].detener();
		}
	}
	/**
	 * Método que sirve para leer las cadenas
	 * @param texto Texto que se imprime al ejecutar el método
	 * @return La información escrita por el usuario
	 */
	public static String leerCadena(String texto) {
		System.out.println(texto);
		return teclado.nextLine();
	}
	/**
	 * Método que sirve para leer los números enteros
	 * @param texto Texto que se imprime al ejecutar el método
	 * @return La información escrita por el usuario
	 */
	public static int leerEntero(String texto) {
		System.out.println(texto);
		return Integer.parseInt(teclado.nextLine());
	}

}
