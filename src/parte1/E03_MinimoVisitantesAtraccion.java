package parte1;

public class E03_MinimoVisitantesAtraccion {

	public static void main(String[] args) {
		int[][] visitantes = { 
				{150, 220, 180, 410, 190}, 
				{90, 130, 95, 210, 85}, 
				{210, 340, 180, 520, 250} 
				};
		
		String atraccion = "Casa del terror";
		int fila;

		switch (atraccion) {
		case "Montaña rusa":
			fila = 0;
			break;
		case "Casa del terror":
			fila = 1;
			break;
		case "Simulador 4D":
			fila = 2;
			break;
		default:
			fila = -1;
			System.out.println("ERROR: La atraccion no existe");
		}

		if (fila != -1) {
			int numeroMinimoVisitantes = visitantes[fila][0];
			int diaMinimo = 0;
			for (int i = 1; i < visitantes[fila].length; i++) {
				if (visitantes[fila][i] < numeroMinimoVisitantes) {
					numeroMinimoVisitantes = visitantes[fila][i];
					diaMinimo = i;
				}
			}
			System.out.println("El numero minimo de visitantes en la atraccion " + (fila + 1) + " ha sido de " + numeroMinimoVisitantes + " el dia " + (diaMinimo + 1));
		}
	}
}
