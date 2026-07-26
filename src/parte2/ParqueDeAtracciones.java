package parte2;

public class ParqueDeAtracciones {

	private Atraccion[] atracciones;

	public ParqueDeAtracciones() {
		this.atracciones = new Atraccion[4];

		this.atracciones[0] = new AtraccionInfantil("EL GUSANO ", 7.0, EstadoAtraccion.OPERATIVA);
		this.atracciones[1] = new AtraccionTerror("LA POSADA ", 15.0, EstadoAtraccion.EN_MANTENIMIENTO, 5);
		this.atracciones[2] = new AtraccionInfantil("TIOVIVO ", 12.0, EstadoAtraccion.CERRADA);
		this.atracciones[3] = new AtraccionTerror("CASA ABANDONADA", 20.0, EstadoAtraccion.EN_MANTENIMIENTO, 4);
	}

	public void mostrar() {
		for (int i = 0; i < this.atracciones.length; i++) {
			this.atracciones[i].mostrar();
		}
	}

	public void gestionar() {
		this.mostrar();

		Atraccion atraccion = this.atracciones[1];

		((AtraccionTerror) atraccion).generarAvisoSeguridad();
	}

	public static void main(String[] args) {
		new ParqueDeAtracciones().gestionar();
	}
}