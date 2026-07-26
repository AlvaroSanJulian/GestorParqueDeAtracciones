package parte2;

public class AtraccionTerror extends Atraccion implements Accesible {

	private final int ALTURA_MINIMA;
	private int nivelSusto;

	public AtraccionTerror(String nombre, double precioBase, EstadoAtraccion estado, int nivelSusto) {
		super(nombre, precioBase, estado);
		this.nivelSusto = nivelSusto;
		this.ALTURA_MINIMA = 140;
	}

	public void generarAvisoSeguridad() {
		GestorIO gestorIO = new GestorIO();
		if (nivelSusto >= 4) {
			gestorIO.outln("ADVERTENCIA: No apto para personas sensibles");
		} else {
			gestorIO.outln("Apto para todos los publicos");
		}
	}

	@Override
	public boolean puedeAcceder(int altura) {
		return altura >= ALTURA_MINIMA;
	}

	@Override
	public double calcularPrecioEntrada() {
		return this.precioBase + 3.5;
	}

	public void mostrar() {
		super.mostrar();
		new GestorIO().outln("/t Nivel de susto " + this.nivelSusto);
	}
}
