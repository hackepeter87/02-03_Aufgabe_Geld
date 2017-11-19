public class Geldbeutel {
    private Geldstueck[] geldBeutel = new Geldstueck[1];


    public void einzahlen(Geldstueck g) {
        int addr = -1;
        for (int i = 0; i < geldBeutel.length; i++) {
            if (geldBeutel[i] == null) {
                addr = i;
            }
        }
        if (addr == -1) {
            geldbeutelErweitern();
            addr = geldBeutel.length -1;
        }
        geldBeutel[addr] = g;

    }

    private void geldbeutelErweitern() {
        Geldstueck[] neuerGeldbeutel = new Geldstueck[this.geldBeutel.length + 1];
        for (int i = 0; i < this.geldBeutel.length; i++) {
            neuerGeldbeutel[i]= this.geldBeutel[i];
        }
        geldBeutel = neuerGeldbeutel;

    }
    public String toString() {
        return String.format("%5.2f € sind im Geldbeutel", this.getGeldBeutel() / 100f);
    }

//    public int getGeldBeutel() {
//        int geldBeutelWert=0;
//        for (int i = 0; i < geldBeutel.length; i++) {
//            if (geldBeutel[i] != null) {
//                geldBeutelWert +=  Geldstueck g;
//            }
//        }
//
//        return geldBeutelWert;
//    }

    public int getGeldBeutel(){
        int geldBeutelWert =0;
        for (Geldstueck g : this.geldBeutel) {
            if (g != null) {
                geldBeutelWert += g.getCentWert();
            }
        }
        return geldBeutelWert;
    }
}

