package Modelo;

public enum TipoBarco {
	PORTAAVIONES(4),
	SUBMARINOS(3),
	DESTRUCTORES(2),
	FRAGATAS(1);

	private int longitud;
	
	TipoBarco(int i){
		
	}
	
	public int getLongitud() {
		return longitud;
	}

}