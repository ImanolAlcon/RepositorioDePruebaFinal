package Modelo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

//import Vista.VentanaTab;
//import modelo.Casilla;
//import modelo.TipoBarco;

public class Barco {

	private TipoBarco tipoBarco;
	private int longitud;
	private Orientacion orientacion;
	private Casilla[] barco;
	private  PropertyChangeSupport support ;
	
	public Barco(TipoBarco pTipoBarco) {

		this.tipoBarco = pTipoBarco;
	    barco = new Casilla[tipoBarco.getLongitud()];
		support = new PropertyChangeSupport(this);
		//this.addPropertyChangeListener( VentanaTab.obtVentanaTab());
					
	}
	

	private boolean hayEscudo() {
		// TODO - implement Barco.hayEscudo
		throw new UnsupportedOperationException();
	}

	public TipoBarco getiTpoBarco() {
		// TODO - implement Barco.getiTpoBarco
		throw new UnsupportedOperationException();
	}

	public Orientacion getOrientacion() {
		// TODO - implement Barco.getOrientacion
		throw new UnsupportedOperationException();
	}

	public void activarEscudo() {
		// TODO - implement Barco.activarEscudo
		throw new UnsupportedOperationException();
	}

	public boolean esHundido() {
		// TODO - implement Barco.esHundido
		throw new UnsupportedOperationException();
	}

	public int getLongitud() {
		// TODO - implement Barco.getLongitud
		throw new UnsupportedOperationException();
	}
	
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		this.support.addPropertyChangeListener(listener);
	}

	public void removePropertyChangeListener(PropertyChangeListener listener) {
		this.support.removePropertyChangeListener(listener);
	}


}