package Ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> secuencia = new ArrayList<>();
		
		//Valor inicial
		System.out.println("Introduce un valor");
		int v = sc.nextInt();
		
		//Valor a sumar
		System.out.println("Introduce un incremento");
		int i = sc.nextInt();
		
		//El numero de valores que vas a meter dentro del ArrayList
		System.out.println("Introduce un numero de valores a crear");
		int n = sc.nextInt();
		
		//Almacenamiento de los valores
		int valorActual =v;
		for(int j=0; j<n; j++) {
			secuencia.add(valorActual);
			//Tras almacenar el valor inical, hacemos que se sume al valor 'i' 'n'veces
			valorActual += i; 
		}
		System.out.println("\nLa secuencia aritmética generada es:" + secuencia);
		sc.close();
	}

}
