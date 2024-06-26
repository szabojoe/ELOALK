package csigaverseny;

import java.util.Random;

public class Jatek {
    
private static Random rnd = new Random();
private static final int GYORSITO=5;

public static final String PIROS = "\033[0;31m"; 
public static final String ZOLD = "\033[0;32m"; 
public static final String KEK = "\033[0;34m";

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
               
            cs1.lep();
            cs2.lep();
            cs3.lep();
            
            lep1=cs1.getLep();
            lep2=cs2.getLep();
            lep3=cs3.getLep();
            
            cs1Tav=cs1Tav+lep1;
            cs2Tav=cs2Tav+lep2;
            cs3Tav=cs3Tav+lep3;
            
            cs1.kirajzol(PIROS,"CSIGA1", lep1, cs1Tav);
            cs2.kirajzol(ZOLD,"CSIGA2", lep2, cs2Tav);
            cs3.kirajzol(KEK,"CSIGA3", lep3, cs3Tav);
            System.out.println("");
            
        }
            int[] tavok = new int[]{cs1Tav,cs2Tav,cs3Tav};
            for (int elem : tavok) {
                if(elem>nyertesTav){
                    nyertesTav=elem;
                }
            }
            
            csiga1Nyert = nyertesTav == cs1Tav;
            csiga2Nyert = nyertesTav == cs2Tav;
            csiga3Nyert = nyertesTav == cs3Tav;
            
            System.out.println("EREDMENY:");
            System.out.println("csiga1 nyert:"+csiga1Nyert);
            System.out.println("csiga2 nyert:"+csiga2Nyert);
            System.out.println("csiga3 nyert:"+csiga3Nyert);
            System.out.println("");
            
            switch(fogadas){
                case 0:
                    fogadasNyert = csiga1Nyert == true;
                    break;
                case 1:
                    fogadasNyert = csiga2Nyert == true;
                    break;
                case 2:
                    fogadasNyert = csiga3Nyert == true;
                    break;
            }
            System.out.println("Fogadas nyert: " +fogadasNyert);            
    }
    
}
