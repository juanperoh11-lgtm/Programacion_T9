package Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Double> alturas = new ArrayList<>();
		double suma = 0;

		System.out.println("Introduce la altura en metros, pulsa 0 para salir");
		while (true) {
			double h = sc.nextDouble();
			if (h == 0)
				break;
			// En primer lugar, esto esta fuera del if
			// El alturas... esto mete la altura seleccionada y suma+ = h es para que se almacenando la altura
			alturas.add(h);             
		    suma += h;
		    
		}

		if (alturas.isEmpty()) {
			System.out.println("No se introdujeron alturas.");
			return;
		}

		double media = suma / alturas.size();
		double max = alturas.get(0);
		double min = alturas.get(0);
		int porEncima = 0;
		int porDebajo = 0;

		for (double h : alturas) {
			if (h > max)
				max = h;
			if (h < min)
				min = h;

			if (h > media) {
				porEncima++;
			} else if (h < media) {
				porDebajo++;
			}
		}

	}

}
