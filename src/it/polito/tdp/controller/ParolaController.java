package it.polito.tdp.controller;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.model.Parola;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class ParolaController{          
	
	private Parola model;
	
	
	
	public void setModel(Parola model){
		this.model = model;
	}

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParole;      //era meglio chiamarlo  parola (una sola)

    @FXML
    private Button btnInserisci;

    @FXML
    private CheckBox checkParolaAccettata;

    @FXML
    private CheckBox checkParolaNonLegata;

    @FXML
    private CheckBox checkParolaGiaInserita;

    @FXML
    private TextField txtResultTot;

    @FXML
    void doInserisci(ActionEvent event) {
    	String s = txtParole.getText();          //prendo la parola inserita dall'utente
    	
    	
    	
    	
    	if(s.length()==0){                     //se è vuota il programma non fa nulla
    		return;
    	}
    
    	int totale=0;                         //devo tenere il conto di parole inserite dall'utente
    	
    	
    	//controlle ke sia una parola (ne mette una per volta)
    	
    	for (int i = 0; i < s.length(); i++) {          
              if (Character.isSpaceChar(s.charAt(i))) {  
            	  
              }
              else {              //se non è una parola non fa niente
            	     return;
              }
       }
    	
    	
    	model.parolaAccettata(s);            //chiamo il metodo xhe aggiunge la parola se va bene
    	totale++;                           //totale deve essere uguale alla lunghezza della lista
    	txtResultTot.appendText("Le parole inserite sono " + totale + "." );
    	
    	
    	//PS: NON SO COME FUNZIONINO LE CHECK 
   
    	
    }

    @FXML
    void initialize() {
        assert txtParole != null : "fx:id=\"txtParole\" was not injected: check your FXML file 'Parola.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Parola.fxml'.";
        assert checkParolaAccettata != null : "fx:id=\"checkParolaAccettata\" was not injected: check your FXML file 'Parola.fxml'.";
        assert checkParolaNonLegata != null : "fx:id=\"checkParolaNonLegata\" was not injected: check your FXML file 'Parola.fxml'.";
        assert checkParolaGiaInserita != null : "fx:id=\"checkParolaGiaInserita\" was not injected: check your FXML file 'Parola.fxml'.";
        assert txtResultTot != null : "fx:id=\"txtResultTot\" was not injected: check your FXML file 'Parola.fxml'.";

    }
}
