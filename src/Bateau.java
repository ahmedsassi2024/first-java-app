
public class Bateau {
	public Port portDepart;
	public Port portArrivee;
	public boolean enMer;
	public int numQuai;

	public Bateau() { //////// constructeur
		enMer = true;
		System.out.println("bateau en mer: creation defaut");
	}
	
	public Bateau(Port p) { //////// constructeur aa
		if(p.ajouterBateau(this))  {
			enMer = false;
			portDepart = p;
		}
		else{
			enMer = true;
			System.out.println("le bateau est en mer : port complet");
		}
		
	}
	
	
	public void accoster(Port p) {
		if(p.ajouterBateau(this)&&enMer) {
			enMer = false;
			portArrivee = p;
		}
		else System.out.println("le bateau va rester en mer, pas de place pour accoster");
		
	}

	public void quitter() {
		if (!enMer) {
			portDepart.retirerBateau(this);
			enMer = true;
		}
		else System.out.println("le bateau est déja en mer");
	}
	
	public float distance(){
		
		if ((portDepart != portArrivee) && (portArrivee != null) && (portDepart != null)){
		float X = (portDepart.retournerX()-portArrivee.retournerX());
		float Y = (portDepart.retournerY()-portArrivee.retournerY());
		return  (float) Math.sqrt(X*X+Y*Y) ;
		}
		else return -1;
	}
}
