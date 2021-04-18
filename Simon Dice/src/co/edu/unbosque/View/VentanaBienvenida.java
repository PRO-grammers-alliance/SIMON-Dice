package co.edu.unbosque.View;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class VentanaBienvenida extends JFrame {

	private PanelImagen pim;
	private PanelInicio pi;
	private JLayeredPane lpane;
	
	public VentanaBienvenida() {
		
		setTitle("SIMON");
		setPreferredSize(new Dimension(615,435));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());
		inicializarComponentes();
		setResizable(false);
		setLocationRelativeTo(null);
		pack();
		setVisible(true);
		
		
	}
	
	public void inicializarComponentes() {
		lpane = new JLayeredPane();
		getContentPane().add(lpane,BorderLayout.CENTER);
		lpane.setBounds(0, 0, 600, 400);
		
		pim = new PanelImagen();
		pim.setBounds(0, 0, 600, 400);
		pim.setOpaque(true);
		lpane.add(pim);
		
		pi = new PanelInicio();
		pi.setBounds(0, 0, 600, 400);
		pi.setOpaque(false);
		lpane.add(pi);
	}

	public PanelImagen getPim() {
		return pim;
	}

	public void setPim(PanelImagen pim) {
		this.pim = pim;
	}

	public PanelInicio getPi() {
		return pi;
	}

	public void setPi(PanelInicio pi) {
		this.pi = pi;
	}

	public JLayeredPane getLpane() {
		return lpane;
	}

	public void setLpane(JLayeredPane lpane) {
		this.lpane = lpane;
	}

	
}
