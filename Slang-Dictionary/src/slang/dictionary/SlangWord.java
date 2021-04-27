/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slang.dictionary;

import com.sun.org.apache.xml.internal.security.Init;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.TreeMap;

/**
 *
 * @author Admin
 */
public class SlangWord {
    TreeMap<String, String[]> treeData;
    List<String> listHitoryData;
    ReadWriteFile handlerFile = new ReadWriteFile();
    
    public SlangWord(){
        treeData = handlerFile.initDataFromFile();
        listHitoryData = handlerFile.initHistoryDataFromFile();
    }
    
    public String[] getDataBySlangWord(String key)
    {
        String[] listDefinition = null;
        if (treeData.containsKey(key)){
            listDefinition = treeData.get(key);
        }
        return listDefinition;
    }
    
    public List<String> getDataByDefinition(String definition)
    {
        List<String> listSlangWord = new ArrayList<String>();
        for (Entry<String, String[]> entry : treeData.entrySet()) {
            List<String> listTemp = Arrays.asList(entry.getValue());
            if (listTemp.contains(definition))
            {
                listSlangWord.add(entry.getKey());
            }
        }
        return listSlangWord;
    }
    
    public void saveHistoryData(String keyWord){
        if (listHitoryData.contains(keyWord)){
            return;
        }
        listHitoryData.add(0, keyWord);
        handlerFile.saveHistoryData(listHitoryData);
    }
    
    public List<String> initHistoryData(){
        listHitoryData = handlerFile.initHistoryDataFromFile();
        return listHitoryData;
    }
    
    public void resetData(){
        handlerFile.resetData();
    }
    
    public List<String> randomSlangWords(){
        Random rd = new Random();
        int numOfRandom = rd.nextInt(treeData.size());
        List<String> slangRandom = new ArrayList<String>(treeData.keySet());
        List<String> resultData = new ArrayList<String>();
        String key = slangRandom.get(numOfRandom);
        resultData.add(key); 
        
        String[] listTemp = treeData.get(key);
        for (int i = 0; i < listTemp.length; i++){
            resultData.add(listTemp[i]);
        }
        return resultData;
    }
    
    public boolean deleteSlangWord(String key){
        if (treeData.containsKey(key)){
            treeData.remove(key);
            saveDataToFile();
            return true;
        }
        return false;
    }
    
    public boolean updateSlangWord(String key, String newData){
        newData = newData.replace(", ", ",");
        String[] newValue = newData.split(",");
        if (treeData.containsKey(key)){
            treeData.put(key, newValue);
            saveDataToFile();
            return true;
        }
        return false;
    }
    
    public void saveDataToFile(){
        handlerFile.writeData(treeData);
    }
}
