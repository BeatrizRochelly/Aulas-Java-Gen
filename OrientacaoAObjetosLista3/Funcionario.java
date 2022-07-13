package OrientacaoAObjetosLista3;
/* 4) Crie uma classe funcionário e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto funcionário, defina as
instancias deste objeto e apresente as informações deste objeto no
console.*/

public class Funcionario {
	
	//CARACTERISTICAS --> ATRIBUTOS
	
	private String nome;
	private String cpf;
	private int idade;
	private double salario;
	private boolean modelotrabalho;
	
	//METODO CONSTRUTOR
	public Funcionario(String n, int i)
	{
		this.nome=n;
		this.idade=i;
	}

	//COMPORTAMENTOS -> METODOS
	
	public void informacoes()
	{
		System.out.println("nome: "+this.nome);
		System.out.println("CPF: "+this.cpf);
		System.out.println("Idade: "+this.idade);
		System.out.println("Salário: R$ "+this.salario);
	}
	
	//METODOS ACESSORES -> GETS E MODIFICADORES -> SETS
	
	public String getNome() {
		
		return nome;
	}
	public void setNome (String nome) {
		
		this.nome = nome;
	}


	public void setCpf(String cpf) {
		
		this.cpf = cpf;
	}
	
	public void setIdade(int idade) {
		
		this.idade = idade;
	}
	public double getSalario() {
		return salario;
		
	}

    public void setSalario(double salario){
    	
    	this.salario = salario;
    }
   
    public boolean getModelotrabalho() {
    	
    	return this.modelotrabalho = modelotrabalho;
    }
    public void setModelotrabalho(boolean modelotrabalho) {
    	
    	this.modelotrabalho= modelotrabalho;
    }

		

}
