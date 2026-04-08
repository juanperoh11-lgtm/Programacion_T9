package Ejercicio12;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> diccionario = new HashMap<String, String>();
		
		diccionario.put("casa", "house");
		diccionario.put("perro", "dog");
		diccionario.put("gato", "cat");
		diccionario.put("rojo", "red");
        diccionario.put("azul", "blue");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("agua", "water");
        diccionario.put("árbol", "tree");
        diccionario.put("libro", "book");
        diccionario.put("mesa", "table");
        diccionario.put("silla", "chair");
        diccionario.put("manzana", "apple");
        diccionario.put("leche", "milk");
        diccionario.put("pan", "bread");
        diccionario.put("ventana", "window");
        diccionario.put("puerta", "door");
        diccionario.put("escuela", "school");
        diccionario.put("coche", "car");
        diccionario.put("ordenador", "computer");
        
        System.out.println("---Diccionario---");
        System.out.print("Introduce una palabra en español: ");
        String palabraEsp = sc.nextLine().toLowerCase();
        
        String traduccion = diccionario.get(palabraEsp);
        if(traduccion != null)
        	System.out.println("La traducción de la palabra " + palabraEsp + "es: " + traduccion);
        else
        	System.out.println("La palabra no esta en este duccionario");
	}

}
