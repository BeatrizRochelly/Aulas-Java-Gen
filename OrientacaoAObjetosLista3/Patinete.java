package OrientacaoAObjetosLista3;
/*5) Crie uma classe patinete e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */

public class Patinete {

	//CARACTERISTICAS -> ATRIBUTOS
	
	private String cor;
	private double pesosuportado;
	private int qrodas;
	private boolean modeloeletrico;
	
	
	//METODO CONSTRUTOR 
	public Patinete(String c, double ps)
	{
		
         	this.cor=c;
			this.pesosuportado=ps;
		
	}
	
	//COMPORTAMENTOS -> METODOS
	
	public void andar()
	{
		if(this.modeloeletrico==true)
			System.out.println("Velocidade mais rápida... Não precisa utilizar os pés no chão");
		else
			System.out.println("Vai precisa usar os pés...");
	}
	
	public void eletrico()
	{
		if(this.modeloeletrico==true)
			System.out.println("Velocidade mais rápida... Não precisa utilizar os pés no chão");
		else 
			this.modeloeletrico=true;
	}
	
	public void naoeletrico()
	{
		this.modeloeletrico=false;
	}
	
	public void estado()
	{
		System.out.println("Cor:"+this.cor);
		System.out.println("Quantidades de rodas: " +this.qrodas);
		System.out.println("O modelo é elétrico? " +this.modeloeletrico);
		System.out.println("O peso suportado é: " +this.pesosuportado+"Kg");
	}
	
	//METODOS ACESSORES->GETS E MODIFICADORES->SETS
	
	public int getQuantidadesderodas() {
		return qrodas;
	}
	public void setQuantidadesderodas(int qrodas) {
		this.qrodas=qrodas;
	}
	
	public String getCor() {
		return cor;
	}
	public double getPesoSuportado() {
		return pesosuportado;
	}
	
	public boolean getModeloEletrico() {
		return modeloeletrico;
	}
	
	
	
	
	
}   


