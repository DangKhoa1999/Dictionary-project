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
import java.util.TreeMap;

/**
 *
 * @author Admin
 */
public class SlangWord {
    TreeMap<String, String[]> treeData;
    
    public SlangWord(){
        ReadWriteFile handler = new ReadWriteFile();
        treeData = handler.InitDataFromFile();
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
}
