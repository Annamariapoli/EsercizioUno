package it.polito.tdp.model;

import java.util.LinkedList;
import java.util.List;

public class Parola {
	
	private String parola ;
	
	private List<String> parole = new LinkedList<String>();    //parole inserite da utente
	
	
	
	/*public void aggiungiParola(String parola){    //pero cosi aggiunge anche le parole che non sono legate
		if(!parole.contains(parola)){            //se non la contiene la aggiunge
			parole.add(parola);
		}
		
	}  */
	
	//per essere aggiunta la parola nuova non deve essere gia contenuta e deve essere legata alla precendente
	
	
	public void parolaAccettata(String parolaNuova){
		for(String p : parole){
			if(parole.contains(parolaNuova)){              //se la contiene gia non la aggiunge
				return;
			}
			else {   //se non la contiene
				
		    	String ultima = parola.getLast();        //prendo l'ultimo elemento della lista e la memorizzo in una variabile
		        String ultimeDue= ultima.substring(ultima.length()-2,ultima.length()+1);   //prendo le ultime due lettere e le memorizzo in una variabile
		                                
	            String primeDue  =	parolaNuova.substring(0,2);     //estraggo le prime due lettere  dalla parola nuova
	            if(ultimeDue==primeDue){                           //le parole sono legate, so la accetto e la aggiungo alla lista
	        	parole.add(parolaNuova);
	              }
	       }
		
	}

}}

