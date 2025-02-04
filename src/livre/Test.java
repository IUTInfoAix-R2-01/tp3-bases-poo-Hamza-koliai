package livre;

public class Test {
	
	public static void main(String[] args)
	{
	livre liv = new livre ();
	System.out.println(liv.getNom());
	System.out.println(liv.getPrix());
	System.out.println(liv.getQuantité());
	liv.setNom("#ici c'est bonjours");
	System.out.println(liv.toString());
	
	}
}
