package Ejercicio10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Double> num = new ArrayList<Double>();
        Scanner sc = new Scanner(System.in);
        double a;
        char opcion;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("a) Agregar número");
            System.out.println("b) Buscar número");
            System.out.println("c) Modificar número ( ");
            System.out.println("d) Eliminar número");
            System.out.println("e) Insertar en posición específica  )");
            System.out.println("f) Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = sc.next().toLowerCase().charAt(0);

            switch (opcion) {
                case 'a':
                    System.out.print("Introduce un número: ");
                    a = sc.nextDouble();
                    
                    num.add(a);
                    System.out.println("Lista actual: " + num);
                    break;

                case 'b':
                    System.out.print("Número a buscar: ");
                    a = sc.nextDouble();
                    int posicion = num.indexOf(a);
                    
                    if (posicion != -1)
                        System.out.println("Encontrado en la posición: " + posicion);
                    else
                        System.out.println("El número no está en la lista.");
                    break;

                case 'c':
                    if (num.isEmpty()) {
                        System.out.println("La lista está vacía.");
                    } else {
                        System.out.print("Nuevo número: ");
                        a = sc.nextDouble();
                        
                        System.out.print("Posición a modificar: ");
                        int posMod = sc.nextInt();
                        
                        if (posMod >= 0 && posMod < num.size()) {
                            num.set(posMod, a);
                        } else {
                            System.out.println("Posición inválida.");
                        }
                    }
                    break;

                case 'd':
                    System.out.print("Número a eliminar: ");
                    a = sc.nextDouble();
                    if (num.remove(Double.valueOf(a))) {
                        System.out.println("Numero eleminado");
                    } else {
                        System.out.println("No se encontró el número.");
                    }
                    break;

                case 'e':
                    System.out.print("Número a añadir: ");
                    a = sc.nextDouble();
                    System.out.print("Posición: ");
                    int posAdd = sc.nextInt();
                    if (posAdd >= 0 && posAdd <= num.size()) {
                        num.add(posAdd, a);
                    } else {
                        System.out.println("Posición inválida.");
                    }
                    break;

                case 'f':
                    System.out.println("Saliendo del programa...");
                    break;
                
            }
        } while (opcion != 'f');

        sc.close();
    }
}