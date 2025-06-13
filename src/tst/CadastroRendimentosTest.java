package tst;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import app.IRPF;

class CadastroRendimentosTest {
	
	private IRPF irpf;
	
	@Before
	public void setup() {
		irpf = new IRPF();
	}
	
	@Test
	public void testCadastrarSalario() {
		irpf.cadastrarSalario(5000);
		assertEquals(5000, irpf.getTotalSalario(), 0);
	}
	
	

}
