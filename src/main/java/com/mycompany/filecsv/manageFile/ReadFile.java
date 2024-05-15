
package com.mycompany.filecsv.manageFile;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;


public class ReadFile {
    private File file;
    private FileReader fileReader;
    private BufferedReader bufferedReader;

    public ReadFile(File file) throws IOException {
        this.file = file;
        this.fileReader = new FileReader(file);
        this.bufferedReader = new BufferedReader(fileReader);
    }
    
    public List<String> loadData(){
        String line;
        List<String> data = new ArrayList<>();
        try{
            while((line = bufferedReader.readLine()) != null){
                data.add(line);
            }
        }catch(IOException e){
            
        } finally{
            try{
                if(fileReader != null){
                    fileReader.close();
                }
            }catch(IOException e2){
                System.out.println("No se encuentra el archivo");
            }
        }
        return data;
    }

    public void ficheroWriter(File file, boolean value) throws IOException {
        String array[] = {"Keiner","Ballesteros","192197", "918213082"};
        FileWriter writer = new FileWriter(file,value);
        PrintWriter pw = new PrintWriter(writer);
        for(String arr : array){
            pw.print(arr+";");
        }
        pw.close();
        System.out.println("Ya escribio");
    }
    
}