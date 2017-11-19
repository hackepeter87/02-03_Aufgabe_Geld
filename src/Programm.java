public class Programm {
    public static void main(String[] args) {


        Geldstueck geld = new Geldstueck(861);

        System.out.println(geld);

        System.out.println("\n\nGelszählmaschine");

        Geldzaehlmaschine gzm = new Geldzaehlmaschine();
        System.out.println(gzm);
        gzm.zaehlen(new Geldstueck(23424));
        System.out.println(gzm);
        gzm.zaehlen(new Geldstueck(6540));
        System.out.println(gzm);
        gzm.reset();
        System.out.println("Reset: " + gzm);

        System.out.println("\n\nGeldbeutel");
        Geldbeutel gb = new Geldbeutel();
        gb.einzahlen(new Geldstueck(351));
        System.out.println(gb);
        gb.einzahlen(new Geldstueck(8144));
        System.out.println(gb);


    }
}
