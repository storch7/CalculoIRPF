package tst;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import app.IRPF;

class CadastroDependentesTest {
	
	private IRPF irpf;
	
	@BeforeEach
	public void setup() {
		irpf = new IRPF();		
	}
	
	@Test
	public void testCadastrarUmDepentente() {
		irpf.cadastrarDependente("Joao");
		assertEquals(189.59f, irpf.getDeducaoDependentes(), 0);
	}
	
	@Test
	public void testCadastrarDoisDepentente() {
		irpf.cadastrarDependente("Joao");
		irpf.cadastrarDependente("Maria");
		assertEquals(2*189.59f, irpf.getDeducaoDependentes(), 0);
	}
	
	@Test
	public void testCadastrarTresDepentente() {
		irpf.cadastrarDependente("Joao");
		irpf.cadastrarDependente("Maria");
		irpf.cadastrarDependente("Jose");
		assertEquals(3*189.59f, irpf.getDeducaoDependentes(), 0);
	}

}
