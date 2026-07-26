package parte3;

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

	// PARTE 3
	public void ingresarVisitante(int altura) throws AtraccionNoDisponibleException {
		GestorIO gestorIO = new GestorIO();
		if (!this.estado.esOperativa()) {
			throw new AtraccionNoDisponibleException(
					"ALERTA: La atraccion no esta operativa " + this.nombre + " no esta operativa");
		}
		if (altura > 200) {
			gestorIO.outln("ACCESO DENEGADO: Supera la altura maxima para disfrutar de la atraccion");
		} else if (altura < 120) {
			gestorIO.outln("ACCESO DENEGANDO: No cumple con la altura minima para disfrutar de la atraccion");
		} else {
			gestorIO.outln("Disfruta de la atraccion " + this.nombre);
		}
	}
}
