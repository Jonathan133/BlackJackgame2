import java.util.Arrays;

public class BlackjackMain {
	public static void main (String[] args) {
		String kaartnamen []  = {"2","3","4","5","6","7","8","9","10","Boer","Vrouw","Heer","Aas"};
		int Kaartwaarden []= {2,3,4,5,6,7,8,9,10,10,10,10,11};
		char kaarttypen [] = {'S','R','H','K'};
		
		Deck deck = new Deck () ;
		
		for ( char kaarttype : kaarttypen ) {
			for ( String kaartnaam : kaartnamen ) {
				Arrays.asList(kaartnamen).indexOf(kaartnaam);
				
				deck.kaartenDeck.add(new Kaart(kaarttype, kaartnaam));
			}
		} //end loop
		
		System.out.println(deck.kaartenDeck.size());
		
	for(int i = 0; i < 52; i++) {
		System.out.print(deck.kaartenDeck.get(i).kaarttype);
		System.out.print (" ");
		System.out.println(deck.kaartenDeck.get(i).kaartnaam);
	}

	}

}


/*public class Main {
    public static void main (String[] args) {
    Player[] players = {
            new Player(2000, "Michel",3,3),
            new Player(2000, "Ruud",30,30),
            new Player(2000, "Youri",33,33),
            new Player(2000, "Jonathan",300,300),
            new Player(12580,"Bank",330,330),
            new Player (0,"De Pot",333,333)
    };
    for (Player speler: players) {
        speler.setPlayers(players);
        speler.setVisible(true);*/
