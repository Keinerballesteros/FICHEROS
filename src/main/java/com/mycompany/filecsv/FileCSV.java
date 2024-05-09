

package com.mycompany.filecsv;

import com.mycompany.filecsv.manageFile.ReadFile;
import java.io.File;
import java.io.IOException;
import java.util.List;


public class FileCSV {

    public static void main(String[] args) throws IOException {
       File file = new File("./data.csv");
       ReadFile readFile = new ReadFile(file);
       List<String> data = readFile.loadData();
       
       for(String line: data){
           String [] splited = new String[4];
           splited = line.split(";");
           System.out.println("Hola " +splited[0]+ " " + splited[1] +" " +splited[2] + " "+ splited[3]);
       }
    }
}
