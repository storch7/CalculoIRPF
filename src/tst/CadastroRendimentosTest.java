package tst;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import app.IRPF;

class CadastroRendimentosTest {
	
	private IRPF irpf;
	
	@BeforeEach
	public void setup() {
		irpf = new IRPF();
	}
	
	@Test
	public void testCadastrarSalario() {
		irpf.cadastrarSalario(5000);
		assertEquals(5000, irpf.getTotalSalario(), 0);
	}
	
	@Test
	public void testCadastrarSalario2() {
		irpf.cadastrarSalario(6000);
		assertEquals(6000, irpf.getTotalSalario(), 0);
	}
	
	@Test
	public void testCadastrarSalario3() {
		irpf.cadastrarSalario(5000);
		irpf.cadastrarSalario(6000);
		assertEquals(11000, irpf.getTotalSalario(), 0);
	}

}
