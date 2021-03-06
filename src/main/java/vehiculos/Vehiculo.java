package vehiculos;

public class Vehiculo {
	private int puertas;
	private int velocidadMaxima;
	private String placa;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	
	private static int cantidadVehiculos = 0;
	


	public Vehiculo(String placa,int puertas, int velocidadMaxima, String nombre, int precio, int peso,
			String traccion, Fabricante fabricante) {
		super();
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.placa = placa;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		fabricante.setTotalFabrica(fabricante.getTotalFabrica() + 1);
		fabricante.getPais().setCantidadVentas(fabricante.getPais().getCantidadVentas() + 1);
		cantidadVehiculos++;
	}
	
	public String vehiculosPorTipo() {
		return "Automoviles: " + Automovil.totalAutomoviles + "\n"
			 + "Camionetas: " + Camioneta.totalCamionetas + "#\n"
			 + "Camiones: " + Camion.totalCamiones;
	}
	
	
	
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getTraccion() {
		return traccion;
	}
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}


	public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}

	public static void setCantidadVehiculos(int cantidadVehiculos) {
		Vehiculo.cantidadVehiculos = cantidadVehiculos;
	}

	
	
}
