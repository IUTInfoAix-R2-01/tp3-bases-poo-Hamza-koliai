package exo_2;
public class exo2 {
	public static void main (String [] args) {
        Auteur[] authors = {
                new Auteur("Tan Ah Teck", "ahTeck@somewhere.com", 'm'),
                new Auteur("Paul Tan", "paulTan@nowhere.com", 'm')
        };

        Livre javaDummy = new Livre("Java for Dummy", authors, 19.95, 88);
        System.out.println(javaDummy);

        System.out.println("Name: " + javaDummy.getName());
        System.out.println("Price: " + javaDummy.getPrice());
        System.out.println("Quantity: " + javaDummy.getQty());

        javaDummy.setPrice(29.95);
        javaDummy.setQty(28);
        System.out.println(javaDummy);

        for (Auteur author : javaDummy.getAuthor()) {
            System.out.println(author);
        }
    }
}
