/* 	Avtor: Domen Koprivnik
	Ime datoteke: ElektricniMotor.java

*/	
// Deklariramo javni razred, ki razširja razred Motor
// in implementira vmesnik StarostMotorja.
public class ElektricniMotor extends Motor implements StarostMotorja {
	
	// Vse lastnosti nadrazreda se prenesejo;
	//definiramo nove lastnosti.
	private int napetost;
	private boolean powerSaver;
	private int starostMotorja;
	
    
	// Javni konstruktor
	// Vhodni parametri: ime, moc, napetost, sm
	// Potem/opis: ustvari nov objekt tipa Električni motor
	// Vrne vrednost: nov objekt
	
   public ElektricniMotor(String ime, int moc, int napetost, int sm) {
        
		// Pokličemo konstruktor nadrazreda - ustvarimo motor
		super(ime, moc);
		
		// Inicializiramo še ostale lastosti
        napetost = napetost;
		powerSaver = false;
		starostMotorja = sm;
    }

	// Javna metoda, ki zamenja napetost 
	// Vhodni parametri: napetost
	// Potem/opis: zamenja napetost
	// Vrne vrednost: nove napetosti
	
    public int zamenjajNapetost(int novaNapetost) throws Exception {
		
		System.out.println("Napetost pred dodajanjem " + napetost);
		
		// Če ni vključen PowerSave mode , menjam napetost
		if(turbo) {
			
			// menjam napetost
			napetost = novaNapetost;
			System.out.println("Napetost motorja " + ime + " je bila spremenjena iz " + napetost + "V na " + novaNapetost + "V");
        }
			
		else {
			// vrnemo izjemo za neuspešno menjavo napetosti
			throw new Exception("V PowerSave mode-u menjava ni mogoča");
		}
		
		// vrnemo napetost
		return napetost;
		}
		// Implementiramo metodo, ki vrne starost motorja
		// in jo predpisuje vmesnik StarostMotorja
		// Vhodni parametri: /
		// Potek/opis: vrne starost
		// Vrne vrednost: int - getStarostMotorja
		public int getStarostMotorja() {
	
		return starostMotorja;
	
		}
		// Javna getter metoda, ki vrne moč
		// Vhodni parametri: /
		// Potek/opis: vrne vrednost
		// Vrne vrednost: moč motorja
		public int getNapetostMotorja() {
		return  napetost;
	}
}

	