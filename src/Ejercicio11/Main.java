package Ejercicio11;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> usuarios = new HashMap<>();
	
		usuarios.put("admin", "1234");
        usuarios.put("alumno", "pass77");
        usuarios.put("profesor", "java2024");
        
        int intentos =3;
        boolean acceso = false;
        
        System.out.println("Control de acceso");
        while(intentos <3) {
        	System.out.println("Introduce un usuario");
        	String login = sc.nextLine();
        	System.out.println("Introduce una contraseña");
        	String password = sc.nextLine();
        	
        	// containsKey(clave) devuelve true si la clave existe 
            // get(clave) obtiene el valor asociado
        	if(usuarios.containsKey(login) && usuarios.get(login).equals(password)) {
        		acceso = true;
        	}else {
        		intentos --;
        		if (intentos > 0) {
                    System.out.println("Datos incorrectos. Intentos restantes: " + intentos);
        		}
        	}
        }
	}
}
