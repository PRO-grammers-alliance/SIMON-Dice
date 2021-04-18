package co.edu.unbosque.Model.persistence;

import java.io.*;


public class ArchivoTxt {

	private String archivodata = "C:\\Users\\FELIPE SEGURA\\Documents\\programacion\\Archivos TxT\\juego_simon.txt";
	private Secuencia s;
	public ArchivoTxt() {
		s = new Secuencia();
	}
	
	public int escribirArchivo(String dato) {
		File f = new File(this.archivodata);// f-> carga el archivo
		
		try {
			FileWriter fw = new FileWriter(f); //fw->cera un flujo desde f
			PrintWriter pw = new PrintWriter(fw); //pw->permite la escritura en el archivo
			
			pw.println(dato); //se escribe el contenido del parametro dato en el archivo
			
			fw.close();
		} catch (IOException e) {
			return -1;
		}
		return 0;
	}
	
	public String leerArchivo() {
		
		String linea  = "";
		String cadena = "";
		File f = new File(this.archivodata); // f->carga el archivo
		
		try {
			FileReader fr = new FileReader(f); //fr-> crea el flujo desde f
			BufferedReader br = new BufferedReader(fr); //
			linea = br.readLine(); // linea toma el valor de la primera linea
			for(int i = 0;i<s.getArreglo().length;i++) { // mientras haya datos por leer en el archivo	
				cadena += linea+"\n";	// acumular en cadena lo leido en linea
				linea = br.readLine(); // lee el valor de la siguente linea
			}
			fr.close();
		} catch (IOException e) {
			return null;
		}
		return cadena;
	}
	

	public String getArchivodata() {
		return archivodata;
	}

	public void setArchivodata(String archivodata) {
		this.archivodata = archivodata;
	}

	public Secuencia getS() {
		return s;
	}

	public void setS(Secuencia s) {
		this.s = s;
	}
}
