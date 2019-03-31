
public class App {

	public static void main(String[] args) {
		RingPuffer textSammlung = new RingPuffer(12);
		
		textSammlung.add("Erster Text");
		System.out.println("Anlegen: Erster Text");
		textSammlung.add("Zweiter Text");
		System.out.println("Anlegen: Zweiter Text");		
		textSammlung.add("Dritter Text");
		System.out.println("Anlegen: Dritter Text");	
		textSammlung.add("Vierter Text");
		System.out.println("Anlegen: Vierter Text");
		textSammlung.add("Fuenfter Text");
		System.out.println("Anlegen: Fuenfter Text");
		textSammlung.add("Sechster Text");
		System.out.println("Anlegen: Sechster Text");
		
		System.out.println("Groesse: " + textSammlung.getGroesse());
		System.out.println(textSammlung.getAeltestenText());
		System.out.println(textSammlung.getAeltestenText());
		System.out.println("Groesse: " + textSammlung.getGroesse());
		System.out.println(textSammlung.getAeltestenText());
		System.out.println(textSammlung.getAeltestenText());
		System.out.println(textSammlung.getAeltestenText());
		System.out.println(textSammlung.getAeltestenText());
		System.out.println(textSammlung.getAeltestenText());

	}

}
