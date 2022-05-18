package Modelo;

import java.util.Collection;

public class Almacen {


	private Collection<Armamento> ListaArmamentos;
	private int cantidadMisilInicial;
	private int cantidadBombaInicial;

	private Almacen() {
		// TODO - implement Almacen.Almacen
		throw new UnsupportedOperationException();
	}

	public static Almacen getAlmacen() {
		// TODO - implement Almacen.getAlmacen
		throw new UnsupportedOperationException();
	}
	public void decrementarArmamento(int numComprasMisil, int numComprasBomba) {
		// TODO - implement Armamento.decrementarArmamento
		
		cantidadMisilInicial = cantidadMisilInicial - numComprasMisil;
		cantidadBombaInicial = cantidadBombaInicial - numComprasBomba;
		
	}

}