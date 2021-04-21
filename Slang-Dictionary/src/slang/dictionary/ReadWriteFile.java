/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slang.dictionary;

import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.RowFilter.Entry;

/**
 *
 * @author Admin
 */
public class ReadWriteFile {
    public void WriteData(TreeMap<String, String[]> treeMap){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try{
            fileWriter = new FileWriter("data.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<String, String[]> entry : treeMap.entrySet()){
                bufferedWriter.write(entry.getKey() + "`" + entry.getValue() + "\n");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try {        
                if (bufferedWriter != null){
                    bufferedWriter.close();
                }  
                if (fileWriter != null){
                    fileWriter.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }     
    }
    
    public TreeMap<String, String[]> InitDataFromFile(){
       FileReader fileReader = null;
       BufferedReader bufferedReader = null;
       TreeMap<String, String[]> mapData = new TreeMap<String, String[]>();
       try{
           fileReader = new FileReader("data.txt");
           bufferedReader = new BufferedReader(fileReader);
           String line;
           boolean isFirstLine = true;
           while ((line = bufferedReader.readLine()) != null){
               if (isFirstLine){
                   isFirstLine = false;
                   continue;
               }
               if (line.equals("")){
                   break;
               }
               String [] data = line.split("`");
               if (data.length == 1){
                   continue;
               }
               String [] value = data[1].split("\\|");
               mapData.put(data[0], value);
           }
       }
       catch(Exception e){
           e.printStackTrace();
       }
       finally{
           try {        
               if (bufferedReader != null){
                   bufferedReader.close();
               }  
               if (fileReader != null){
                   fileReader.close();
               }
           } catch (Exception e) {
               e.printStackTrace();
           }
       }
       return mapData;
    }
}
