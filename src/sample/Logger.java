package sample;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.time.LocalDate;
import java.time.LocalTime;

public class Logger {

public static void setLog(String waehrung){

         try{

        FileWriter fileWriter;                                                                                      //Pfad füd die Datei erstellt
        File logFile = new File("src/sample/logFile.txt");

        if(logFile.exists()){                                                                                       //überprüft ob filer erstellt wurde oder nicht je nach dem wird es erstellt

            fileWriter = new FileWriter(logFile,true);

        }else{

            fileWriter = new FileWriter(logFile, Charset.forName("UTF-8"));

        }

        fileWriter.write("<"+ LocalDate.now().toString()+"||"+ LocalTime.now().toString()+">"+"  "+ waehrung + " wurde aufgerufen " + "\n");   //logeintrag
        fileWriter.close();

    }catch(IOException e){

        System.out.println("Ein Fehler ist beim hinzufügen des Logeintrags aufgetreten!");

    }

    }

}
