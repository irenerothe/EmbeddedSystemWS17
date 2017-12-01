package menschaergeredichnicht;

public class Figur {

    private int Nummer;

    private int Position;
    
    private int AnzahlPositionen;  //Anzahl der Felder auf Spielfeld, bei 4 Spielern=40 Felder

    public boolean Beweglichkeit;
    
    public Figur(int nummer, int startPosition, int anzahlPositionen)
    {
        Nummer = nummer;
        Position = startPosition;
        AnzahlPositionen = anzahlPositionen;
    }

    public void PositionSetzen(int wuerfelZahl) {
        if (Beweglichkeit)
        {
            Position = Position + wuerfelZahl;
            
            if (Position > AnzahlPositionen)
            { 
                Position = Position - AnzahlPositionen; //AnzahlPositionen wäre besser in der Klasse Spielfeld
            }
        }
        else
        {
            System.out.println("Die Figur "+ Nummer +"kann nicht um" + wuerfelZahl+" bewegt werden");
        }
    }

    public int PositionLesen() {
        return Position;
    }

  
}
