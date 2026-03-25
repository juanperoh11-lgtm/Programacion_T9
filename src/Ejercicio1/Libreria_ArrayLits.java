package Ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Libreria_ArrayLits {
	
	public static ArrayList<Integer> generaArrayListInt(int n, int min, int max) {
        Random rd = new Random();
        ArrayList<Integer> lista = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            lista.add(rd.nextInt(min, max + 1));
        }
        return lista;
    }

    // Apartado b)
    public static int minimoArrayListInt(ArrayList<Integer> lista) {
        int min = Integer.MAX_VALUE;
        for (int num : lista) {
            if (num < min) min = num;
        }
        return min;
    }

    // Apartado c)  
    public static int maximoArrayListInt(ArrayList<Integer> lista) {
        int max = Integer.MIN_VALUE;  
        for (int num : lista) {
            if (num > max) max = num;
        }
        return max;
    }

    // Apartado d)
    public static double mediaArrayListInt(ArrayList<Integer> lista) {
        if (lista.isEmpty()) return 0;
        double suma = 0;
        for (int a : lista) {
            suma += a; 
        }
        return suma / lista.size();
    }

    // Apartado e)
    public static boolean estaEnArrayListInt(ArrayList<Integer> lista, int n) {
        return lista.contains(n);
    }
    
    // Apartado f)
    public static int posicionEnArrayList(ArrayList<Integer> lista, int n) {
        return lista.indexOf(n);
    }

    // Apartado g)  
    public static ArrayList<Integer> volteaArrayListInt(ArrayList<Integer> lista) {
        ArrayList<Integer> volteado = new ArrayList<>(lista);
        Collections.reverse(volteado); 
        return volteado;
    }
}