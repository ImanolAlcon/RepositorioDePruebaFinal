package Modelo;

import java.beans.PropertyChangeSupport;
import java.util.Collection;
import java.util.List;

//import modelo.Barco;
//import modelo.Casilla;
//import modelo.Orientacion;
//import modelo.TipoBarco;

public class Flota {

	private List<Barco> flota;
	private Casilla listaCasillas[][];
	private PropertyChangeSupport support;
	
	
	
	public Flota(Casilla[][] listaCasillas, List<Barco> flota, PropertyChangeSupport support) {
		listaCasillas = this.listaCasillas;
		flota = this.flota;
		support = this.support;
		
	}

	/**
	 * 
	 * @param pX
	 * @param pY
	 */
	public boolean HayBarcosAlrededor(int pX, int pY) {
		// TODO - implement Flota.HayBarcosAlrededor
		throw new UnsupportedOperationException();
	}
	
	
	
	public Collection<Barco> getFlota() {
		return flota;
	}



	public void setFlota(List<Barco> flota) {
		this.flota = flota;
	}



	public Casilla[][] getListaCasillas() {
		return listaCasillas;
	}



	public void setListaCasillas(Casilla[][] listaCasillas) {
		this.listaCasillas = listaCasillas;
	}



	public boolean puedeColocarBarco(TipoBarco tipobarco,int pX, int pY,Orientacion porientacion) {
		int Xmax = 0 ; 
		int Ymax = 0;
		int Xmin = pX-1;
		int Ymin =pY-1;
		if(porientacion==Orientacion.HORIZONTAL) {
			Xmax=pX+ 1;
			Ymax=pY+tipobarco.getLongitud()+1;
		 for(int i=Math.max(0, Xmin);i<=Math.min(9, Xmax);i++) {
			for(int j=Math.max(0,Ymin); j<=Math.min(9, Ymax);j++) {
				if(listaCasillas[i][j] != null ) {
				return false;
				}
				else {
					return true ;
				}}}}
			
		else if (porientacion == Orientacion.VERTICAL) {
					Ymax=pY+ 1;
					Xmax=pX+tipobarco.getLongitud()+1;
					for(int i1=Math.max(0, Xmin);i1<=Math.min(9, Xmax);i1++) {
						for(int j1=Math.max(0,Ymin); j1<=Math.min(9, Ymax); j1++) {
							if(listaCasillas[i1][j1] != null ) {
								return false;
							}
							else {
								return true ;
							}}
					}}
		return false ;
		}
	public void colocarBarco(TipoBarco pTipoBarco, int pX, int pY, Orientacion pOrientacion) {
		Barco barco = new  Barco( pTipoBarco);
		if (pOrientacion==Orientacion.HORIZONTAL && puedeColocarBarco( pTipoBarco,pX, pY, pOrientacion)==true){
			for (int i = 0; i < pTipoBarco.getLongitud(); i++) {
				getCasilla(pX, pY + i).colocarBarco(barco);
			}
		} else if  (pOrientacion==Orientacion.VERTICAL && puedeColocarBarco( pTipoBarco,pX, pY, pOrientacion)==true){
			for (int i = 0; i < pTipoBarco.getLongitud(); i++) {
				getCasilla(pX+i, pY ).colocarBarco(barco);
			}
		}
	}
	
	public Casilla getCasilla(int pX,int pY) {
		for (int i =0 ;i<=9 ;i++) {
			for (int j =0 ;i<=9 ;i++) {
				listaCasillas[i][j]=listaCasillas[pX][pY];
			}}
		return listaCasillas[pX][pY];
	
}

}