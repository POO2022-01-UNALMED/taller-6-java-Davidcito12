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
	
	private static int cantidadCamioneta = 0;
	private static int cantidadCamion = 0;
	private static int cantidadAutomovil = 0;
	private static int cantidadTotalvehiculos = cantidadAutomovil + cantidadCamion + cantidadCamioneta;
	


	public Vehiculo(int puertas, int velocidadMaxima, String placa, String nombre, int precio, int peso,
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
	}
	
	public String vehiculosPorTipo() {
		return "Automoviles: " + cantidadAutomovil + "\n"
			 + "Camionetas: " + cantidadCamioneta + "#\n"
			 + "Camiones: " + cantidadCamion;
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
	
	public static int getCantidadCamioneta() {
		return cantidadCamioneta;
	}



	public static void setCantidadCamioneta(int cantidadCamioneta) {
		Vehiculo.cantidadCamioneta = cantidadCamioneta;
	}



	public static int getCantidadCamion() {
		return cantidadCamion;
	}



	public static void setCantidadCamion(int cantidadCamion) {
		Vehiculo.cantidadCamion = cantidadCamion;
	}



	public static int getCantidadAutomovil() {
		return cantidadAutomovil;
	}



	public static void setCantidadAutomovil(int cantidadAutomovil) {
		Vehiculo.cantidadAutomovil = cantidadAutomovil;
	}



	public static int getCantidadTotalvehiculos() {
		return cantidadTotalvehiculos;
	}



	public static void setCantidadTotalvehiculos(int cantidadTotalvehiculos) {
		Vehiculo.cantidadTotalvehiculos = cantidadTotalvehiculos;
	}

	
	
}