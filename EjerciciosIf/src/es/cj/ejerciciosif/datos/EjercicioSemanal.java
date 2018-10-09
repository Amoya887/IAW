package es.cj.ejerciciosif.datos;

import java.util.Scanner;

public class EjercicioSemanal {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		//Se solicita leer un numero entero positivo y determinar si es un numero de 1, 2, 3 o 4 cifras.
		
		System.out.println("introduzca un numero positivo que contenga como máximo 4 cifras: ");
		
		int num = sc.nextInt();
		
		if (num > 0 && num <= 9999) {
			if (num > 0 && num < 10) {
				System.out.println(" El numero tiene una cifras");
			} else if (num <= 99 && num >= 10) {
				System.out.println(" El numero tiene dos cifras");
			} else if (num <= 999 && num >= 100) {
				System.out.println(" El numero tiene tres cifras");
			} else {
				System.out.println("El numero tiene cuatro cifras");
			}
			
		}
	}
}



