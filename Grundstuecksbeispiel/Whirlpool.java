//class Whirlpool extends Pool implements SachenBeschreibung{
class Whirlpool extends Pool{
     private int funktionsanzahl;
     Whirlpool(String name){
         super(name);
     }
     //�berschreiben der input-Methode aus Pool
     void input(){
          //die input-Methode der Superklasse wird aufgerufen
          super.input();
          System.out.println("Wie viele Einstellungen hat der Whirlpool:");
          funktionsanzahl=IOUtils.readInt();
     }
     //�berschreiben der output-Methode aus Pool
     void output(){
          //die input-Methode der Superklasse wird aufgerufen
          super.output();
          System.out.println("Der Whirlpool hat "+funktionsanzahl+" Einstellungen.");
     }
     //es k�nnte hier auch noch ganz neue Methoden geben, aber mir ist nichts
     //wirklich Sinnvolles eingefallen
}