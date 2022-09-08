package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class FrameTabuada {
	
	public String titulo;
	public int altura;
	public int largura;
	
	public Color corDoPainel = new Color(255,255,255);
	public Color corDoTitulo = new Color(0,0,0);
	public Color corDoTexto = new Color(0,0,0);
	public Color corDoCalcular = new Color(0,255,0);
	public Color corDoLimpar = new Color(255,255,36);
	public Font fonteTitulo = new Font("Segoe UI", Font.BOLD, 25);
	public Font fonteTexto = new Font("Segoe UI", Font.BOLD, 20);
	public Font fonteDescricao = new Font("Segoe UI", Font.BOLD, 11);
	
	public void criarTela() {
		
		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		//Criando um container
		Container painel = tela.getContentPane();
		painel.setBackground(corDoPainel);
		
		//Crias os componestes da tela
		JLabel labelTabuada = new JLabel();
		labelTabuada.setText("Tabuada 1.0");
		labelTabuada.setFont(fonteTitulo);
		labelTabuada.setForeground(corDoTitulo);
		labelTabuada.setBounds(60, 40, 150, 30);
		
		JLabel labelDescricaoPrimeira = new JLabel();
		labelDescricaoPrimeira.setText("Com a tabuada 1.0 os seus problemas acabaram. Calcule");
		labelDescricaoPrimeira.setFont(fonteDescricao);
		labelDescricaoPrimeira.setForeground(corDoTexto);
		labelDescricaoPrimeira.setBounds(62, 35, 500, 90);
		
		JLabel labelDescricaoSegunda = new JLabel();
		labelDescricaoSegunda.setText("a tabuada que desejar em segundos!");
		labelDescricaoSegunda.setFont(fonteDescricao);
		labelDescricaoSegunda.setForeground(corDoTexto);
		labelDescricaoSegunda.setBounds(62, 48, 500, 90);
		
		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setFont(fonteTexto);
		labelMultiplicando.setForeground(corDoTexto);
		labelMultiplicando.setBounds(127, 55, 150, 200);
		
		JTextField textFielMultiplicando = new JTextField();
		textFielMultiplicando.setBounds(270, 145, 150, 30);
		
		JLabel labelMinimo = new JLabel();
		labelMinimo.setText("Mínimo Multiplicador:");
		labelMinimo.setFont(fonteTexto);
		labelMinimo.setForeground(corDoTexto);
		labelMinimo.setBounds(52, 190, 250, 30);
		
		JTextField textFieldMinimo = new JTextField();
		textFieldMinimo.setBounds(270, 195, 150, 30);
		
		JLabel labelMaximo = new JLabel();
		labelMaximo.setText("Maximo Multiplicador:");
		labelMaximo.setFont(fonteTexto);
		labelMaximo.setForeground(corDoTexto);
		labelMaximo.setBounds(50, 240, 250, 30);
		
		JTextField textFieldMaximo = new JTextField();
		textFieldMaximo.setBounds(270, 245, 150, 30);
		
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setFont(fonteTexto);
		buttonCalcular.setForeground(corDoPainel);
		buttonCalcular.setBackground(corDoCalcular);
		buttonCalcular.setBounds(15, 300, 240, 45);
		
		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setFont(fonteTexto);
		buttonLimpar.setForeground(corDoPainel);
		buttonLimpar.setBackground(corDoLimpar);
		buttonLimpar.setBounds(265, 300, 155, 45);
		
		JLabel labelResultado = new JLabel();
		labelResultado.setText("Resultado:");
		labelResultado.setFont(fonteTexto);
		labelResultado.setForeground(corDoCalcular);
		labelResultado.setBounds(50, 320, 250, 30);
		
		
		//Adicionar componentes no painel
		painel.add(labelTabuada);
		painel.add(labelDescricaoPrimeira);
		painel.add(labelDescricaoSegunda);
		painel.add(labelMultiplicando);
		painel.add(textFielMultiplicando);
		painel.add(labelMinimo);
		painel.add(textFieldMinimo);
		painel.add(labelMaximo);
		painel.add(textFieldMaximo);
		painel.add(buttonCalcular);
		painel.add(buttonCalcular);
		painel.add(buttonLimpar);
		painel.add(labelResultado);
		
		//Deixar a tela visivel
		tela.setVisible(true);
		
		
		
	}
	

}
