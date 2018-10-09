package es.cj.ejerciciosif.datos;

import java.util.Scanner;

public class explicaciones {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//pedir dos numeros y comprobar si son iguales
		
		System.out.println("Nº 1: ");
		int num1 = sc.nextInt();
		

		System.out.println("Nº 2: ");
		int num2 = sc.nextInt();

		if (num1 == num2) {
			System.out.println(num1 + " es igual a " + num2);
		} else {
			System.out.println(num1 + " no es igual a " + num2);
		}
		
		boolean condicion = num1 == num2;
		if (condicion == true)
			System.out.println(num1 + " es igual a " + num2);
		else
			System.out.println(num1 + " no es igual a " + num2);
		
		
		//pedir un numero e identificar si es positivo, negativo o cero.
		
		if (num1 > 0)
			System.out.println(num1 + " es positivo ");
		else if (num1 < 0)
			System.out.println(num1 + " es negativo ");
		else
			System.out.println(num1 + " es cero ");
		
		//pedir dos numeros y decir si uno es multiplo del otro
		
		if (num1 % num2 == 0)
			System.out.println(num1 + " es multiplo de " + num2);
		else if (num2 % num1 == 0)
			System.out.println(num2 + " es multiplo de " + num1);
		else
			System.out.println(" no son multiplos ");
		
		//pedir dos numeros e indicar cual es el mayor o si son iguales.
		
		if (num1 > num2)
			System.out.println(num1 + " es mayor que" + num2);
		else if (num2 > num1)
			System.out.println(num2 + " es mayor que" + num1);
		else
			System.out.println(num1 + "es igual que" + num2);
		
		//pedir tres numeros y mostrarlos ordenados
		
		System.out.println("Nº3: ");
		int num3 = sc.nextInt();
		
		if (num1 > num2 && num1 > num3) { 
			if (num2 > num3)
				System.out.println(num1 +"," + num2 + "," + num3);
			else
				System.out.println(num1 + "," + num3 + "," + num2);
		} else if (num2 > num1 && num2 > num3) {
			if (num1 > num3 )
				System.out.println(num2 + "," + num1 + "," + num3);
			else
				System.out.println(num2 + "," + num3 + "," + num1);
		} else if (num3 > num1 && num3 > num2) {
			if (num1 > num2)
				System.out.println(num3 + "," + num1 + "," + num2);
			else
				System.out.println(num3 + "," + num2 + "," + num1);
		} else 
			System.out.println("son iguales");
		
		
				
		sc.close();		
	}
}
