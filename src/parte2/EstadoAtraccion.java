package parte2;

public enum EstadoAtraccion {

	OPERATIVA, 
	EN_MANTENIMIENTO, 
	CERRADA;

	public boolean esOperativa() {
		return this == OPERATIVA;
	}
}
