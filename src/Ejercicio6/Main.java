package Ejercicio6;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Integer> Secuencia = new ArrayList<Integer>();
		final int n = 10;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= i; j++) {
				Secuencia.add(i);
			}
		}
		// En principio pone lo mismo que en el toString
		System.out.println( Secuencia);

	}

}
