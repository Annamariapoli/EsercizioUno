package it.polito.tdp.ModelUno;

import java.util.LinkedList;
import java.util.List;

public class Model {
	
	//private String parola;

	private List<String> parole = new LinkedList<String>(); 
	
	public boolean parolaPresente(String parolaNuova){                 //ok  
		if(parole.contains(parolaNuova)){
			System.out.println(true);
			return true;
			}
		else
			System.out.println(false);
		return false;
	}
	
	public boolean parolaLegata(String parolaNuova){                 //ok
		String primeLettere = parolaNuova.substring(0,2);           //ok
		//System.out.println(primeLettere);
		String ultimaParola = parole.get(parole.size()-1);        //ok                   //ultima parola inserita
		System.out.println(ultimaParola);
		String ultimeLettere = ultimaParola.substring(ultimaParola.length()-2,ultimaParola.length()); //ok
	//	System.out.println(ultimeLettere);
		if(primeLettere.equals(ultimeLettere)){
			System.out.println(true);
			return true;
			}
		else
			System.out.println(false);
		return false;
	}
	
	
	//forse c'è errore:
	
	public boolean parolaAccettata(String parolaNuova){      //se è legata alla precedente e se non è gia presente
		boolean legata = parolaLegata(parolaNuova);
		//System.out.println(legata);
		boolean presente = parolaPresente(parolaNuova);    //dice se è presente o no
		//System.out.println(presente);
		if(legata == true  && presente == false ){
			System.out.println(true);
			return true;
		}
		else
	System.out.println(false);
		return false;
	}
	
	public void aggiungiParola(String parolaNuova){    //se la parola è accettata la aggiunge
		 if(parolaAccettata(parolaNuova))             //solo se è true
		parole.add(parolaNuova);	
	}
	
	public void stampa(){                  //se volessi stamparle una per riga? (non ho classe parola)
		System.out.println(parole);
	}
	
	public static void main(String [] args){
		Model m = new Model();
	
		String s1 = "home";   //attenzione agli spazi
		String s2 = "love";
		String s3 = "feed";
		String s4 = "light";
		String s5 = "good";
		//String s7 = "me";
		
		
	    m.aggiungiParola(s1);
		m.aggiungiParola(s2);
		m.aggiungiParola(s3);
		m.aggiungiParola(s4);
		m.aggiungiParola(s5);
		
		
		m.stampa();
		//m.parolaPresente(s7);
	//	m.parolaLegata(s3);
	   //m.parolaPresente(s2);
	  //m.parolaLegata(s2);
		m.parolaLegata(s4);
		//m.parolaAccettata(s3);
		
		//String risu = "";    //stringa vuota 
	}
}
