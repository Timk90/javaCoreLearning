package com.myproject.notebook;
import java.util.*;

class SetExemple{
  /* 
     Set is an interface which extends Collection. 
     It is an unordered collection of objects in which duplicate values cannot be stored.
     Basically, Set is implemented by HashSet, LinkedHashSet or TreeSet (sorted representation).
     Set has various methods to add, remove clear, size, etc to enhance the usage of this interface
  */

  public static void setUse(){
     // There are three implementations of sets Hash, Tree, Linked
     System.out.println("Work with HashSet:");
     Set<String> hashSet = new HashSet<String>();
     hashSet.addAll((Arrays.asList(new String[]{"1","2","3","4","5","6","7","8","9"})));
     hashSet.add("Timur");
     hashSet.add("is");
     hashSet.add("my name");
     //try to repeat
     hashSet.add("Timur");       
     hashSet.add("timur");
     System.out.println(hashSet);
     Set<String> hashSet2 = new HashSet<String>();
     hashSet2.addAll(Arrays.asList(new String[]{"1","2","3","4"}));
     System.out.println(hashSet2);
     //set - множество! Intersection of two Sets is 
     Set<String> intersection = new HashSet<String>();
     intersection.retainAll(hashSet2);
     System.out.println(intersection);
     
     
  }
  

}
