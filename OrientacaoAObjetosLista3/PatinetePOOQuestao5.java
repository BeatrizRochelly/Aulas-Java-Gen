package OrientacaoAObjetosLista3;

public class PatinetePOOQuestao5 {

	public static void main(String[] args) {
	       Patinete scooter = new Patinete(" Rosa ", 35.0);
	       Patinete voolo = new Patinete ("Azul", 50.5);
	       Patinete xiome = new Patinete (" Preto ", 100.0);
	   
	       
	       System.out.println("Patinete scotter");
	       scooter.setQuantidadesderodas(3);
	       scooter.naoeletrico();
	       scooter.estado();
	    
	       
	       System.out.println("\nPatinete voolo");
	       voolo.setQuantidadesderodas(2);
	       voolo.naoeletrico();
	       voolo.estado();
	       
	       System.out.println("\nPatinete xiome");
	       xiome.setQuantidadesderodas(2);
	       xiome.eletrico();
	       xiome.estado();
	       
	       
	       
	       

	}

}
