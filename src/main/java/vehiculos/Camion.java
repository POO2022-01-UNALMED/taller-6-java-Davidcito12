package vehiculos;

public class Camion extends Vehiculo{
	private int ejes;

	public Camion(String placa, String nombre, int precio, int peso,
			Fabricante fabricante,int ejes) {
		super(nombre,2,80, placa,  precio, peso, "4X2", fabricante);
		Vehiculo.setCantidadCamion(getCantidadCamion() + 1);
		this.ejes = ejes;
	}
	
	
	
}
