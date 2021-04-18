package co.edu.unbosque.View;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

public class PanelJuego extends JPanel {
	
	private JLabel numero;
	private JLabel casilla1;
	private JLabel casilla2;
	private JLabel casilla3;
	private JLabel casilla4;
	private JButton bt1;
	private JButton bt2;
	private JButton bt3;
	private JButton bt4;
	private JButton empezar;
	private JButton terminar;
	private ImageIcon uno;
	private ImageIcon dos;
	private ImageIcon tres;
	private ImageIcon cuatro;
	
	public PanelJuego() {
		uno = new ImageIcon(getClass().getResource("/imagenes/1_1.jpg"));
		dos = new ImageIcon(getClass().getResource("/imagenes/2.jpg"));
		tres = new ImageIcon(getClass().getResource("/imagenes/3.jpg"));
		cuatro = new ImageIcon(getClass().getResource("/imagenes/4.jpg"));
		setBackground(Color.white);
		setLayout(null);
		setVisible(true);
		inicializarComponentes();
	}
	
	public void inicializarComponentes() {
		numero = new JLabel("Numero:");
		numero.setBounds(120,45,90,30);
		add(numero);
		
		casilla1 = new JLabel("");
		casilla1.setBorder(new LineBorder(Color.black));
		casilla1.setBounds(220,30,60,60);
		add( casilla1);
		
		casilla2 = new JLabel("");
		casilla2.setBorder(new LineBorder(Color.black));
		casilla2.setBounds(290,30,60,60);
		add( casilla2);
		
		casilla3 = new JLabel("");
		casilla3.setBorder(new LineBorder(Color.black));
		casilla3.setBounds(360,30,60,60);
		add( casilla3);
		
		casilla4 = new JLabel("");
		casilla4.setBorder(new LineBorder(Color.black));
		casilla4.setBounds(430,30,60,60);
		add( casilla4);
		
		bt1 = new JButton(uno);
		bt1.setBorder(new LineBorder(Color.black));
		bt1.setBackground(Color.black);
		bt1.setBounds(130,120,225,150);
		bt1.setActionCommand("UNO");
		add(bt1);
		
		bt2 = new JButton(dos);
		bt2.setBorder(new LineBorder(Color.black));
		bt2.setBackground(Color.black);
		bt2.setBounds(355,120,225,150);
		bt2.setActionCommand("2");
		add(bt2);
		
		bt3 = new JButton(tres);
		bt3.setBorder(new LineBorder(Color.black));
		bt3.setBackground(Color.black);
		bt3.setBounds(130,270,225,150);
		bt3.setActionCommand("3");
		add(bt3);
		
		bt4 = new JButton(cuatro);
		bt4.setBorder(new LineBorder(Color.black));
		bt4.setBackground(Color.black);
		bt4.setBounds(355,270,225,150);
		bt4.setActionCommand("4");
		add(bt4);
		
		empezar = new JButton("Comenzar");
		empezar.setBounds(180,440,150,30);
		empezar.setActionCommand("EMPEZAR");
		add(empezar);
		
		terminar = new JButton("Terminar");
		terminar.setBounds(380,440,150,30);
		terminar.setActionCommand("TERMINAR");
		add(terminar);
	}

	public JLabel getNumero() {
		return numero;
	}

	public void setNumero(JLabel numero) {
		this.numero = numero;
	}

	public JLabel getCasilla1() {
		return casilla1;
	}

	public void setCasilla1(JLabel string) {
		this.casilla1 = string;
	}

	public JLabel getCasilla2() {
		return casilla2;
	}

	public void setCasilla2(JLabel casilla2) {
		this.casilla2 = casilla2;
	}

	public JLabel getCasilla3() {
		return casilla3;
	}

	public void setCasilla3(JLabel casilla3) {
		this.casilla3 = casilla3;
	}

	public JLabel getCasilla4() {
		return casilla4;
	}

	public void setCasilla4(JLabel casilla4) {
		this.casilla4 = casilla4;
	}

	public JButton getBt1() {
		return bt1;
	}

	public void setBt1(JButton bt1) {
		this.bt1 = bt1;
	}

	public JButton getBt2() {
		return bt2;
	}

	public void setBt2(JButton bt2) {
		this.bt2 = bt2;
	}

	public JButton getBt3() {
		return bt3;
	}

	public void setBt3(JButton bt3) {
		this.bt3 = bt3;
	}

	public JButton getBt4() {
		return bt4;
	}

	public void setBt4(JButton bt4) {
		this.bt4 = bt4;
	}

	public JButton getEmpezar() {
		return empezar;
	}

	public void setEmpezar(JButton empezar) {
		this.empezar = empezar;
	}

	public JButton getTerminar() {
		return terminar;
	}

	public void setTerminar(JButton terminar) {
		this.terminar = terminar;
	}

	public ImageIcon getUno() {
		return uno;
	}

	public void setUno(ImageIcon uno) {
		this.uno = uno;
	}

	public ImageIcon getDos() {
		return dos;
	}

	public void setDos(ImageIcon dos) {
		this.dos = dos;
	}

	public ImageIcon getTres() {
		return tres;
	}

	public void setTres(ImageIcon tres) {
		this.tres = tres;
	}

	public ImageIcon getCuatro() {
		return cuatro;
	}

	public void setCuatro(ImageIcon cuatro) {
		this.cuatro = cuatro;
	}
}
