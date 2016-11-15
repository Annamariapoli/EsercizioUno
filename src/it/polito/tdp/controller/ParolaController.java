package it.polito.tdp.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class ParolaController{          
	
	private it.polito.tdp.ModelUno.Model model;
	
	public void setModel(it.polito.tdp.ModelUno.Model model){
		this.model=model;
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
    	if(s.length()==0){                      //se è vuota il programma non fa nulla
    		return;
    	}
    	
    
    	boolean accettata=model.parolaAccettata(s);            //chiamo il metodo xhe aggiunge la parola se va bene
 
    	if(accettata==true){
    		model.aggiungiParola(s);
    	}
    	
    	
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
