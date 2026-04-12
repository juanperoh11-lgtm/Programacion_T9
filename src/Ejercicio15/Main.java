package Ejercicio15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		HashMap<String, Integer> Lista = new HashMap<String, Integer>();
		int op = 0;
		Scanner sc = new Scanner(System.in);

		Lista.put("naranjas", 6);

		do {
			menu();
			op = sc.nextInt();
			sc.nextLine();
			switch (op) {

			case 1:
				System.out.println("Introduce un producto");
				String pr = sc.nextLine();
				System.out.println("Introduce el número de unidades");
				int uni = sc.nextInt();
				if (Lista.containsKey(pr))
					Lista.put(pr, uni);
				else
					Lista.put(pr, Lista.get(pr) + uni);
				System.out.println("Operación realizada con exito");
				break;

			case 2:
				System.out.println("Intoduce le nombre del producto a eliminar");
				if (Lista.remove(sc.nextLine()) != null)
					System.out.println("se ha borrado correctamente");
				else
					System.out.println("No se ha borrado correctamente");

			case 3:
				System.out.println("Introduce el producto a reducir el stock");
				String pro = sc.nextLine().toLowerCase();
				if (Lista.containsKey(pro)) {
					System.out.println("Introduce la cantidad a reducir");
					int cant = sc.nextInt();
					if (cant <= Lista.get(pro))
						Lista.put(pro, Lista.get(pro) - cant);
					else
						Lista.putIfAbsent(pro, 0);
					System.out.println(
							"Se ha reducido del Strock " + Lista.get(pro) + "Unidades restantes" + Lista.get(cant));
				}
				break;

			case 4:
				System.out.println("Introduce un producto a buscar");
				String prob = sc.nextLine();
				pro = sc.nextLine().toLowerCase();
				if (Lista.containsKey(prob))
					System.out.println("Quedan " + Lista.get(prob) + "Unidades de " + pro);
				else
					System.out.println("No tenemos ese producto");
				break;

			case 5:
				for (String n : Lista.keySet())
					System.out.println(n);
				break;

			case 6:
				for (Map.Entry<String, Integer> entrada : Lista.entrySet()) {
					System.out.println("Producto: " + entrada.getKey() + " | Unidades: " + entrada.getValue());
				}
				break;
			case 7:
				break;
			}

		} while (op != 7);

	}

	private static void menu() {
		System.out.println(
				"1.Añadir producto\n2.Eliminar Producto\n3.Reducir Strock\n4.Buscar Unidades \n5.Listar Productos"
						+ "\n ");

	}
}