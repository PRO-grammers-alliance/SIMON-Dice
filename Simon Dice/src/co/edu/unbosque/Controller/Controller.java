package co.edu.unbosque.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import co.edu.unbosque.Model.Operaciones;
import co.edu.unbosque.View.VentanaBienvenida;
import co.edu.unbosque.View.VentanaJuego;
import co.edu.unbosque.View.VentanaResultado;

public class Controller implements ActionListener {
	private VentanaBienvenida ventana_b;
	private VentanaJuego ventana_j;
	private VentanaResultado ventana_r;
	private Operaciones op;
	private String[] numero_j;
	int i;
	
	public Controller() {
		ventana_b = new VentanaBienvenida();
		ventana_j = new VentanaJuego();
		ventana_r = new VentanaResultado();
		op = new Operaciones();
		numero_j = new String[4];
		
		i = 0;
		asignarOyentes();
	}
	
	public void asignarOyentes() {
		ventana_b .getPi().getIngresar().addActionListener(this);
		ventana_j.getPj().getEmpezar().addActionListener(this);
		ventana_j.getPj().getBt1().addActionListener(this);
		ventana_j.getPj().getBt2().addActionListener(this);
		ventana_j.getPj().getBt3().addActionListener(this);
		ventana_j.getPj().getBt4().addActionListener(this);
		ventana_j.getPj().getTerminar().addActionListener(this);


	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("INGRESAR")) {
			ventana_b.setVisible(false);
			ventana_r.mostrarInfo("Bienvenido a SIMON \nEl juego consiste en repetir la secuencia de numeros\nque se le mostrara, cuando presione el boton de comenzar,\ntiene solo un intento si repilica correctamente la secuencia ganara.\nBuena suerte!!", "informativo");
			ventana_j.setVisible(true);
		}else if (e.getActionCommand().equals("EMPEZAR")) {
			op.funcionar();
			ventana_j.getPj().getEmpezar().setVisible(false);
			
			ventana_j.getPj().getCasilla1().setText(op.getS().posisionArreglo(0));
			esperar();
		
		}else if(e.getActionCommand().equals("UNO")) {
			numero_j[i]="1";
			i++;
		}else if(e.getActionCommand().equals("2")) {
			numero_j[i]="2";
			i++;
		}else if(e.getActionCommand().equals("3")) {
			numero_j[i]="3";
			i++;
		}else if(e.getActionCommand().equals("4")) {
			numero_j[i]="4";
			i++;
		}else if(e.getActionCommand().equals("TERMINAR")) {
			ventana_j.setVisible(false);
			validarGanador();
			i=0;
			ventana_j.getPj().getEmpezar().setVisible(true);
			ventana_b.setVisible(true);
		}
	}
	
	public void esperar() {
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
	    Runnable tarea1 = ()-> ventana_j.getPj().getCasilla1().setText("");
	    Runnable tarea2 = ()-> ventana_j.getPj().getCasilla2().setText(op.getS().posisionArreglo(1));
	    service.scheduleAtFixedRate(tarea1, 2, 1, TimeUnit.SECONDS);
	    service.scheduleAtFixedRate(tarea2, 2, 1, TimeUnit.SECONDS);
	    Runnable tarea3 = ()-> ventana_j.getPj().getCasilla2().setText("");
	    Runnable tarea4 = ()-> ventana_j.getPj().getCasilla3().setText(op.getS().posisionArreglo(2));
	    service.scheduleAtFixedRate(tarea3, 3, 1, TimeUnit.SECONDS);
	    service.scheduleAtFixedRate(tarea4, 3, 1, TimeUnit.SECONDS);
	    Runnable tarea5 = ()-> ventana_j.getPj().getCasilla3().setText("");
	    Runnable tarea6 = ()-> ventana_j.getPj().getCasilla4().setText(op.getS().posisionArreglo(3));
	    service.scheduleAtFixedRate(tarea5, 4, 1, TimeUnit.SECONDS);
	    service.scheduleAtFixedRate(tarea6, 4, 1, TimeUnit.SECONDS);
	    Runnable tarea7 = ()-> ventana_j.getPj().getCasilla4().setText("");
	    service.scheduleAtFixedRate(tarea7, 5, 1, TimeUnit.SECONDS);

	}
			
	public void validarGanador() {
			
		int contador = 0;
		for(int i=0;i<op.getS().getArreglo().length;i++){
			for(int j = 0; j<numero_j.length;j++) {
				if(i==j) {
					System.out.println(op.getS().posisionArreglo(i)+" - "+numero_j[j]+" = "+contador);
					if(op.getS().posisionArreglo(i).equals(numero_j[j])) {
							contador++;
					 }
				}
			}
		}
		if(contador==4) {
			ventana_r.mostrarInfo("¡¡¡Felicidades ganaste!!!", "informativo");
		}else {
			ventana_r.mostrarInfo("Lo siento la secuencia era : \n"+op.arreglo(), "error");
		}
	}
}
