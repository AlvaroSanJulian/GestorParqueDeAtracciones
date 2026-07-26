package parte2;

public abstract class Atraccion {

	protected String nombre;
	protected double precioBase;
	protected EstadoAtraccion estado;

	public Atraccion(String nombre, double precioBase, EstadoAtraccion estado) {
		this.nombre = nombre.toUpperCase();
		this.precioBase = precioBase;
		this.estado = estado;
	}

	public boolean estaDisponible() {
		return this.estado.esOperativa();
	}

	public abstract double calcularPrecioEntrada();

	// Getters
	public String getNombre() {
		return this.nombre;
	}

	public double getPrecioBase() {
		return this.precioBase;
	}

	public EstadoAtraccion getEstado() {
		return this.estado;
	}

	// Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public void setEstado(EstadoAtraccion estado) {
		this.estado = estado;
	}

	public String toString() {
		return "[NOMBRE]--> " + this.nombre + "Precio: " + this.calcularPrecioEntrada() + "Estado: " + this.estado;
	}

	public void mostrar() {
		GestorIO gestorIO = new GestorIO();
		gestorIO.outln(this.toString());
	}
}
