package vehiculos;

public class Camioneta extends Vehiculo{
	public static int totalCamionetas = 0;
	private boolean volco;

	public Camioneta( String placa,int puertas, String nombre, int precio, int peso,
			Fabricante fabricante,boolean volco){
		super(nombre,puertas, 90, placa,  precio, peso, "4X4", fabricante);
		this.volco = volco;
		totalCamionetas++;
	}

	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}	
}
