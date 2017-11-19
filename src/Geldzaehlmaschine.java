public class Geldzaehlmaschine {
    private int anzahlGelstuecke;
    private int gesamtGeldWert;

    public void zaehlen(Geldstueck g) {
        this.gesamtGeldWert = this.gesamtGeldWert + g.getCentWert();
        anzahlGelstuecke++;
    }

    public String toString() {
        return String.format("%5.2f € in %d Geldstücken", this.gesamtGeldWert / 100f, this.anzahlGelstuecke);


    }

    public void reset(){
        this.gesamtGeldWert = 0;
        this.anzahlGelstuecke = 0;
    }
}
