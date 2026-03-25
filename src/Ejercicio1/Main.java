package Ejercicio1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
ArrayList<Integer> miLista = Libreria_ArrayLits.generaArrayListInt(10, 1, 50);
        
        System.out.println("Lista generada: " + miLista);
        
        // Probamos mínimo, máximo y media
        System.out.println("Mínimo: " + Libreria_ArrayLits.minimoArrayListInt(miLista));
        System.out.println("Máximo: " + Libreria_ArrayLits.maximoArrayListInt(miLista));
        System.out.printf("Media: %.2f\n", Libreria_ArrayLits.mediaArrayListInt(miLista));
        
        // Probamos búsqueda
        int buscar = miLista.get(0); // Buscamos el primero para asegurar que está
        System.out.println("¿Está el número " + buscar + "? " + Libreria_ArrayLits.estaEnArrayListInt(miLista, buscar));
        System.out.println("Posición del número " + buscar + ": " + Libreria_ArrayLits.posicionEnArrayList(miLista, buscar));
        
        // Probamos el volteo
        ArrayList<Integer> invertida = Libreria_ArrayLits.volteaArrayListInt(miLista);
        System.out.println("Lista volteada: " + invertida);
    }
}