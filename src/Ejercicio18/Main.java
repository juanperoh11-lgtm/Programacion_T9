package Ejercicio18;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	// El HashMap centraliza todo el inventario
	private static HashMap<String, Electrodomestico> almacen = new HashMap<>();
	private static Scanner sc = new Scanner(System.in);

	// Contadores para asegurar que las claves sean correlativas y no se reutilicen
	static int cLv = 1, cTV = 1, cEl = 1;

	public static void main(String[] args) {

		almacen.put("Lv" + cLv++, new Lavadora(200, 50, 'A', "blanco", 40));
		almacen.put("TV" + cTV++, new Television(500, 30, 'C', "negro", 50, true));
		almacen.put("El" + cEl++, new Electrodomestico(150, 20, 'C', "azul"));

		int opcion;

		do {
			System.out.println("\n1.Añadir 2.Listar Todo 3.Lavadoras 4.TVs 5.Otros 6.Borrar 7.Precio 0.Salir");
			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 1:
				añadir();
				break;
			case 2:
				listarTodo();
				break;
			case 3:
				listarLavadoras();
				break;
			case 4:
				listarTVs();
				break;
			case 5:
				listarOtros();
				break;
			case 6:
				eliminar();
				break;
			case 7:
				mostrarPrecio();
				break;
			}
		} while (opcion != 0);
	} 

	public static void añadir() {
		System.out.println("Tipo (1.Lv 2.TV 3.El): ");
		int tipo = sc.nextInt();
		System.out.println("Precio base: ");
		double precio = sc.nextDouble();
		System.out.print("Peso: ");
		double peso = sc.nextDouble();

		if (tipo == 1) {
			System.out.print("Carga: ");
			almacen.put("Lv" + cLv++, new Lavadora(precio, peso, 'F', "blanco", sc.nextDouble()));
		} else if (tipo == 2) {
			System.out.print("Pulgadas: ");
			double res = sc.nextDouble();
			System.out.print("TDT (true/false): ");
			almacen.put("TV" + cTV++, new Television(precio, peso, 'F', "blanco", res, sc.nextBoolean()));
		} else {
			almacen.put("El" + cEl++, new Electrodomestico(precio, peso));
		}
	}

	public static void listarTodo() {
		for (String k : almacen.keySet()) {
			System.out.println(k + " - " + almacen.get(k).getClass());
		}
	}

	public static void listarLavadoras() {
		for (Electrodomestico e : almacen.values()) {
			if (e instanceof Lavadora)
				System.out.println(e.getPrecioBase() + "€ - Carga: " + ((Lavadora) e).getcarga());
		}
	}

	public static void listarTVs() {
		for (Electrodomestico e : almacen.values()) {
			if (e instanceof Television)
				System.out.println(e.getPrecioBase() + "€ - " + ((Television) e).getResolucion() + "\"");
		}
	}

	public static void listarOtros() {
		for (Electrodomestico e : almacen.values()) {
			if (!(e instanceof Lavadora) && !(e instanceof Television)) {
				System.out.println("Electrodoméstico base: " + e.getPrecioBase() + "€");
			}
		}
	}

	public static void eliminar() {
		System.out.print("Clave a borrar: ");
		if (almacen.remove(sc.nextLine()) != null)
			System.out.println("Borrado.");
		else
			System.out.println("No existe.");
	}

	public static void mostrarPrecio() {
		System.out.print("Clave: ");
		String k = sc.nextLine();
		if (almacen.containsKey(k))
			System.out.println("Precio final: " + almacen.get(k).precioFinal());
		else
			System.out.println("No encontrado.");
	}
}