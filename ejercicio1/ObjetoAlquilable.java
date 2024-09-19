package ejercicio1;

public abstract class ObjetoAlquilable {
	private int unidades_disponibles;

	public ObjetoAlquilable(int unidades_disponibles) {
		this.unidades_disponibles = unidades_disponibles;
	}
	
	
	public int getUnidades_disponibles() {
		return unidades_disponibles;
	}


	public void setUnidades_disponibles(int unidades_disponibles) {
		this.unidades_disponibles += unidades_disponibles;
	}


	public abstract void alquilar();
	
	public abstract void devolver();
	public boolean disponible() {
		
		return this.unidades_disponibles>0;
	}
	
	
	

}
