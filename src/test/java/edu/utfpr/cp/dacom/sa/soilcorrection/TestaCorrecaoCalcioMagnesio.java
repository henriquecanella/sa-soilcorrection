package edu.utfpr.cp.dacom.sa.soilcorrection;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestaCorrecaoCalcioMagnesio {

	@Test
	void testaSomaTeoresCMOL() {
		var correcaoCalcioMagnesio = new CorrecaoCalcioMagnesio();
		var somaTeores = correcaoCalcioMagnesio.SomaTeoresCMOL(0.35, 6.0, 1.5);
		
		assertEquals(7.85, somaTeores);
	}
	
	@Test
	void testaCalculaAtualCTCSoloCalcio() {
		var correcaoCalcioMagnesio = new CorrecaoCalcioMagnesio();
		var atualCTCSoloCalcio = correcaoCalcioMagnesio.CalculaAtualCTCSoloCalcio(0.82, 12.45, 3.47, 5.15);
		assertEquals(56.87528551850159, atualCTCSoloCalcio);
	}
	
	@Test
	void testaCalculaCTCSoloCorrecaoCalcio() {
		
	}
	
	@Test
	void testaCalculaAtualCTCSoloMagnesio() {
		var correcaoCalcioMagnesio = new CorrecaoCalcioMagnesio();
		var atualCTCSoloCalcio = correcaoCalcioMagnesio.CalculaAtualCTCSoloMagnesio(0.82, 12.45, 3.47, 5.15);
		assertEquals(15.85198720877113, atualCTCSoloCalcio);
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
		var correcaoCalcioMagnesio = new CorrecaoCalcioMagnesio();
		var VAtual = correcaoCalcioMagnesio.CalculaVAtual(0.82, 12.45, 3.47, 5.15);
		assertEquals(76.47327546825034, VAtual);
	}
	
	@Test
	void testaCalculaVCorrecao() {
		//Todo
	}
	
	@Test
	void testaIdealCalcio() {
		var correcaoCalcioMagnesio = new CorrecaoCalcioMagnesio();
		var idealCalcio = correcaoCalcioMagnesio.IdealCalcio(1);
		assertEquals("45 a 55", idealCalcio);
	}
	
	@Test
	void testaIdealMagneseio() {
		var correcaoCalcioMagnesio = new CorrecaoCalcioMagnesio();
		var idealMagnesio = correcaoCalcioMagnesio.IdealMagneseio(1);
		assertEquals("10 a 15", idealMagnesio);
	}

}
