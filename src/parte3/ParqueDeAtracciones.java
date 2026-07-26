package parte3;

import java.util.*;

public class ParqueDeAtracciones {

	private ArrayList<Atraccion> atracciones;

	public ParqueDeAtracciones() {
		this.atracciones = new ArrayList<>();

		this.atracciones.add(new AtraccionInfantil("EL GUSANO ", 7.0, EstadoAtraccion.OPERATIVA));
		this.atracciones.add(new AtraccionTerror("LA POSADA ", 15.0, EstadoAtraccion.EN_MANTENIMIENTO, 5));
		this.atracciones.add(new AtraccionInfantil("TIOVIVO ", 12.0, EstadoAtraccion.CERRADA));
		this.atracciones.add(new AtraccionTerror("CASA ABANDONADA", 20.0, EstadoAtraccion.EN_MANTENIMIENTO, 4));
	}

	public void mostrar() {
		for (int i = 0; i < this.atracciones.size(); i++) {
			this.atracciones.get(i).mostrar();
		}
	}

	public void gestionar() {
		this.mostrar();

		Atraccion atraccion = this.atracciones.get(1);

		((AtraccionTerror) atraccion).generarAvisoSeguridad();

		// PARTE 3
		try {
			atraccion.ingresarVisitante(170);
		} catch (AtraccionNoDisponibleException e) {
			System.out.println(e.getMessage());
		}
	}

	public void ordenar(ArrayList<Atraccion> atracciones) {
		Collections.sort(atracciones, new Comparator<Atraccion>() {
			public int compare(Atraccion a1, Atraccion a2) {
				return Double.compare(a1.calcularPrecioEntrada(), a2.calcularPrecioEntrada());
			}
		});
	}

	public static void main(String[] args) {
		new ParqueDeAtracciones().gestionar();
	}
}