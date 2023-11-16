package org.generation.italy;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
		String[] squadre= {"juve","milan","inter","catania","roma"};
       ArrayList<String> partite= new ArrayList<>();
       ArrayList<Integer> punteggioCasa= new ArrayList<>();
       ArrayList<Integer> punteggioFuoricasa= new ArrayList<>();
       String squadra1, squadra2, risposta;
       int punteggio1, punteggio2, i;
       
       
       do {
       System.out.println("inserisci una partita");
         System.out.println("quali squadre giocano?");
         squadra1=sc.nextLine();  //sc.nextLine in caso di stringhe
         squadra2=sc.nextLine();
        
         partite.add(squadra1+"-"+squadra2);
         
         System.out.println("inserisci il punteggio");
         punteggio1=Integer.parseInt(sc.nextLine());    //per gli int meglio mettere parseInt
         punteggio2=Integer.parseInt(sc.nextLine());
         
        punteggioCasa.add(punteggio1);
        punteggioFuoricasa.add(punteggio2);
        
         
         System.out.println("vuoi inserire un'altra partita? (si/no)");
         risposta=sc.nextLine();
         
       }while(risposta.equals("si"));
       
       System.out.println("resoconto partite:");
       
       for(i=0; i<partite.size(); i++)
       { System.out.println(partite.get(i)+"   "+punteggioCasa.get(i)+ "-"+punteggioFuoricasa.get(i));
         
        
       } sc.close();
	} 
	 
}

