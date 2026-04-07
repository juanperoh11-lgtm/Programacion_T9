package Ejercicio10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<Double> num = new ArrayList<Double>();
		Scanner sc = new Scanner(System.in);
		double a;

		System.out.println("---Menu---");
		System.out.println("a)");
		System.out.println("b)");
		System.out.println("c)");
		System.out.println("d)");
		System.out.println("e)");
		System.out.println("f)");
		char opcion = sc.next().toLowerCase().charAt(0);
		do {

			System.out.println("---Menu---");
			System.out.println("a)");
			System.out.println("b)");
			System.out.println("c)");
			System.out.println("d)");
			System.out.println("e)");
			System.out.println("f)");
			switch (opcion) {
			case 'a':
				System.out.println("Introduce un número para agregrar al array");
				a = sc.nextDouble();
				num.add(a);
				System.out.println(num);
				break;

			case 'b':
				System.out.println("Introduce un número a buscar");
				a = sc.nextDouble();
				int posicion = num.indexOf(a);

				if (posicion != -1)
					System.out.println("El número " + a + " se encuentra en la posición: " + posicion);
				else
					System.out.println("El número no se encuentra dentro del array");
				break;

			case 'c':
				System.out.println("Introducce un nuevo número y la posicón en la que lo quieres colocar");
				a = sc.nextDouble();
				posicion = sc.nextInt();
				num.set(posicion, a);
				break;

			case 'd':
				System.out.println("Introduce el elemento a eliminar del ArrayList");
				a = sc.nextDouble();
				num.remove(a);
				break;

			case 'e':
				System.out.println("Introduce el elemtno que quieres añadir y la posicón en la que lo quieras colocar");
				a = sc.nextDouble();
				posicion = sc.nextInt();
				num.add(posicion, a);
				break;

			case 'f':
				System.out.println("Saliendo del programa");
				break;
			}
		} while (opcion != 'f');
		sc.close();
	}
}
