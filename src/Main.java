
public class Main {

	public static void main(String[] args) {
		
			Port p1 = new Port(2,3,4);
			Port p2 = new Port(10,23,2);
			Port p3 = new Port(-55,43,1);
			
			Bateau b1 = new Bateau(p1);
			Bateau b3 = new Bateau(p1);
			Bateau b2 = new Bateau(p3);
			
			
			b1.quitter();
			b1.accoster(p2);
			
			
			
			System.out.println(b1.distance());
			
		//	System.out.println("le bateau est àa la quai num :p " +b2.numQuai);
		//	p1.retirerBateau(b1);
			
			
			
			
		p1.afficherQuai();
	//	p2.afficherQuai();
	//	p3.afficherQuai();
			
			
		
		
			
			

				
	}
}
