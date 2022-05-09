package br.com.cod3r.calc.visao;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame {

	public Calculadora() {
		setSize(232, 322);// Tamanho da Calculadora
		setDefaultCloseOperation(EXIT_ON_CLOSE);// Fechar quando aperta no "x"
		setLocationRelativeTo(null);// Centralizar a interface grafica
		setVisible(true);// Deixando a ablicação visivel
	}

	public static void main(String[] args) {

		new Calculadora();
	}
}
