package Ejercicio13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashMap<String, String> diccionario = new HashMap<>();
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

		// Extraemos las claves (palabras en español) a una lista para poder mezclarlas
		// para ello usamos keySet()
		ArrayList<String> palabrasEspañol = new ArrayList<>(diccionario.keySet());
		// Mezclamos
		Collections.shuffle(palabrasEspañol);

		int aciertos = 0;
		int fallos = 0;

		System.out.println("Traduce las siguientes palabras");
        for(int i = 0; i < 5; i++) {
            // Obtenemos la palabra en español de la lista desordenada
        	String palabraPreguntada = palabrasEspañol.get(i);
            
            System.out.print((i + 1) + ". " + palabraPreguntada + ": ");
            
            // Leemos la respuesta del usuario y la pasamos a minúsculas para comparar
            String respuestaUsuario = sc.nextLine().toLowerCase();
            
            // Buscamos el valor asociado a la clave en el diccionario usando .get()
            String respuestaCorrecta = diccionario.get(palabraPreguntada);
            
            // Usamos .equals() para comparar el contenido de las cadenas de texto
            if(respuestaUsuario.equals(respuestaCorrecta)) {
            	System.out.println("Correcto");
            	aciertos++;
            } else {
            	System.out.println("Incorrecto. La respuesta era: " + respuestaCorrecta);
            	fallos++;
            }
        }
        
        System.out.println("\nRESULTADOS FINAL");
        System.out.println("Aciertos: " + aciertos);
        System.out.println("Fallos: " + fallos);
        
        sc.close();
	}
}