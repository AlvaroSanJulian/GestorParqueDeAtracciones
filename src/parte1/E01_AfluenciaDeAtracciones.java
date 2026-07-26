package parte1;

public class E01_AfluenciaDeAtracciones {

	public static void main(String[] args) {

		int[][] visitantes = { {150, 220, 180, 410, 190}, 
				{90, 130, 95, 210, 85}, 
				{210, 340, 180, 520, 250} 
				};

		int sumaVisitantes = 0;

		for (int i = 0; i < visitantes.length; i++) {
			for (int j = 0; j < visitantes[i].length; j++) {
				sumaVisitantes += visitantes[i][j];
			}
		}
		System.out.println("La afluencia de las tres atracciones a lo largo de la semana es de: " + sumaVisitantes + " personas");
	}
}
