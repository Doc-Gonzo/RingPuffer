
public class RingPuffer {
	
	// Array deklarieren
	String[] alleTexte;
	int  groesse = 0; // aktuelle Groesse, nicht max Groesse!
	int  start   = 0; // aeltestes Element

	
	// RingPuffer mit gewuenschter Groesse erstellen
	public RingPuffer(int maxGroesse) {
		alleTexte = new String[maxGroesse];  
	}
	
	// Letzte befuellte Position geben
	private int getLetzte() {		
		int dummy = start + groesse - 1;
		// -1 wegen alleTexte.length
		return dummy % alleTexte.length;
	}
	
	// Letzte Freie Position checken
	private int getFreiePosition() {
		return (getLetzte() + 1) % alleTexte.length; 
	}
	
	// Text am Ende des Puffers speichern
	public void add(String text) {
		// Checke ob Puffer voll
		if(groesse >= alleTexte.length) {	
			System.out.println("Puffer ist voll");
		}
		// in-Pointer setzen
		int inPointer  = getFreiePosition();	
		// letzte Freie Position Befuellen
		alleTexte[inPointer] = text;	
		// Groesse erhoehen
		groesse = groesse + 1; 
	}
	 
	public int getGroesse() {
		return groesse;   
	}

	public String getAeltestenText() {
		if(groesse == 0 ) { 
			System.out.println("Puffer ist leer");
				}
		// Verringere Groesse, da Text ausgegeben
		groesse --;
		// aeltesten Text holen
		String ausgabe = alleTexte[start];
		// Index fuer aeltesten Text erhoehen:
		start = (start + 1) % alleTexte.length;
		// ausgabe
		return ausgabe;

		}
}
