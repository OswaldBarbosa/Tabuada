package br.senai.sp.jandira;

import java.util.Scanner;

import br.senai.sp.jandira.model.Tabuada;

public class AppTabuada {
	
	public static void main(String[] args) {
	
	Scanner leitor = new Scanner(System.in);
	
	Tabuada Oswaldo = new Tabuada();

	System.out.println("multiplicando: ");
	leitor.nextInt();
	
	System.out.println("minimoMultiplicador");
	leitor.nextInt();
	
	System.out.println("maximoMultiplicador");
	leitor.nextInt();
	
	System.out.println(Oswaldo.getresultado());
	
	}
}
