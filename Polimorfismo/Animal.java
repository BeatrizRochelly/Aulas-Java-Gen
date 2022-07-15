package Polimorfismo;

public abstract class Animal {
	
	private String TipoAnimal;
	
	public Animal(String tipoanimal) 
	{
		this.TipoAnimal= tipoanimal;
	}	
	
	abstract public void Nome (String nomeanimal);
	abstract public void Idade (int idadeanimal);
	abstract public void Som (String somanimal);
	
	public String getipoAnimal() 
	{
		return TipoAnimal;
	}
	public void setTipoAnimal(String tipoAnimal)
	{
		TipoAnimal = tipoAnimal;
	}

	
}