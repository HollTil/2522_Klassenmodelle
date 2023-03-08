//Objekt + Attribute
public class Schrank {
    private String schrankart;
    private int türen;
    private int schubladen;

//Konstrukor
    public Schrank(String schrankart, int türen, int schubladen) {
        this.schrankart = schrankart;
        this.türen = türen;
        this.schubladen = schubladen;
    }
//Getter
    public String getSchrankart(){
        return schrankart;
    }

    public int getTüren() {
        return türen;
    }

    public int getSchubladen() {
        return schubladen;
    }
//Setter
    public void setTüren(int türen) {
        if (türen >= 0 && türen <= 6)
            this.türen = türen;
    }

    public void setSchubladen(int schubladen) { // <- Setter!
        if (schubladen >= 0 && schubladen <= 10)
            this.schubladen = schubladen;
    }
//Methoden
    public void türAuf(){
        if(türen==0){
            System.out.println("Der "+schrankart+ " hat keine Türen.");
        }
        else if (türen<2) {
            System.out.println("Die Tür vom " +schrankart+ " wurde geöffnet.");
        }
        else{
        System.out.println("Die " +türen+ " Türen vom " +schrankart+ " wurden geöffnet.");
        }
    }
    public void türZu(){
        if(türen==0) {
            System.out.println("Der "+ schrankart + " hat keine Türen.");
        }
        else if (türen<2) {
            System.out.println("Die Tür vom " +schrankart+ " wurde geschlossen.");
        }
        else {
        System.out.println("Die " +türen+ " Türen vom " +schrankart+ " wurden geschlossen.");
        }
    }
    public void schubladenAuf(){

        if(schubladen==0) {
            System.out.println("Der "+ schrankart + " hat keine Türen.");
        }
        else if (schubladen<2) {
            System.out.println("Die Schublade vom " +schrankart+ " wurde geöffnet.");
        }
        else {
            System.out.println("Die " +schubladen+ " Schubladen vom " +schrankart+ " wurden geöffnet.");
        }
    }
    public void schubladenZu(){
        if(schubladen==0) {
            System.out.println("Der " + schrankart + " hat keine Türen.");
        }
        else if (schubladen<2) {
            System.out.println("Die Schublade vom " +schrankart+ " wurde geschlossen.");
        }
        else{
            System.out.println("Die " +schubladen+ " Schubladen vom " +schrankart+ " wurden geschlossen.");
        }
    }
}
