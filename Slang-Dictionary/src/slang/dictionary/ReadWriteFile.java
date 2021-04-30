/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slang.dictionary;

import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.RowFilter.Entry;

/**
 *
 * @author Admin
 */
public class ReadWriteFile {
    public void writeData(TreeMap<String, String[]> treeMap){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try{
            fileWriter = new FileWriter("slang.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<String, String[]> entry : treeMap.entrySet()){
                bufferedWriter.write(entry.getKey() + "`");
                bufferedWriter.write(entry.getValue()[0]);
                for (int i = 1; i < entry.getValue().length; i++){
                    bufferedWriter.write("| " + entry.getValue()[i]);
                }
                bufferedWriter.write("\n");
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
    
    public TreeMap<String, String[]> initDataFromFile(){
       FileReader fileReader = null;
       BufferedReader bufferedReader = null;
       TreeMap<String, String[]> mapData = new TreeMap<String, String[]>();
       try{
           fileReader = new FileReader("slang.txt");
           bufferedReader = new BufferedReader(fileReader);
           String line;
           while ((line = bufferedReader.readLine()) != null){
               if (line.equals("")){
                   break;
               }
               String [] data = line.split("`");
               if (data.length == 1){
                   continue;
               }
               String [] value = data[1].split("\\| ");
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
    
    public List<String> initHistoryDataFromFile(){
       FileReader fileReader = null;
       BufferedReader bufferedReader = null;
       List<String> listHistory = new ArrayList<String>();
       try{
           fileReader = new FileReader("history.txt");
           bufferedReader = new BufferedReader(fileReader);
           String line;
           while ((line = bufferedReader.readLine()) != null){
               if (line.equals("")){
                   break;
               }
               listHistory.add(line);               
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
       return listHistory;
    }
    
    
    public void saveHistoryData(List<String> history){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try{
            fileWriter = new FileWriter("history.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < history.size(); i++){
                bufferedWriter.write(history.get(i) + "\n");
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
    
    public void resetData(){
        FileWriter fileWriter = null;
        try{
            fileWriter = new FileWriter("data.txt");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try {        
                if (fileWriter != null){
                    fileWriter.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }     
    }
}
