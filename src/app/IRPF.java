package app;

public class IRPF {
	
	private float salario;
	private float contribuicaoPrevidenciaria;
	private String[] dependentes;
		
	public void cadastrarSalario(float salario) {
		this.salario += salario;
	}
	
	public float getTotalSalario() {
		return this.salario;
	}
	
	public void cadastrarPrevidenciaOficial(float contribuicaoPrevidenciaria) {
		this.contribuicaoPrevidenciaria = contribuicaoPrevidenciaria;
	}
	
	public float getPrevidenciaOficial() {
		return this.contribuicaoPrevidenciaria;
	}
	
	public void cadastrarDependente(String nome) {
		//criar uma nova posição no vetor de dependentes
		String[] temp = new String[dependentes.length + 1];
		for (int i = 0; i < dependentes.length; i++) {
			temp[i] = dependentes[i];
		}
		
		//Alocar novo dependente no vetor
		temp[dependentes.length] = nome;
		
		//Atualizar referencias do vetor de dependentes
		dependentes = temp;
	}
}
