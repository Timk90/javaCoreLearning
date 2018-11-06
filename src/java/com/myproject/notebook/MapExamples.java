package com.myproject.notebook;
import java.util.*;

class MapExamples{

/* 
   clear: Removes all the elements from the map.
   containsKey: Returns true if the map contains the requested key.
   containsValue: Returns true if the map contains the requested value.
   equals: Compares an Object with the map for equality.
   get: Retrieve the value of the requested key.
   keySet: Returns a Set that contains all keys of the map.
   put: Adds the requested key-value pair in the map.
   remove: Removes the requested key and its value from the map, if the key exists.
   size: Returns the number of key-value pairs currently in the map. 

   Since Map is an interface you need to instantiate a concrete implementation of the Map 
   interface in order to use it. 
   The Java Collections API contains the following Map implementations:
   DIFFERENT REALIZATIONS (CLASSES)
   java.util.HashMap
   java.util.Hashtable
   java.util.EnumMap
   java.util.IdentityHashMap
   java.util.LinkedHashMap
   java.util.Properties
   java.util.TreeMap
   java.util.WeakHashMap
*/
   
  public static void useMap(){
   int i;
   long timeInit, timeFin, dt;

   //Working with map
   Map<String,String> hashMap = new HashMap<String,String>();
   Map<String,String> hashtable = new Hashtable<String,String>();
   //Map<Integer,String> enumMap = new EnumMap<Integer,String>(); // I do not know how it works
   Map<String,String> identityMap = new IdentityHashMap<String,String>();
   Map<String,String> linkedMap = new LinkedHashMap<String,String>();
   Map properties = new Properties();
   Map<String,String> treeMap = new TreeMap<String,String>();
   Map<String,String> weakMap = new WeakHashMap<String,String>();

   //putting elements to the HASH MAP
     timeInit = System.currentTimeMillis();
     for(i=0; i < 100000; i++){
        hashMap.put("key_"+i, "element_"+i);
     }
     timeFin = System.currentTimeMillis();
     dt = timeFin - timeInit;
     System.out.println("Put to HashMap: "+dt);

     //putting elements to the TREE MAP
     timeInit = System.currentTimeMillis();
     for(i=0; i < 100000; i++){
       treeMap.put("key_"+i, "element_"+i);
     }
     timeFin = System.currentTimeMillis();
     dt = timeFin - timeInit;
     System.out.println("Put to TreeMap: "+dt);

     //putting elements to the HASH TABLE MAP
     timeInit = System.currentTimeMillis();
     for(i=0; i < 100000; i++){
       hashtable.put("key_"+i, "element_"+i);
     }
     timeFin = System.currentTimeMillis();
     dt = timeFin - timeInit;
     System.out.println("Put to Hashtable: "+dt);

     //putting elements to the LINKED HASH MAP
     timeInit = System.currentTimeMillis();
     for(i=0; i < 100000; i++){
       linkedMap.put("key_"+i, "element_"+i);
     }
     timeFin = System.currentTimeMillis();
     dt = timeFin - timeInit;
     System.out.println("Put to LinkedHashMap: "+dt);


  }

}
