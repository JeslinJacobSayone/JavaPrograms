/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author sayone
 */
public class Mapdemo {
    
    public static void main(String[] args) {
        
        Map<String,String> map = new HashMap();
        map.put("name", "navin");
        map.put("actor", "john");
        map.put("ceo", "marina");
        
        System.out.println("simple printing of map : \n \n\n"+map+"\n\n");
        
        Set<String> keyset = map.keySet();
        
        for(String key: keyset)
        {
            System.out.println("these are values : "+map.get(key));
        }
        
        
    }
}
