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
   String tmpStr1, tmpStr2;

   //Working with map
   Map<String,String> hashMap = new HashMap<String,String>();
   Map<String,String> hashtable = new Hashtable<String,String>();
   //Map<Integer,String> enumMap = new EnumMap<Integer,String>(); // I do not know how it works
   Map<String,String> identityMap = new IdentityHashMap<String,String>();
   Map<String,String> linkedMap = new LinkedHashMap<String,String>();
   Map properties = new Properties();
   Map<String,String> treeMap = new TreeMap<String,String>();
   Map<String,String> weakMap = new WeakHashMap<String,String>();

//////POPULATING DIFFERENT MAPS //////////////////////////////////////

  ///putting elements to the HASH MAP
     timeInit = System.currentTimeMillis();
     for(i=0; i < 1000000; i++){
        hashMap.put("key_"+i, "element_"+i);
     }
     timeFin = System.currentTimeMillis();
     dt = timeFin - timeInit;
     System.out.println("Put to HashMap: "+dt);

     //putting elements to the TREE MAP
     timeInit = System.currentTimeMillis();
     for(i=0; i < 1000000; i++){
       treeMap.put("key_"+i, "element_"+i);
     }
     timeFin = System.currentTimeMillis();
     dt = timeFin - timeInit;
     System.out.println("Put to TreeMap: "+dt);

     //putting elements to the HASH TABLE MAP
     timeInit = System.currentTimeMillis();
     for(i=0; i < 1000000; i++){
       hashtable.put("key_"+i, "element_"+i);
     }
     timeFin = System.currentTimeMillis();
     dt = timeFin - timeInit;
     System.out.println("Put to Hashtable: "+dt);

     //putting elements to the LINKED HASH MAP
     timeInit = System.currentTimeMillis();
     for(i=0; i < 1000000; i++){
       linkedMap.put("key_"+i, "element_"+i);
     }
     timeFin = System.currentTimeMillis();
     dt = timeFin - timeInit;
     System.out.println("Put to LinkedHashMap: "+dt);
     
  ///*** Accesing elements of MAPs ****////////////////////////////////////
     
     //iterations using for-each ENTRY
     timeInit = System.currentTimeMillis();
     for(Map.Entry entry : hashMap.entrySet()){
         tmpStr1 = (String)entry.getKey();
         tmpStr2 = (String)entry.getValue();
     }
     timeFin = System.currentTimeMillis();
     dt = timeFin - timeInit;
     System.out.println("Iterations with ENTRY and FOR-EACH HashMap: "+dt);

     //iterations using for-each VALUES
     timeInit = System.currentTimeMillis();
     for(Object value : hashMap.values()){
         tmpStr2 = (String)value;
     }
     timeFin = System.currentTimeMillis();
     dt = timeFin - timeInit;
     System.out.println("Iterations with VALUES and FOR-EACH HashMap: "+dt);

     //iterations using for-each KEYS
     timeInit = System.currentTimeMillis();
     for(Object key : hashMap.keySet()){
         tmpStr1 = (String)key;
         tmpStr2 = (String)hashMap.get(key);
     }
     timeFin = System.currentTimeMillis();
     dt = timeFin - timeInit;
     System.out.println("Iterations with KEYS and FOR-EACH HashMap: "+dt);

     ////       ITERATIONS USING ITERATOR()      ///
     
     //iterations using ITERATOR ENTRY
     timeInit = System.currentTimeMillis();
     Iterator iterator = hashMap.entrySet().iterator();
     while(iterator.hasNext()){
         Map.Entry entry = (Map.Entry)iterator.next();
         tmpStr1 = (String)entry.getKey();
         tmpStr2 = (String)entry.getValue();
     }
     timeFin = System.currentTimeMillis();
     dt = timeFin - timeInit;
     System.out.println("Iterations with ENTRY and ITERATOR HashMap: "+dt);

     //iterations using ITERATOR VALUES
     timeInit = System.currentTimeMillis();
     Iterator iterator1 = hashMap.values().iterator();
     while(iterator1.hasNext()){
         tmpStr2 = (String)iterator1.next();
     }
     timeFin = System.currentTimeMillis();
     dt = timeFin - timeInit;
     System.out.println("Iterations with VALUES and ITERATOR HashMap: "+dt);

     //iterations using ITERATOR KEYS
     timeInit = System.currentTimeMillis();
     Iterator iterator2 = hashMap.keySet().iterator();
     while(iterator2.hasNext()){
         String key = (String)iterator2.next();
         tmpStr2 = hashMap.get(key);
     }
     timeFin = System.currentTimeMillis();
     dt = timeFin - timeInit;
     System.out.println("Iterations with KEYS and ITERATOR HashMap: "+dt);


  }

}
