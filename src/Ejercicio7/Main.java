package Ejercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> A = new ArrayList<String>();
		ArrayList<String> B = new ArrayList<String>();
		String palabra;

		final int n = 10;
		final int m = 5;

		System.out.println("Introduce 10 cadenas de texto:");

		for (int i = 0; i < n; i++) {
			if (i < m) {
				System.out.print("Introduce cadena para la lista A (" + (i + 1) + "): ");
				palabra = sc.nextLine();
				A.add(palabra);
			} else {
				System.out.print("Introduce cadena para la lista B (" + (i - 4) + "): ");
				palabra = sc.nextLine();
				B.add(palabra);
			}
		}

		System.out.println("\nPrimera lista A: " + A);
		System.out.println("Segunda lista B: " + B);

		if (A.equals(B)) {
			System.out.println("\nSon iguales");
		} else {
			System.out.println("No son iguales");
		}

		sc.close();
	}
}

/*ArrayList<String> A = new ArrayList<>();
        ArrayList<String> B = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        final int n = 10;

        for (int i = 1; i <= n; i++) {
            System.out.print("Cadena " + i + ": ");
            String texto = sc.nextLine();

            if(i<= 5)
                A.add(texto);
            else
                B.add(texto);
        }

        //Mostramos los dos ArrayList
        System.out.println("\nLista 1 (primeras 5): " + A);
        System.out.println("Lista 2 (últimas 5): " + B);

        //Comparamos los dos ArrayList
        if (A.equals(B))
            System.out.println("\nSon iguales");
        else
            System.out.println("\nNo son niguales");
    }
}
*/