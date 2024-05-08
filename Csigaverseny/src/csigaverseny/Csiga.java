package csigaverseny;

import java.util.Random;

class Csiga {
    private static final int MAX = 4;
    private static Random rnd = new Random();
    private int szam;
    private int gyorsito=1;
    
    public void lep(){
        szam = Csiga.rnd.nextInt(Csiga.MAX);
    }
    
    public int getLep(){
        return szam*gyorsito;
    }
}
