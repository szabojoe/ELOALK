package csigaverseny;

import java.util.Random;

public class Jatek {
    
private static Random rnd = new Random();

    public Jatek() {
        start();
    }

    public void start() {
        
        boolean csiga1Nyert,csiga2Nyert,csiga3Nyert,fogadasNyert=false;
        int cs1Tav=0,cs2Tav=0,cs3Tav=0,nyertesTav=0;
        int lep1,lep2,lep3;
        int fogadas= Jatek.rnd.nextInt(3);
                
        Csiga cs1 = new Csiga();
        Csiga cs2 = new Csiga();
        Csiga cs3 = new Csiga();
        
        String[] csigak = new String[]{"CSIGA1","CSIGA2","CSIGA3"};
        System.out.println("Fogadok, hogy a "+csigak[fogadas]+" fog nyerni!\n");
        
    }
    
}
