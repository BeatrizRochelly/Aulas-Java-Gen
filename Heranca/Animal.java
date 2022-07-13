package Heranca;


public class Animal {
     
	//CARACTERISTICAS -> TRIBUTOS
	
	private String nome;
	private int idade;
	private boolean som;
	
	//COMPORTAMENTOS E METODOS
	
	public void emitesom() {
		this.som=true;
	}
	
	public void naoemitesom() {
		this.som=false;
	}
	
	public void informacao() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade"+this.idade);
		System.out.println("O animal emite som?"+this.som);
		
	}
	
	//METODOS ACESSORES->GETS E MODIFICADORES->SETS
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public boolean isSom() {
		return som;
	}
	public void setSom(boolean som) {
		this.som = som;
	}
	

	
}
