package es.cj.ejerciciosif.datos;

import java.util.Scanner;

public class EjercicioSemanal2 {

	//Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera
	// Si trabaja 40 horas o menos se le paga 16€ por hora
	// Si trabaja mas de 40 horas se le paga 16€ por cada una de las primeras 40 horas y 20 por cada una extra
	
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	
		System.out.println("Introduzca las horas de trabajo: ");	
	    int horas = sc.nextInt();
	    
	    if (horas <= 40) {
	    	int ganancias = horas * 16;
	    	System.out.println(ganancias);
	    } else {
	    	int ganancias = 640 + (horas - 40) * 20;
	    	System.out.println(ganancias);
	    }
	
		
	}
}
