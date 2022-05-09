package vehiculos;

public class Automovil extends Vehiculo{
	public static int totalAutomoviles = 0;
	
	public Automovil( String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		super(nombre,4, 100, placa,  precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		totalAutomoviles++;
	}

	private int puestos;
	public int getPuestos() {
		return puestos;
	}
	
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
}
