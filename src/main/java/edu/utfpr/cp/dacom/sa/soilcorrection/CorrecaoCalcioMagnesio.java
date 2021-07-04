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
		
		return valorCalcio / ((somaTeores + acidezPotencial) * 100);
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
		
		return valorMagnesio / ((somaTeores + acidezPotencial) * 100);
	}

}
