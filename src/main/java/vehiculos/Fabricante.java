package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private static ArrayList<Fabricante> Fabricantees = new ArrayList<Fabricante>();
	private int totalFabrica = 0;
	private String nombre;
	private Pais pais;
	
	
	
	public Fabricante( String nombre, Pais pais) {
		this.pais = pais;
		this.nombre = nombre;
		Fabricantees.add(this);
	}
	
	public static Fabricante FabricaMayorVentas(){
		Fabricante probablereturn = null;
		for(int i = 0; i - 1 < Fabricantees.size();i++) {
			Fabricante Fabricante1 = Fabricantees.get(i);
			Fabricante Fabricante2 = Fabricantees.get(i+1);
			if(Fabricante1.getTotalFabrica() < Fabricante2.getTotalFabrica()) {
				probablereturn = Fabricante2;
			}
		}
		return probablereturn;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getTotalFabrica() {
		return totalFabrica;
	}
	public void setTotalFabrica(int totalFabrica) {
		this.totalFabrica = totalFabrica;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
}
