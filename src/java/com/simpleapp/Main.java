package com.simpleapp;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, world!");
        Map<String, String> map = new LinkedHashMap<>();

        for(int i=1; i<100; i++){
            map.put("key_"+i, "value_"+i);
        }

        for (Map.Entry entry : map.entrySet()){
            System.out.println(entry.getValue()+" "+entry.getKey());
        }

    }

    public static long getLong(){
        return 500;
    }

}
