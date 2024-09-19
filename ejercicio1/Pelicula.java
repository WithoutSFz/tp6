package ejercicio1;

public class Pelicula extends ObjetoAlquilable {
	
	private String nombre;
	private String infopeli;

	public Pelicula(int unidades_disponibles, String nombre, String infopeli) {
		super(unidades_disponibles);
		this.nombre = nombre;
		this.infopeli = infopeli;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getInfopeli() {
		return infopeli;
	}

	public void setInfopeli(String infopeli) {
		this.infopeli = infopeli;
	}

	@Override
	public void alquilar() {
		if (this.disponible()) {
			this.setUnidades_disponibles(-1);
			System.out.println("La pelicula "+this.nombre+"fue alquilada.");
			
		}
		else {
			System.out.println("No hay copia disponible.");
		}

	}

	@Override
	public void devolver() {
		this.setUnidades_disponibles(1);
		System.out.println("La pelicula "+this.nombre+"fue devuelta.");

	}

}
