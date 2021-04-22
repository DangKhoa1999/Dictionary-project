/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slang.dictionary;

import com.sun.org.apache.xml.internal.security.Init;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 *
 * @author Admin
 */
public class SlangWord {
    TreeMap<String, String[]> treeData;
    
    public void InitData(){
        ReadWriteFile handler = new ReadWriteFile();
        treeData = handler.InitDataFromFile();
    }
}
