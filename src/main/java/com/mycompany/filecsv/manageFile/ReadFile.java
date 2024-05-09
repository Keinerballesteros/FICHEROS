
package com.mycompany.filecsv.manageFile;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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
    
}