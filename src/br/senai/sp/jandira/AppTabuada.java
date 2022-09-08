package br.senai.sp.jandira;

import br.senai.sp.jandira.gui.FrameTabuada;
import br.senai.sp.jandira.model.Tabuada;

public class AppTabuada {
	
	public static void main(String[] args) {
		
		FrameTabuada tela = new FrameTabuada();
		tela.titulo = "Tabuada";
		tela.largura = 450;
		tela.altura = 600;
		tela.criarTela();
		
		Tabuada tabuada = new Tabuada();
		
		tabuada.multiplicando = 4;
		tabuada.minimoMultiplicador = 5;
		tabuada.maximoMultiplicador = 10;
		
		String[] resultado = tabuada.getTabuada();
		
		int i = 0;
		while (i < resultado.length) {
			System.out.println(resultado[i]);
			i++;
		}
	}
	
}
