package parte1;

public class E02_LimiteAforoSuperado {

	public static void main(String[] args) {
		int[][] visitantes = { 
				{150, 220, 180, 410, 190}, 
				{90, 130, 95, 210, 85}, 
				{210, 340, 180, 520, 250} 
				};
		
		int columna;
		boolean superado;

		for (int i = 0; i < visitantes.length; i++) {
			columna = 0;
			superado = false;
			while (columna < visitantes[i].length && !superado) {
				if (visitantes[i][columna] > 300) {
					superado = true;
					System.out.println("ALERTA: La atraccion " + (i + 1) + " supero el limite el dia " + (columna + 1) + " con " + visitantes[i][columna]);
				}
				columna++;
			}
		}
	}
}
