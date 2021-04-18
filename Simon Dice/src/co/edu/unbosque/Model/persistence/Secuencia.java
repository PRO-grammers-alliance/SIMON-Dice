package co.edu.unbosque.Model.persistence;


public class Secuencia {
	
	private String arreglo[];
	private Propiedades prop;
	
	public Secuencia() {
		
		arreglo = new String[4];

	}
	
	//Método que genera y guarda un número entero random entre 1 y 4 por cada posición del Arreglo 
	public void generarNumeros() {
		int numero_r;
		for (int i = 0; i < arreglo.length; i++) {
			numero_r =  (int) Math.round(Math.random()*3+1);
			arreglo[i] = ""+numero_r;
		}
	}
	
	public String posisionArreglo(int i) {
		return arreglo[i];
	}

	public String[] getArreglo() {
		return arreglo;
	}

	public void setArreglo(String[] arreglo) {
		this.arreglo = arreglo;
	}

	
}
