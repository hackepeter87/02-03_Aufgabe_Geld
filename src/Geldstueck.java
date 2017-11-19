public class Geldstueck {
    private int centWert =0;

    public Geldstueck(int centWert) {
        this.centWert = centWert;

    }

    public int getCentWert() {
        return centWert;
    }

    public void setCentWert(int centWert) {
        this.centWert = centWert;

    }

    public String toString() {
        return String.format("%5.2f €", this.centWert /100f);
    }
}
