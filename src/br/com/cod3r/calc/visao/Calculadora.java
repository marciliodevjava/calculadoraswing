package br.com.cod3r.calc.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame {

	public Calculadora() {
		organizarLayout();
		setSize(232, 322);// Tamanho da Calculadora
		setDefaultCloseOperation(EXIT_ON_CLOSE);// Fechar quando aperta no "x"
		setLocationRelativeTo(null);// Centralizar a interface grafica
		setVisible(true);// Deixando a ablicação visivel
	}

	private void organizarLayout() {
		setLayout(new BorderLayout());
		
		Display display = new Display();
		display.setPreferredSize(new Dimension(233,60));
		add(display, BorderLayout.NORTH);
		Teclado teclado = new Teclado();
		add(teclado, BorderLayout.CENTER);
	}

	public static void main(String[] args) {

		new Calculadora();
	}
}
