package com.myproject.notebook;
import java.util.*;

class SetExample{
  /* 
     Set is an interface which extends Collection. 
     It is an unordered collection of objects in which duplicate values cannot be stored.
     Basically, Set is implemented by HashSet, LinkedHashSet or (interface SortedSet) TreeSet (sorted representation).
     Set has various methods to add, remove clear, size, etc to enhance the usage of this interface
  */

  public static void setUse(){
     
     long start, stop, dt;
     int i;

  // There are three implementations of sets Hash, Tree, LinkedHash
     System.out.println("Work with HashSet:");
     Set<String> hashSet = new HashSet<String>();
     hashSet.addAll((Arrays.asList(new String[]{"1","2","3","4","5","6","7","8","9"})));
     hashSet.add("Timur");
     hashSet.add("is");
     hashSet.add("my name");
     //try to repeat one piece of content
     //it will not be repeated in the set (will not be added)
     hashSet.add("Timur");    
     //it will be added to the set   
     hashSet.add("timur");
     System.out.println("Set A");
     System.out.println(hashSet);
     Set<String> hashSet2 = new HashSet<String>();
     hashSet2.addAll(Arrays.asList(new String[]{"1","2","3","4","10","11","12","13"}));
     System.out.println("Set B");
     System.out.println(hashSet2);
     //set - множество! Intersection of two Sets is 
     Set<String> intersection = new HashSet<String>(hashSet);
     intersection.retainAll(hashSet2);
     System.out.println("Intersection of A and B");
     System.out.println(intersection);
     //the difference between two sets A - B
     Set<String> diff = new HashSet<String>();
     diff.addAll(hashSet);
     System.out.println("Difference A - B");
     diff.removeAll(hashSet2);
     System.out.println(diff);
     diff.clear();
     //the difference between two sets B - A
     diff.addAll(hashSet2);
     System.out.println("Difference B - A");
     diff.removeAll(hashSet);
     System.out.println(diff);
     //CHECK the size of set is like
     System.out.println("Size of diff "+diff.size());
     System.out.println("Size of A "+hashSet.size());
     System.out.println("Size of B "+hashSet2.size());
     //Check the emptiness of the set 
     diff.clear();
     System.out.println("Is diff empty "+diff.isEmpty());
     System.out.println("Is A empty "+hashSet.isEmpty());
     System.out.println("Is B empty "+hashSet2.isEmpty());
          
  /* 
     Starting from this point I will try to assess an average time of common functions 
     for different Sets
  */
     hashSet.clear();
     Set<String> linkedSet = new LinkedHashSet<String>();
     Set<String> treeSet = new TreeSet<String>();
     
     //adding elements to different Sets
     
     //LINKED HASH SET
     start = System.currentTimeMillis();
     for(i=0; i < 1000000; i++)
     {
       linkedSet.add(""+i);
     }    
     stop = System.currentTimeMillis();
     dt = stop - start;
     System.out.println("adding 100000 elements time to LINKED Set: "+dt);
     
     //HASH SET
     start = System.currentTimeMillis();
     for(i=0; i < 1000000; i++)
     {
       hashSet.add(""+i);
     }    
     stop = System.currentTimeMillis();
     dt = stop - start;
     System.out.println("adding 100000 elements time to HASH Set: "+dt);
     
     //TREE SET
     start = System.currentTimeMillis();
     for(i=0; i < 1000000; i++)
     {
       treeSet.add(""+i);
     }    
     stop = System.currentTimeMillis();
     dt = stop - start;
     System.out.println("adding 100000 elements time to TREE Set: "+dt);
     
  //// Check if the SET contents proper element 
     //HASH SET
     start = System.currentTimeMillis();
     for(i=0; i < 1000000; i++){
         hashSet.contains(""+i);
     }
     stop = System.currentTimeMillis();
     dt = stop - start;
     System.out.println("Search for CONTANTS HASH Set an elements: "+dt);

     //LINKED HASH SET
     start = System.currentTimeMillis();
     for(i=0; i < 1000000; i++){
         linkedSet.contains(""+i);
     }
     stop = System.currentTimeMillis();
     dt = stop - start;
     System.out.println("Search for CONTANTS LINKED HASH Set an elements: "+dt);

     //LINKED HASH SET
     start = System.currentTimeMillis();
     for(i=0; i < 1000000; i++){
         treeSet.contains(""+i);
     }
     stop = System.currentTimeMillis();
     dt = stop - start;
     System.out.println("Search for CONTANTS TREE Set an elements: "+dt);
     
     //Iterating elements over the whole Set
  //*** 1). Using iterator ****
     //Hash SET
     start = System.currentTimeMillis();
     Iterator iterator = hashSet.iterator();
     while(iterator.hasNext()){
       //System.out.print((String)iterator.next());
       iterator.next();
     } 
     stop = System.currentTimeMillis();
     dt = stop - start;
     System.out.println("Iteration (ITERATOR) over HASH Set takes: "+dt);    

     //Hash Linked SET
     start = System.currentTimeMillis();
     iterator = linkedSet.iterator();
     while(iterator.hasNext()){
       //System.out.print((String)iterator.next());
       iterator.next();
     } 
     stop = System.currentTimeMillis();
     dt = stop - start;
     System.out.println("Iteration (ITERATOR) over HASH LINKED Set takes: "+dt); 

     //Tree SET
     start = System.currentTimeMillis();
     iterator = treeSet.iterator();
     while(iterator.hasNext()){
       //System.out.print((String)iterator.next());
       iterator.next();
     } 
     stop = System.currentTimeMillis();
     dt = stop - start;
     System.out.println("Iteration (ITERATOR) over TREE Set takes: "+dt); 
     
  //*** 2). Using implemented loop ****
     //HASH SET
     start = System.currentTimeMillis();
     for(String str : hashSet){
        str = "";
     }
     stop = System.currentTimeMillis();
     dt = stop - start;
     System.out.println("Iteration over HASH Set takes: "+dt);
     
     //LINKED HASH SET
     start = System.currentTimeMillis();
     for(String str : linkedSet){
        str = "";
     }
     stop = System.currentTimeMillis();
     dt = stop - start;
     System.out.println("Iteration over LINKED HASH Set takes: "+dt);

     //TREE SET
     start = System.currentTimeMillis();
     for(String str : treeSet){
        str = "";
     }
     stop = System.currentTimeMillis();
     dt = stop - start;
     System.out.println("Iteration over TREE Set takes: "+dt);

     //removing elements from different Sets

     //HASH SET
     start = System.currentTimeMillis();
     for(i=1000000; i > 0; i--)
     {
        hashSet.remove(""+i);
     }    
     stop = System.currentTimeMillis();
     dt = stop - start;
     System.out.println("Removing elements time from HASH Set: "+dt);

     //HASH LINKED SET
     start = System.currentTimeMillis();
     for(i=1000000; i > 0; i--)
     {
        linkedSet.remove(""+i);
     }    
     stop = System.currentTimeMillis();
     dt = stop - start;
     System.out.println("Removing elements time from HASH LINKED Set: "+dt);

     //TREE SET
     start = System.currentTimeMillis();
     for(i=1000000; i > 0; i--)
     {
        treeSet.remove(""+i);
     }    
     stop = System.currentTimeMillis();
     dt = stop - start;
     System.out.println("Removing elements time from TREE Set: "+dt);
     
  }
  

}
