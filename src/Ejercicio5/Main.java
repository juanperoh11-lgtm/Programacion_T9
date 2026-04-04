package Ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> Secuencia = new ArrayList<>();
		
		System.out.println("Introduce un valor, -1 para salir");
		int numero = sc.nextInt();
		
		
		while(numero != -1) {
			Secuencia.add(numero);
			
			System.out.println("Introduce otro número");
			numero = sc.nextInt();
		}
		System.out.println("\nLista final: " + Secuencia);
        sc.close();
	}

}
