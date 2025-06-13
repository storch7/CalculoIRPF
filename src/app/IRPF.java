package app;

public class IRPF {
	
	float salario;
		
	public void cadastrarSalario(float salario) {
		this.salario = salario;
		
	}
	
	public float getTotalSalario() {
		return 5000; //retorno pela técnica de falsicação
	}
}
