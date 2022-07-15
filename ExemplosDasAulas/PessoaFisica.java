package ExemplosDasAulas;

public class PessoaFisica extends Pessoa1Polimorfismo {
     private long cpf;

    public PessoaFisica()
    {
    	
    }
	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
     
     public String getNome()
     {
    	 return "Pessoa física: "+super.getNome()+" -CPF: " +this.getCpf();
    	 
     }
}
