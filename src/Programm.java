public class Programm {
    public static void main(String[] args) {

        int neuerGeldwert = 41;

        Geldstueck geld = new Geldstueck(neuerGeldwert);

        System.out.println(
               String.format("%5.2f €", 41/100f)
        );

    }
}
