package sample;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

import java.awt.*;

/********************************
 * Prast Eric
 * 19.03.2021
 * Ausgabe eines Wertes in Banknoten
 ********************************/

public class Controller {

    @FXML
    Button BTN_Start;

    @FXML
    TextField TXT_eing;

    @FXML
    TextArea TXT_ausgabe;

    @FXML
    ComboBox CBX_Waehrung;


    public void start(){

        Fiat fiat = new Fiat();
        String r_wert = fiat.getFiat(CBX_Waehrung.getValue().toString());
        TXT_ausgabe.setText(r_wert);

    }
    public void initialize() {                                                                                          //Methode für Combobox Interface


        CBX_Waehrung.getItems().removeAll(CBX_Waehrung.getItems());
        CBX_Waehrung.getItems().addAll("EURO", "USD", "Bitcoin", "Dodge");



    }

}
