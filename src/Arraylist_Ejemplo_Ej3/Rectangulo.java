package Arraylist_Ejemplo_Ej3;

public class Rectangulo {
	private Punto a,b;
	
	public Rectangulo (Punto a, Punto b) {
		this.a =a;
		this.b =b;
	}
	
	public int calcularArea() {
        // Base = diferencia entre las X | Altura = diferencia entre las Y
        int base = Math.abs(b.getX() - a.getX());
        int altura = Math.abs(b.getY() - a.getY());
        return base * altura;
    }

    public int calcularPerimetro() {
        int base = Math.abs(b.getX() - a.getX());
        int altura = Math.abs(b.getY() - a.getY());
        return 2 * (base + altura);
    }
     
	
	/**
	 * @return the a
	 */
	public Punto getA() {
		return a;
	}

	/**
	 * @param a the a to set
	 */
	public void setA(Punto a) {
		this.a = a;
	}

	/**
	 * @return the b
	 */
	public Punto getB() {
		return b;
	}

	/**
	 * @param b the b to set
	 */
	public void setB(Punto b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Rectángulo formado por los puntos: " + a + " y " + b;
	}
}
