package parte3;

public class AtraccionInfantil extends Atraccion implements Accesible {

	public static final int LIMITE_DE_SEGURIDAD = 120;

	public AtraccionInfantil(String nombre, double precioBase, EstadoAtraccion estado) {
		super(nombre, precioBase, estado);
	}

	@Override
	public boolean puedeAcceder(int altura) {
		return altura < LIMITE_DE_SEGURIDAD;
	}

	@Override
	public double calcularPrecioEntrada() {
		return this.precioBase - 2.0;
	}
}
