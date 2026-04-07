package Ejercicio8;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		// 1. Crea 5 instancias de la Clase Producto.
		Producto p1 = new Producto("Café", 10);
		Producto p2 = new Producto("Pan",5);
		Producto p3 = new Producto("Jamón",20);
		Producto p4 = new Producto("Tomate",9);
		Producto p5 = new Producto("Pollo",7);

		// 2. Crear un ArrayList
		ArrayList<Producto> lista = new ArrayList<Producto>();
		
		// 3. Añadir los Productos al ArrayList
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);
		lista.add(p5);
		
		// 4. Visualizar el contenido del ArrayList
		System.out.println("\nArrayList Actual");
        Iterator<Producto> it = lista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        // 5. Elimina los Elementos del ArrayList
        lista.remove(0);
        lista.remove(1);
        
        // 6. Inserta un nuevo objeto producto en la posición 2 de la lista.
        lista.add(2, new Producto("Chocolate", 20));

        // 7. Visualiza de nuevo el contenido de ArrayList utilizando for-each.
        System.out.println("\nNuevo ArrayList");
        for(Producto p : lista) 
            System.out.println(p);

        // 8. Elimina todos los valores del ArrayList y muestra el tamaño.
        lista.clear();
        System.out.println("\nUltimo Cambio del ArrayList" + lista);
	}

}
