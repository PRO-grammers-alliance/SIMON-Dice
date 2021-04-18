package co.edu.unbosque.Model;

import co.edu.unbosque.Model.persistence.ArchivoTxt;
import co.edu.unbosque.Model.persistence.Propiedades;
import co.edu.unbosque.Model.persistence.Secuencia;

public class Operaciones {
	private ArchivoTxt a_txt;
	private Propiedades prop;
	private Secuencia s;
	
	public Operaciones() {
		a_txt = new ArchivoTxt();
		prop = new Propiedades();
		s = new Secuencia();
	
	}
	
	public void funcionar() {
		
		prop.escribirPropiedades();
		prop.leerPropiedades();
		s.generarNumeros();
		a_txt.escribirArchivo(arreglo());
	}
	
	public String arreglo() {
		String dato ="";
		for(int i = 0;i<4;i++) {
			dato += s.posisionArreglo(i)+" ";
			System.out.println(dato);
		}
			return dato;
		}
	
	
	
	public ArchivoTxt getA_txt() {
		return a_txt;
	}

	public void setA_txt(ArchivoTxt a_txt) {
		this.a_txt = a_txt;
	}

	public Propiedades getProp() {
		return prop;
	}

	public void setProp(Propiedades prop) {
		this.prop = prop;
	}

	public Secuencia getS() {
		return s;
	}

	public void setS(Secuencia s) {
		this.s = s;
	}
}
