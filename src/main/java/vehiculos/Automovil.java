package vehiculos;

public class Automovil extends Vehiculo{
	
	public Automovil( String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		super(4, 100, placa, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		Vehiculo.setCantidadAutomovil(getCantidadAutomovil() + 1);
	}

	private int puestos;
	public int getPuestos() {
		return puestos;
	}
	
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
}
