package csigaverseny;

import java.util.Random;

class Csiga {
    private static final int MAX = 4;
    private static Random rnd = new Random();
    private static final String RESET = "\033[0m";
    
    private int szam;
    private int gyorsito=1;
    
    public void lep(){
        szam = Csiga.rnd.nextInt(Csiga.MAX);
    }
    
    public void gyorsitotKap(boolean mazli){
        if(mazli==true){
            gyorsito=2;
        }
    }
    
    public int getLep(){
        return szam*gyorsito;
    }
    
    public void kirajzol(String szin,String versenyzo,Integer mennyit,Integer tav){
        System.out.print(szin+versenyzo+"+"+mennyit+":"+tav+" "+RESET);
        for (int i = 0; i < tav; i++) {
            System.out.print(szin+"_"+RESET);
        }
        System.out.println(szin +".o/"+ RESET);
    }
    
}
