package com.cice.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String cadena1,cadena2,cadena3;
		
		System.out.print("Escribe una cadena de caracteres: ");
		cadena1=teclado.nextLine();
		System.out.print("Escribe otra cadena de caracteres: ");
		cadena2=teclado.nextLine();
		System.out.print("Escribe otra cadena de caracteres: ");
		cadena3=teclado.nextLine();
		
		int s1=cadena1.length();
		int s2=cadena2.length();
		int s3=cadena3.length();
		
		if(s1>s2 && s1>s3) {
			System.out.println("-----------------");
			System.out.println("La primera palabra tiene mas caracteres: "+cadena1);
		}
		else if(s2>s1 && s2>s3){
			System.out.println("-----------------");
			System.out.println("La segunda palabra tiene mas caracteres: "+cadena2);
		}
		else if(s3>s1 && s3>s2){
			System.out.println("-----------------");
			System.out.println("La tercera palabra tiene mas caracteres: "+cadena3);
		}
		else{
			System.out.println("-----------------");
			System.out.println("La longitud de dos palabras son iguales.");
		}

	}

}
