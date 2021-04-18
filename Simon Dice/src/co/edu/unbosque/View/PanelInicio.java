package co.edu.unbosque.View;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelInicio extends JPanel{

	private JButton ingresar;
	
	public PanelInicio() {
		setLayout(null);
		setVisible(true);
		inicializarComponentes();
		
	}
	
	public void inicializarComponentes() {
		ingresar = new JButton("Jugar SIMON");
		ingresar.setBounds(200, 300, 200, 30);
		ingresar.setActionCommand("INGRESAR");
		add(ingresar);
	}

	public JButton getIngresar() {
		return ingresar;
	}

	public void setIngresar(JButton ingresar) {
		this.ingresar = ingresar;
	}
	
}
