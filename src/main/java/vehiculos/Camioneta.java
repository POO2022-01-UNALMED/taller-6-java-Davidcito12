package vehiculos;

public class Camioneta extends Vehiculo{
	private boolean volco;

	public Camioneta( String placa,int puertas, String nombre, int precio, int peso,
			Fabricante fabricante,boolean volco){
		super(puertas, 90, placa, nombre, precio, peso, "4X4", fabricante);
		this.volco = volco;
		Vehiculo.setCantidadCamioneta(getCantidadCamioneta() + 1);
	}

	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}	
}
