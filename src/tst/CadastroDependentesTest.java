package tst;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import app.IRPF;

class CadastroDependentesTest {
	private IRPF irpf;
	
	@BeforeEach
	irpf = new IRPF();
	
	@Test
	void testCadastrarUmDepentente() {
		irpf.cadastrarDependente("Joao");
		assertEquals(189.59, irpf.getDeducapDependentes(), 0);
	}

}
