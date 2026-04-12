package Ejercicio18;

public class Television  extends Electrodomestico{
	private static  double resolucion;
	private boolean sintonizadorTDT;
	
	
	/*Sus atributos son resolución (en pulgadas) y sintonizador TDT (booleano), 
	 *ademas de los atributos heredados.
 	  Por defecto, la resolución sera de 20 pulgadas y el sintonizador sera false.*/
	
	//Un constructor por defecto.
	public Television() {
		super();
		this.resolucion = 20;
		this.sintonizadorTDT = false;
	}
	
	//Un constructor con el precio y peso. El resto por defecto
	public Television(double precioBase, double peso) {
		super(precioBase, peso);
		this.resolucion =20;
		this.sintonizadorTDT = false;
	}
	
	//Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados
	//Recuerda que debes llamar al constructor de la clase padre
	public Television(double precioBase, double peso, char consumoEnergetico, String color, double resolucion, boolean sintonizadorTDT) {
		super(precioBase, peso, consumoEnergetico, color);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	/**
	 * @return the resolucion
	 */
	public double getResolucion() {
		return resolucion;
	}

	/**
	 * @param resolucion the resolucion to set
	 */
	public void setResolucion(double resolucion) {
		this.resolucion = resolucion;
	}

	/**
	 * @return the sintonizadorTDT
	 */
	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	/**
	 * @param sintonizadorTDT the sintonizadorTDT to set
	 */
	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}
	
	@Override
	public double precioFinal() {
		// 1. Obtenemos el precio base + pluses de Electrodomestico
		double precioTotal = super.precioFinal();

		// 2. Si resolución > 40 pulgadas, aumenta un 30% del precio base
		if (this.resolucion > 40) {
			precioTotal += this.precioBase * 0.30;
		}

		// 3. Si tiene sintonizador TDT, suma 50 €
		if (this.sintonizadorTDT) {
			precioTotal += 50;
		}

		return precioTotal;
	}
}