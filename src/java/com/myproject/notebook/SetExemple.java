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
     diff.clear();
          

     
  }
  

}
