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
		irpf.cadastrarPrevidenciaOficial(700f);
		assertEquals(700, irpf.getPrevidenciaOficial(), 0);
	}

}
