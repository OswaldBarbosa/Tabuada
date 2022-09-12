package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.Scrollable;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import br.senai.sp.jandira.model.Tabuada;

public class FrameTabuada {
	
	public String titulo;
	public int altura;
	public int largura;
	
	public Color corDoPainel = new Color(255,255,255);
	public Color corDoTitulo = new Color(0,0,0);
	public Color corDoTexto = new Color(0,0,0);
	public Color corDoCalcular = new Color(39,148,20);
	public Color corDoLimpar = new Color(232,172,41);
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
		
		JTextField textFieldMultiplicando = new JTextField();
		textFieldMultiplicando.setHorizontalAlignment(JTextField.RIGHT);
		textFieldMultiplicando.setBounds(270, 145, 150, 30);
		
		JLabel labelMinimo = new JLabel();
		labelMinimo.setText("Mínimo Multiplicador:");
		labelMinimo.setFont(fonteTexto);
		labelMinimo.setForeground(corDoTexto);
		labelMinimo.setBounds(52, 190, 250, 30);
		
		JTextField textFieldMinimo = new JTextField();
		textFieldMinimo.setHorizontalAlignment(JTextField.RIGHT);
		textFieldMinimo.setBounds(270, 195, 150, 30);
		
		JLabel labelMaximo = new JLabel();
		labelMaximo.setText("Maximo Multiplicador:");
		labelMaximo.setFont(fonteTexto);
		labelMaximo.setForeground(corDoTexto);
		labelMaximo.setBounds(50, 240, 250, 30);
		
		JTextField textFieldMaximo = new JTextField();
		textFieldMaximo.setHorizontalAlignment(JTextField.RIGHT);
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
		
		JList<String> listResultado = new JList<>();
		listResultado.setBorder(new LineBorder(corDoTexto));
		listResultado.setBounds(15, 390, 405 , 220);
		
		JScrollPane scrollResultado = new JScrollPane();
		scrollResultado.setBounds(15, 390, 405, 220);
		
		ImageIcon icon = new ImageIcon("C:/Users/22282212/Desktop/FPOO/Eclipse/eclipse-workspace/Tabuada/src/br/senai/sp/jandira/calculadora.png");
		JLabel labelIcon = new JLabel(icon);
		labelIcon.setBounds (15, 55, 32, 32);
		
		
		//Adicionar componentes no painel
		painel.add(labelTabuada);
		painel.add(labelDescricaoPrimeira);
		painel.add(labelDescricaoSegunda);
		painel.add(labelMultiplicando);
		painel.add(textFieldMultiplicando);
		painel.add(labelMinimo);
		painel.add(textFieldMinimo);
		painel.add(labelMaximo);
		painel.add(textFieldMaximo);
		painel.add(buttonCalcular);
		painel.add(buttonCalcular);
		painel.add(listResultado);
		painel.add(buttonLimpar);
		painel.add(scrollResultado);
		painel.add(labelIcon);

		
		//Deixar a tela visivel
		tela.setVisible(true);
		
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(textFieldMultiplicando.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Multiplicando está vazio", "Erro", JOptionPane.OK_OPTION);
					textFieldMultiplicando.requestFocus();
				} else if (textFieldMinimo.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Mínimo multplicador está vazio", "Erro", JOptionPane.OK_OPTION);
					textFieldMinimo.requestFocus();
				} else if (textFieldMaximo.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Maximo multiplicador está vazio", "Erro", JOptionPane.OK_OPTION);
					textFieldMaximo.requestFocus();
				} else {
					Tabuada tabuda = new Tabuada();
					tabuda.multiplicando = Integer.parseInt(textFieldMultiplicando.getText());
					tabuda.minimoMultiplicador = Integer.parseInt(textFieldMinimo.getText());
					tabuda.maximoMultiplicador = Integer.parseInt(textFieldMaximo.getText());
					
					if (tabuda.maximoMultiplicador >= tabuda.minimoMultiplicador) {
						listResultado.setListData(tabuda.getTabuada());
						scrollResultado.getViewport().add(listResultado);
					} else {
						JOptionPane.showMessageDialog(null, "Mínimo multiplicador é maior que o maximo multiplicador", "Erro", JOptionPane.OK_OPTION);
						textFieldMultiplicando.setText("");
						textFieldMaximo.setText("");
						textFieldMinimo.setText("");
					}
				
				}
			}
			
		});
		
		buttonLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				DefaultListModel<String> listModel = new DefaultListModel<>();
				listResultado.setModel(listModel);
				textFieldMaximo.setText("");
				textFieldMinimo.setText("");
				textFieldMultiplicando.setText("");
				textFieldMultiplicando.requestFocus();
				
			}
		}) ;
	
	}
}

