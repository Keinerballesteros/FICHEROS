

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
       String [] splited = new String[4];
       String [][] arraySplited = new String [4][3];
       
       readFile.ficheroWriter(file, true);
       int i=0;
       for(String line: data){
           splited = line.split(";");
           arraySplited[i][0]= splited[0];
           arraySplited[i][1]= splited[0];
           arraySplited[i][2]= splited[0];
           System.out.println("Hola " +splited[0]+ " " + splited[1] +" " +splited[2]);
       }
    }
}
