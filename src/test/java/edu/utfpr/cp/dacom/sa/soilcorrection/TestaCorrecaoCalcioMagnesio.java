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
		//Todo
	}
	
	@Test
	void testaCalculaCTCSoloCorrecaoCalcio() {
		//Todo
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
