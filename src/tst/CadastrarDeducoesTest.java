package tst;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import app.IRPF;

class CadastrarDeducoesTest {
	
	private IRPF irpf;
	
	@BeforeEach
	public void setup() {
		irpf = new IRPF();
	}
	
	@Test
	void testCadastrarPrevidenciaOficial() {
		irpf.cadastrarPrevidenciaOficial(700);
		assertEquals(700, irpf.getPrevidenciaOficial(), 0);
	}
	
	@Test
	void testCadastrarPrevidenciaOficial2() {
		irpf.cadastrarPrevidenciaOficial(800);
		assertEquals(800, irpf.getPrevidenciaOficial(), 0);
	}
	
	@Test
	void testCadastrarPrevidenciaOficial3() {
		irpf.cadastrarPrevidenciaOficial(900);
		assertEquals(900, irpf.getPrevidenciaOficial(), 0);
	}
}
