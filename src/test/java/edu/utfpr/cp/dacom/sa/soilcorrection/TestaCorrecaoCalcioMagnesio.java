package edu.utfpr.cp.dacom.sa.soilcorrection;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestaCorrecaoCalcioMagnesio {

	@Test
	void testaSomaTeoresCMOL() {
		var correcaoCalcioMagnesio = new CorrecaoCalcioMagnesio();
		var somaTeores = correcaoCalcioMagnesio.SomaTeoresCMOL(0.5, 0.5, 0.5);
		
		assertEquals(1.5, somaTeores);
	}
	
	@Test
	void testaCalculaAtualCTCSoloCalcio() {
		var correcaoCalcioMagnesio = new CorrecaoCalcioMagnesio();
		var atualCTCSoloCalcio = correcaoCalcioMagnesio.CalculaAtualCTCSoloCalcio(5, 5, 5, 5);
		assertEquals(0.0025, atualCTCSoloCalcio);
	}
	
	@Test
	void testaCalculaCTCSoloCorrecaoCalcio() {
		var correcaoCalcioMagnesio = new CorrecaoCalcioMagnesio();
		var atualCTCSoloCalcio = correcaoCalcioMagnesio.CalculaAtualCTCSoloMagnesio(5, 5, 5, 5);
		assertEquals(0.0025, atualCTCSoloCalcio);
	}
	
	@Test
	void testaCalculaAtualCTCSoloMagnesio() {
		//Todo
	}
	
	@Test
	void testaCalculaCTCSoloCorrecaoMagnesio() {
		//Todo
	}
	
	@Test
	void testaCalculaQuantidadeCorretivo() {
		//Todo
	}
	
	@Test
	void testaCalculaCusto() {
		//Todo
	}
	
	@Test
	void testaCalculaVAtual() {
		//Todo
	}
	
	@Test
	void testaCalculaVCorrecao() {
		//Todo
	}

}
