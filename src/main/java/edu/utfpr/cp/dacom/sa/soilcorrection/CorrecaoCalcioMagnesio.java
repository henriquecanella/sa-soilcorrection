package edu.utfpr.cp.dacom.sa.soilcorrection;

public class CorrecaoCalcioMagnesio {
	
	public double SomaTeoresCMOL(
		double valorPotassio,
		double valorCalcio,
		double valorMagnesio
	) {
		return valorPotassio + valorCalcio + valorMagnesio;
	}
	
	public double CalculaAtualCTCSoloCalcio(
		double valorPotassio,
		double valorCalcio,
		double valorMagnesio,
		double acidezPotencial
	) {
		//acidezPotencial = H+AL
		
		double somaTeores = SomaTeoresCMOL(valorPotassio, valorCalcio, valorMagnesio);
		
		if (somaTeores <= 0 || acidezPotencial <= 0 || valorCalcio <= 0) {
			throw new IllegalArgumentException();
		}
		
		return valorCalcio / (somaTeores + acidezPotencial) * 100;
	}
	
	public double CalculaAtualCTCSoloMagnesio(
		double valorPotassio,
		double valorCalcio,
		double valorMagnesio,
		double acidezPotencial
	) {
		//acidezPotencial = H+AL
		
		double somaTeores = SomaTeoresCMOL(valorPotassio, valorCalcio, valorMagnesio);
		
		if (somaTeores <= 0 || acidezPotencial <= 0 || valorMagnesio <= 0) {
			throw new IllegalArgumentException();
		}
		
		return valorMagnesio / (somaTeores + acidezPotencial) * 100;
	}
	
	public double CalculaVAtual(
		double valorPotassio,
		double valorCalcio,
		double valorMagnesio,
		double acidezPotencial
	) {
		double somaTeores = SomaTeoresCMOL(valorPotassio, valorCalcio, valorMagnesio);
		
		return (100 * somaTeores) / (somaTeores + acidezPotencial);
	}
	
	//Alterar o nome do metodo
	public double metodoSemNome() {
		double F96;
		double G109;
		double I105;
		double P129;
		
		/*
		I105 = P129 * A105 / 1000;
		
		F96 = (valorCalcio * particpCalcio / CTCAtualCalcio) - valorCalcio - I105;
		
		double P91 = F96 / G109;
		
		if (P91 > 0.001) {
			return P91;
		}
		else {
			return 0.00;
		}
		*/
		return 0;
	}
	
	public double CalculaCusto(
		int corretivoEValor[],
		double PRNT,
		double valorPotassio,
		double valorCalcio,
		double valorMagnesio,
		double acidezPotencial,
		double PorcentParticpCalcio
	) {
		double resultadoCorretivo = 0;
		double calculosCalcio = 0;
		double auxCalculosCalcio = metodoSemNome();
		
		calculosCalcio = (auxCalculosCalcio * 100 / PRNT) * 2.42;
		
		if (corretivoEValor[0] == 7) {
			resultadoCorretivo = calculosCalcio * 44;
		}
		else {
			resultadoCorretivo = calculosCalcio * corretivoEValor[1];
		}
		
		
		
		double resultado = resultadoCorretivo / 2.42;
		
		return resultado;
	}
	
	public String IdealCalcio(
		int texturaSolo
	) {
		if (texturaSolo == 1) {
			return "45 a 55";
		}
		else if (texturaSolo == 2) {
			return "35 a 40";
		}
		else {
			return "";
		}
	}
	
	public String IdealMagneseio(
		int texturaSolo
	) {
		if (texturaSolo == 1) {
			return "10 a 15";
		}
		else if (texturaSolo == 2) {
			return "8 a 12";
		}
		else {
			return "";
		}
	}
	
	

}
