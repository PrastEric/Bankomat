package sample;

import java.io.FileReader;
import java.util.ArrayList;

public class Fiat {


    public String getFiat(String waehrung){                                                                             //Methode zum holen der Fiat werte vom txt file

        Logger.setLog(waehrung);

        FileReader reader;                                                                                              //Attribute zum aufteilen des files
        String ausgString = "";
        String waehrungPulled = "";
        String value = "";
        String type = "";

        String ergString = "";

        try {

            reader = new FileReader("src/sample/PLF02_GruppeB.txt");                                          //Anlegen vom reader

            int fChar;

            fChar = reader.read();

            while (fChar != -1) {

                ausgString += (char) fChar;
                fChar = reader.read();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        while(ausgString.length() > 0) {                                                                                //ueberprueft ob file ende

            waehrungPulled = ausgString.substring(0,ausgString.indexOf(","));
            type = ausgString.substring(ausgString.indexOf(",")+2,ausgString.indexOf(","));
            value = ausgString.substring(ausgString.indexOf(",")+2,ausgString.indexOf("\n")-1);


            if(waehrungPulled.equals(waehrung)) {

                ergString = "Waehrung:" + waehrungPulled + " Wert:" + value +" Scheintyp:" + type;                      //setzt attribute zusammen

            }

            ausgString = ausgString.substring(ausgString.indexOf("\n")+1);



        }

        System.out.println(ergString);
        return ergString;                                                                                               //gibt string der ausgabe zurueck
    }


    }


