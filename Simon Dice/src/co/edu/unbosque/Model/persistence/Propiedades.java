package co.edu.unbosque.Model.persistence;

import java.io.*;
import java.util.Properties;

public class Propiedades {

	private Properties prop = new Properties();
	private String archivoprop = "C:\\Users\\FELIPE SEGURA\\Documents\\programacion\\Archivos TxT\\juego_simon.properties";
	private int largo_s;
	
	public int escribirPropiedades() {
		try {
			prop.setProperty("secuencia", "4");
			prop.store(new FileOutputStream(archivoprop), null);
		} catch (IOException ex) {
			return -1;
		}
		return 0;
	}
	
	public String leerPropiedades() {
		String linea="";
		try {
			prop.load(new FileInputStream(archivoprop));
			linea = prop.getProperty("secuencia");
			String e =prop.getProperty("secuencia");
			largo_s = Integer.parseInt(e);
		} catch (IOException ex) {
			return null;
		}
		return linea;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public String getArchivoprop() {
		return archivoprop;
	}

	public void setArchivoprop(String archivoprop) {
		this.archivoprop = archivoprop;
	}

	public int getLargo_s() {
		return largo_s;
	}

	public void setLargo_s(int largo_s) {
		this.largo_s = largo_s;
	}
}


