//Attribute/Merkmale/Beschreibungsvariablen eines Hauses
//eventuell noch m�glich: class House implements SachenBeschreibung{
class House{
       //diese Variablen sind global f�r die Klasse
       //sie m�ssen in den hier definierten Klassen nicht extra
       //�bergeben werden, sie sind allgemein bekannt
       //private: von au�en kann niemand auf die Variablen zugreifen
       private int breite, laenge, zimmeranzahl;
       private String name = new String();
       //Konstruktor
       House(){
           wasfuereinHausbinich();
       }
       //an diese Methode kommt von au�en niemand ran
       //auf sie kann nur innerhalb der Klasse zugegriffen werden
       private void wasfuereinHausbinich(){
              System.out.println("Bitte geben Sie ein, wie Ihr Haus heisst:");
              name=IOUtils.readString();
       }
       void input(){
          System.out.println("Bitte geben Sie folgende Daten von "+name+" ein:");
          System.out.print("Anzahl der Zimmer:");
          zimmeranzahl=IOUtils.readInt();
          System.out.print("L�nge des Grunst�cks:");
          laenge=IOUtils.readInt();
          System.out.print("Breite des Grunst�cks:");
          breite=IOUtils.readInt();
       }
       int grundstuecksgroessenberechnung(){
          int groesse;
          groesse= laenge*breite;
          return groesse;
       }
       void output(){
             System.out.println("Das "+name+"-Haus hat "+zimmeranzahl+" Zimmer und ist "+grundstuecksgroessenberechnung()+" qm gross.");
       }
}