package ejercicio1;

import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private int dni;
	private ArrayList<ObjetoAlquilable> misalquileres;
	public Cliente(String nombre, int dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.misalquileres = new ArrayList<ObjetoAlquilable>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	


}
