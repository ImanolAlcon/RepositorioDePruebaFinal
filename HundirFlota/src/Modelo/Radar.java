package Modelo;

public class Radar {

	private int CantidadRadar;
	//private Casilla ultimaCasillaDetectada;
	private Casilla posicion;
	
	public Radar(int CantidadRadar, int pX, int pY) {
		CantidadRadar = this.CantidadRadar;
		pX = posicion.getX();
		pY = posicion.getY();
	}

	/**
	 * 
	 * @param pCantidadRadar
	 */
	public void decrementarCantidadRadar(int pCantidadRadar) {
		// TODO - implement Radar.decrementarCantidadRadar
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param pX
	 * @param pY
	 */
//	public Casilla consultarRadar() {
//		int Xmin = Math.max(0, posicion.getX() - 2);
//		int Ymin = posicion.getY() - 2;
//		
//		int Xmax = posicion.getX() + 2;
//		int Ymax = posicion.getY() + 2;
//		
//		
//		for(int i = Xmin; i <= Xmax; i++) {
//			for(int j = Ymin; j<= Ymax; j++) {
//				//Casilla posRadar = new Casilla(i,j,true);
//				
//				}
//			}
//
//			return null;
//		}
		

	
	
	public int getCantidadRadar() {
		return CantidadRadar;
	}

	public void setCantidadRadar(int cantidadRadar) {
		CantidadRadar = cantidadRadar;
	}

	public Casilla getPosicion() {
		return posicion;
	}

	public void setPosicion(Casilla posicion) {
		this.posicion = posicion;
	}

	public void desaparece() {
		// TODO - implement Radar.desaparece
		throw new UnsupportedOperationException();
	}



	/**
	 * 
	 * @param pUltimaCasillaDetectada
	 */
	public void moverRadarPosicionAdyacenteAuPosicionDetectada(Casilla pUltimaCasillaDetectada) {
		// TODO - implement Radar.moverRadarPosicionAdyacenteAuPosicionDetectada
		throw new UnsupportedOperationException();
	}

}