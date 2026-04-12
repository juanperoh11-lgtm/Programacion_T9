package Ejercicio18;

public class Lavadora extends Electrodomestico {

	// Por defecto la carga es de 5 kg. Usa una constante para ello
	private final static double Carga = 5;
	private double carga;

	// Constructor por defecto.
	public Lavadora() {
		super();
		this.carga = Carga;
	}

	// Constructor con el precio y peso. El resto por defecto.
	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		this.carga = Carga;
	}

	// Un constructor con la carga y el resto de atributos heredados.
	// Recuerda que debes llamar al constructor de la clase padre.
	public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, double carga) {
		super(precioBase, peso, consumoEnergetico, color);
		this.carga = carga;
	}

	/**
	 * @return the carga
	 */
	public double getcarga() {
		return carga;
	}

	/**
	 * @param carga the carga to set
	 */
	public void setCarga(double carga) {
		this.carga = carga;
	}

	/**
	 * @return the carga
	 */
	public static double getCarga() {
		return Carga;
	}

	// Metodo Precio Final
	public double precioFinal() {
		// Primero obtenemos el precio calculado por el padre (Electrodomestico)
		double precioTotal = super.precioFinal();

		// Añadimos la lógica de la Lavadora
		if (this.carga > 30) {
			precioTotal += 50;
		}

		return precioTotal;
	}
}