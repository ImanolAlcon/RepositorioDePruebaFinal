package Modelo;

import java.util.Collection;
import java.util.List;

public class Usuario {

	private Flota flota;
	private TableroTiro tableroTiro;
	private float dinero;
	private Collection<Armamento> armamento;
	private int cantidadEscudo;
	private int cantidadRadar;
	private TipoBarco tipoBarco;
	private Radar radar;
	private Casilla casillaDisparada;

	/**
	 * 
	 * @param pTipoBarco
	 * @param pX
	 * @param pY
	 * @param pOrientacion
	 */
	public void colocarBarco(TipoBarco pTipoBarco, int pX, int pY, Orientacion pOrientacion) {
		// TODO - implement Usuario.colocarBarco
		int Xmax;
		int Ymax;
		int Xmin;
		int Ymin;
			if(pOrientacion == Orientacion.HORIZONTAL) {
				Xmin= pX-1;
				Ymin = pY-1;
				Xmax = Xmin + 2;
				Ymax = Ymin+3;
				Casilla[][] matriz = new Casilla[3][tipoBarco.getLongitud()+2];
				for(int i = Xmin;i<=Xmax; i++) {
					for(int j=Ymin; j<=Ymax; j++) {
						matriz[i][j].esagua();
					}
				}
			}
		}
	
	public Casilla consultarRadar(int pX, int pY) {
		
		if(tieneRadar()) {

		int Xmin = Math.max(0, pX - 2);
		int Ymin = Math.max(0, pY - 2);
		
		int Xmax = Math.min(5, pX + 2);
		int Ymax = Math.min(5, pY + 2);
		
		Casilla[][] matriz = flota.getListaCasillas();
		
		for(int i = Xmin; i <= Xmax; i++) {
			for(int j = Ymin; j<= Ymax; j++) {
				if(matriz[i][j]!=null) {
					return matriz[i][j];
				} else {
					System.out.println("El radar no detecta barco");
				}
				}
			}
		} else {
			System.out.println("No tiene radar");
		}
		
		this.cantidadRadar-=1;

			return null;
			
		
		}
	
	/**
	 * 
	 * @param pX
	 * @param pY
	 */
	public void moverRadar(int pX, int pY) {
		Casilla[][] casillas = flota.getListaCasillas();
		Casilla casilla = casillas[pX][pY];
		radar.setPosicion(casilla);
		
	}
	


	/**
	 * 
	 * @param Armamento
	 * @param pX
	 * @param pY
	 */
	public Resultado disparar(Armamento Armamento, int pX, int pY) {
		
		if(tieneRadar() == false) {
			casillaDisparada.setX(pX);
			casillaDisparada.setY(pY);
			
			if(casillaDisparada.esAgua()) {
				return Resultado.AGUA;
			}else if ( (!casillaDisparada.esAgua()) & ) {
				
			}
		}
		
		Casilla[][] casillasOrdenador = flota.getListaCasillas();
		Casilla[][] resultados = this.tableroTiro.getListaCasillas();
		
		if(casillasOrdenador[pX][pY].getEsAgua()==true) {
			return Resultado.AGUA;
		} else if (casillasOrdenador[pX][pY].getEsAgua() == false & resultados[pX-1][pY].getEsAgua() == false){
			return Resultado.TOCADO;
		} else if(true) {
			return Resultado.HUNDIDO;
		}
	}

	/**
	 * 
	 * @param pDinero
	 */
	public Armamento comprarArmamento(int pDinero) {
		return null;
	}

	/**
	 * 
	 * @param dinero
	 */
	public void decrementarCantidadDinero(float precioBomba, int numComprasBomba, float precioMisil, int numComprasMisil, float precioRadar, int numComprasRadar, float precioEscudo, int numComprasEscudo) {
		// TODO - implement Usuario.decrementarCantidadDinero
		float precioFinal = precioBomba*numComprasBomba + precioMisil*numComprasMisil + precioRadar*numComprasRadar + precioEscudo*numComprasEscudo;		
		dinero = dinero-precioFinal;
	}

	/**
	 * 
	 * @param pDinero
	 * @param pBarco
	 */
	public boolean repararBarco(int pDinero, Barco pBarco) {
		// TODO - implement Usuario.repararBarco
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param cantidadEscudo
	 */
	public boolean tieneescudo(int cantidadEscudo) {
		// TODO - implement Usuario.tieneescudo
		throw new UnsupportedOperationException();
	}

	public Barco elegirBarcoAcolocar() {
		// TODO - implement Usuario.elegirBarcoAcolocar
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param cantidadRadar
	 */
	public boolean tieneRadar() {
		if(this.cantidadRadar > 0) {
			return true;
		} else {
			return false;
		}
	}

}