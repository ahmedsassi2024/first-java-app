import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Port {
	
	public float x,y;
	
	private int nbQuais,quaisOcc;
	Map<Integer, String> quai = new HashMap<Integer, String>();
	
	public Port(float x1,float y1){				////////constructeur
		this.x = x1;
		this.y = y1;
		for (int i = 1; i < 3 + 1; i++) {
			quai.put(i, "libre");
		}
		nbQuais = 3;
		quaisOcc = 0;
		System.out.println("creation d un port de 3 quai par defaut ");
	}
	
	public Port(float x1,float y1,int nbQuais){	////////constructeur
		this.x = x1;
		this.y = y1;
		if (nbQuais > 0) {
			for (int i = 1; i < nbQuais + 1; i++) {
				quai.put(i, "libre");
			}
			System.out.println("creation de " + nbQuais + " quais");
			this.nbQuais = nbQuais;
			quaisOcc = 0;
		} else {
			for (int i = 1; i < 3 + 1; i++) {
				quai.put(i, "libre");
			}
			this.nbQuais = 3;
			quaisOcc = 0;
			System.out.println("saisie negatif => creation de 3 quai par defaut ");
		}
	}
	
	public boolean ajouterBateau(Bateau b) {
		for (Entry<Integer, String> element : quai.entrySet())// element.getKey()
																// --
																// element.getValue()
		{
			if (element.getValue() == "libre") {
				quai.put(element.getKey(), "occupe");
				System.out.println("bateau ajoute a la position "+element.getKey());
				b.numQuai = element.getKey();
				quaisOcc++;
				return true;
			}

		}
		return false;
	}
	
	
	public void retirerBateau(Bateau b) {
		quai.put(b.numQuai, "libre");
		quaisOcc--;
		System.out.println("le bateau a libere sa place n "+b.numQuai);
	}
	
	public void afficherQuai() {//affiche la situation des quais du port
		System.out.println("nombre de quai occupe "+ quaisOcc);
		System.out.println("nombre de quai libre "+ (nbQuais-quaisOcc));
		for (Entry<Integer, String> element : quai.entrySet())
			System.out.println("la position num " + element.getKey() + " est " + element.getValue());
	}
	
	public float retournerX(){
		return this.x;
	}
	public float retournerY(){
		return this.y;
	}
	
}
