package com.cice.ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		String prueba="pepe juan manolo ricardo";
		
		int y=prueba.indexOf(" ");
		System.out.println(y);
		
		String pruebaRen=prueba.replace(" ", "/ ");
		
		for(int i=0;i<prueba.length();i++) {
			System.out.println(prueba.indexOf(" ",i));
		}
		
		System.out.println(pruebaRen);

	}

}
