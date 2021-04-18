package co.edu.unbosque.View;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class VentanaJuego extends JFrame {

	private PanelJuego pj;
	
	public VentanaJuego() {
		setTitle("SIMON");
		setPreferredSize(new Dimension(700,550));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());
		inicializarComponentes();
		setResizable(false);
		setLocationRelativeTo(null);
		pack();
		setVisible(false);
	}
	
	public void inicializarComponentes() {
		pj = new PanelJuego();
		getContentPane().add(pj,BorderLayout.CENTER);
		pj.setBounds(0, 0, 700, 500);
	}

	public PanelJuego getPj() {
		return pj;
	}

	public void setPj(PanelJuego pj) {
		this.pj = pj;
	}
}
