package csigaverseny;

import java.util.Random;

public class Jatek {
    
private static Random rnd = new Random();
private static final int GYORSITO=5;

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
        
        for (int i = 1; i < 6; i++) {
            switch(Jatek.rnd.nextInt(Jatek.GYORSITO)){
                case 0:
                    cs1.gyorsitotKap(true);
                    System.out.println(i+". menetben a Csiga1 kap gyorsitot");
                    break;
                case 1:
                    cs2.gyorsitotKap(true);
                    System.out.println(i+". menetben a Csiga2 kap gyorsitot");
                    break;
                case 2:
                    cs3.gyorsitotKap(true);
                    System.out.println(i+". menetben a Csiga3 kap gyorsitot");
                    break;
                case 3,4:
                    System.out.println(i+". menetben semelyik csiga se kap gyorsitot");
                    break;
            }
               
            
        }
    }
    
}
