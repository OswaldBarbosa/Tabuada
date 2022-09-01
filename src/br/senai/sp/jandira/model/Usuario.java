package br.senai.sp.jandira.model;

public class Usuario {
	
	public int multiplicando;
	public int minimoMultiplicador;
	public int maximoMultiplicador;
	
	public int getresultado() {
		return multiplicando * minimoMultiplicador;
	}

}
