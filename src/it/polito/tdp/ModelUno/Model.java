package it.polito.tdp.ModelUno;


import java.util.LinkedList;
import java.util.List;

public class Model {
	
	//private String parola;

	private List<String> parole = new LinkedList<String>(); 
	
	public boolean parolaPresente(String parolaNuova){                 //ok  
		if(parole.contains(parolaNuova)){
			//System.out.println(true);
			return true;
			}
		else
			//System.out.println(false);
		return false;
	}
	
	public boolean parolaLegata(String parolaNuova){
		String primeLettere = parolaNuova.substring(0,2);           //ok
		//System.out.println(primeLettere);
		String ultimaParola = parole.get(parole.size()-1);        //ok                   //ultima parola inserita
		//System.out.println(ultimaParola);
		String ultimeLettere = ultimaParola.substring(ultimaParola.length(), ultimaParola.length()-2); //SBAGLIATO
		//System.out.println(ultimeLettere);
		if(primeLettere.equals(ultimeLettere)){
			System.out.println(true);
			return true;
			}
		else
			System.out.println(false);
		return false;
	}
	
	public boolean parolaAccettata(String parolaNuova){      //se è legata alla precedente e se non è gia presente
		boolean legata = parolaLegata(parolaNuova);         //mi dice se è lagata o no
		boolean presente = parolaPresente(parolaNuova);    //dice se è presente o no
		if(legata == true  && presente == false ){
			return true;
			
		}
		
		return false;
	}
	
	public void aggiungiParola(String parolaNuova){    //se la parola è accettata la aggiunge
	   parole.add(parolaNuova);	
	}
	
	public void stampa(){                  //se volessi stamparle una per riga? (non ho classe parola)
		System.out.println(parole);
	}
	
	public static void main(String [] args){
		Model m = new Model();
	
		String s1 = "home";
		String s2 = "live";
		String s3 = "house";
		String s4 = "root";
		String s5 = "light";
		String s6 = "fix";
		m.aggiungiParola(s1);
		m.aggiungiParola(s2);
		m.aggiungiParola(s3);
		m.aggiungiParola(s4);
		m.aggiungiParola(s5);
		m.aggiungiParola(s6);
		
		m.stampa();
		//m.parolaPresente(s4);
	   //m.parolaPresente(s2);
	  //m.parolaLegata(s2);
		m.parolaLegata(s4);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

