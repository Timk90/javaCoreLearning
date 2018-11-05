package com.myproject.notebook;
import java.util.*;


class ListExemples{


public static void getExamples(){

  /*
    This Class is going to provide some functionality for 
    working with list. A number of implemented functions are used 
    and the average time for each sort of list is determined (ArrayList, LinkedList, Stack)

  */

   ArrayList<Long> arrayList = new ArrayList<Long>();
   LinkedList<Long> linkedList = new LinkedList<Long>();
   List vectorList = new Vector();
   Stack<Long> stackList = new Stack<Long>();

   int j;
   long i, get, timeInit, timeFin, dt;  
     
     //affing elements to lists
     //ArrayList
     System.out.println("Adding time");
     timeInit = System.currentTimeMillis();
     for(j=0; j < 1000000; j++){
	i = (long)j;
        arrayList.add(i);
     }   
     timeFin = System.currentTimeMillis();
     dt = timeFin - timeInit;
     System.out.println("ArrayList: "+dt);
     
     //Linked List
     timeInit = System.currentTimeMillis();
     for(j=0; j < 1000000; j++){
	i = (long)j;
        linkedList.add(i);
     }   
     timeFin = System.currentTimeMillis();
     dt = timeFin - timeInit;
     System.out.println("LinkedList: "+dt);
  
     //Stack
     timeInit = System.currentTimeMillis();
     for(j=0; j < 1000000; j++){
	i = (long)j;
        stackList.push(i);
     }   
     timeFin = System.currentTimeMillis();
     dt = timeFin - timeInit;
     System.out.println("Stack: "+dt);

    //getting elements from lists 
     System.out.println("Getting time");
     timeInit = System.currentTimeMillis();
     for(j=0; j < 100000; j++){
        get = arrayList.get(j);
     }   
     timeFin = System.currentTimeMillis();
     dt = timeFin - timeInit;
     System.out.println("ArrayList: "+dt);
   
     timeInit = System.currentTimeMillis();
     for(j=0; j < 100000; j++){
        get = linkedList.get(j);
     }  
 
     timeFin = System.currentTimeMillis();
     dt = timeFin - timeInit;
     System.out.println("LinkedList: "+dt);

     //Stack
     timeInit = System.currentTimeMillis();
     for(j=0; j < 1000000; j++){
        stackList.pop();
     }   
     timeFin = System.currentTimeMillis();
     dt = timeFin - timeInit;
     System.out.println("Stack: "+dt);

     //removing element from lists 
     System.out.println("Removing time");
     timeInit = System.currentTimeMillis();
     for(i=0; i < 100000; i++){
        arrayList.remove(i);
     } 
  
     timeFin = System.currentTimeMillis();
     dt = timeFin - timeInit;
     System.out.println("ArrayList: "+dt);
   
     timeInit = System.currentTimeMillis();
     for(i=0; i < 100000; i++){
        linkedList.remove(i);
     }
    
     timeFin = System.currentTimeMillis();
     dt = timeFin - timeInit;
     System.out.println("LinkedList: "+dt);


   //Working with map
   Map<Integer,String> hashMap = new HashMap<Integer,String>();
   Map<Integer,String> hashMap = new HashMap<Integer,String>();
   Map<Integer,String> hashMap = new HashMap<Integer,String>();
/* clear: Removes all the elements from the map.
   containsKey: Returns true if the map contains the requested key.
   containsValue: Returns true if the map contains the requested value.
   equals: Compares an Object with the map for equality.
   get: Retrieve the value of the requested key.
   keySet: Returns a Set that contains all keys of the map.
   put: Adds the requested key-value pair in the map.
   remove: Removes the requested key and its value from the map, if the key exists.
   size: Returns the number of key-value pairs currently in the map. 
*/

   //putting elements to the MAP
   timeInit = System.currentTimeMillis();
     for(j=0; j < 100000; j++){
        hashMap.put(j, ""+j);
     }
     timeFin = System.currentTimeMillis();
     dt = timeFin - timeInit;
     System.out.println("LinkedList: "+dt);

     
     } 

}

