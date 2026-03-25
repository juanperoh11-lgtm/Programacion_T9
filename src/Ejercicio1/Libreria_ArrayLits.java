package Ejercicio1;

import java.util.ArrayList;
import java.util.Collections;

public class Libreria_ArrayLits {
	
	//Apartado a)
	public static ArrayList<Integer> generaArrayListInt(int n, int min, int max) {
		ArrayList<Integer> lista = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int aleatorio = (int) (Math.random() * (max - min + 1)) + min;
			lista.add(aleatorio);
		}
		return lista;
	}

	//Apartado b)
	public static int minimoArrayListInt(ArrayList<Integer> lista) {
		if (lista.isEmpty())
			return Integer.MAX_VALUE;
		int min = lista.get(0);
		for (int num : lista) {
			if (num < min)
				min = num;
		}
		return min;
	}

	//Apartado c)
	public static int maximoArrayListInt(ArrayList<Integer> lista) {
		if (lista.isEmpty())
			return Integer.MAX_VALUE;
		int max = lista.get(0);
		for (int num : lista) {
			if (num > max)
				max = num;
		}
		return max;
	}

	//Apartado d)
	public static double mediaArrayListInt(ArrayList<Integer> lista) {
		if (lista.isEmpty())
			return 0;
		int suma = 0;

		for (int num : lista) {
			suma += num;
		}
		return (double) suma / lista.size();
	}

	//Apartado e)
	public static boolean estaEnArrayListInt(ArrayList<Integer> lista, int n) {
		return lista.contains(n);
	}
	
	//Apartado f)
	public static int posicionEnArrayList(ArrayList<Integer> lista, int n) {
		return lista.indexOf(n);
	}

	//Apartado g)
	public static ArrayList<Integer> volteaArrayListInt(ArrayList<Integer> lista) {
		ArrayList<Integer> listaVolteada = new ArrayList<>(lista);
		Collections.reverse(listaVolteada);
		return listaVolteada;
	}
}