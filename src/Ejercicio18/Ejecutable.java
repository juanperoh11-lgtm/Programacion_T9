package Ejercicio18;

public class Ejecutable {

	public static void main(String[] args) {

		// Crea un array de Electrodomesticos de 10 posiciones
		Electrodomestico lista[] = new Electrodomestico[10];

		// Asigna a cada posición un objeto de las clases anteriores con los valores que
		// desees.
		lista[0] = new Lavadora(200, 50, 'A', "blanco", 40);
		lista[1] = new Television(500, 30, 'C', "negro", 50, true);
		lista[2] = new Electrodomestico(150, 20, 'C', "azul");
		// Usa carga por defecto (5kg)
		lista[3] = new Lavadora(100, 10); 
		// Usa resolución por defecto (20")
		lista[4] = new Television(250, 15); 
		lista[5] = new Lavadora(300, 60, 'D', "gris", 15);
		lista[6] = new Television(600, 40, 'A', "blanco", 32, false);
		 // Todo por defecto
		lista[7] = new Electrodomestico();
		lista[8] = new Lavadora(200, 80, 'E', "rojo", 40);
		lista[9] = new Television(150, 25, 'F', "negro", 42, true);

		// Variables para las sumas
		double sumaElectrodomesticos = 0;
		double sumaLavadoras = 0;
		double sumaTelevisores = 0;

		// Ahora, recorre este array y ejecuta el método precioFinal().
		for (int i = 0; i < lista.length; i++) {
			// Ejecutamos el método precioFinal() de cada objeto
			double precioIndividual = lista[i].precioFinal();
			// Sumar el total de electrodomésticos 
			sumaElectrodomesticos += precioIndividual;
			// Usamos instanceof para clasificar y sumar por separado
			if (lista[i] instanceof Lavadora) {
				sumaLavadoras += precioIndividual;
			} else if (lista[i] instanceof Television) {
				sumaTelevisores += precioIndividual;
			}
		}

		//Mostramos los resultados 
		System.out.println("RESUMEN DE PRECIOS TOTALES");
		System.out.println("Total Lavadoras: " + sumaLavadoras + " €");
		System.out.println("Total Televisiones: " + sumaTelevisores + " €");
		System.out.println("Total de todos los Electrodomésticos: " + sumaElectrodomesticos + " €");
	}
}