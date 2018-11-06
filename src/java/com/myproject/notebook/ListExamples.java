package com.myproject.notebook;
import java.util.*;


class ListExamples{


public static void getExamples(){

  /*
    The Java List interface, java.util.List, represents an ordered sequence of objects. 
    The elements contained in a Java List can be inserted, accessed, iterated and 
    removed according to the order in which they appear internally in the Java List. 
    The ordering of the elements is why this data structure is called a List.

    Each element in a Java List has an index. The first element in the List has index 0, 
    the second element has index 1 etc. The index means "how many elements away from the
    beginning of the list". The first element is thus 0 elements away from the beginning of 
    the list - because it is at the beginning of the list.

    You can add any Java object to a List. If the List is not typed, using Java Generics,
    then you can even mix objects of different types (classes) in the same List. Mixing objects 
    of different types in the same List is not often done in practice, however.
    
    Since List is an interface you need to instantiate a concrete implementation of the 
    interface in order to use  it. You can choose between the following List 
    implementations in the Java Collections API:

    java.util.ArrayList
    java.util.LinkedList
    java.util.Vector
    java.util.Stack
   
   ________________________________________SOME USEFULL FUNCTIONS___________________________________________
   * add(E e) Appends the specified element to the end of this list (optional operation).
   * add(int index, E element) Inserts the specified element at 
                              the specified position in this list (optional operation).
   * addAll(Collection<? extends E> c) Appends all of the elements in the specified collection 
                                      to the end of this list, in the order that they are returned 
                                      by the specified collection's iterator (optional operation).
   * addAll(int index, Collection<? extends E> c)  Inserts all of the elements in the specified 
                                                  collection into this list at the specified position 
                                                  (optional operation).
   * clear()  Removes all of the elements from this list (optional operation).
   * contains(Object o) Returns true if this list contains the specified element.
   * containsAll(Collection<?> c) Returns true if this list contains all of the elements 
                                 of the specified collection.
   * get(int index)  Returns the element at the specified position in this list.
   * indexOf(Object o)  Returns the index of the first occurrence of the specified element in this 
                        list, or -1 if this list does not contain the element.
   * isEmpty() Returns true if this list contains no elements.
   * iterator() Returns an iterator over the elements in this list in proper sequence.
   * lastIndexOf(Object o)  Returns the index of the last occurrence of the specified 
                            element in this list, or -1 if this list does not contain the element.
   * remove(int index)   Removes the element at the specified position in this list (optional operation).
   * remove(Object o)  Removes the first occurrence of the specified element from this list, 
                       if it is present (optional operation).
   * removeAll(Collection<?> c)  Removes from this list all of its elements that are contained 
                                 in the specified collection (optional operation).
   * 
   

    <<<<<<<<****************!!!!!!!Author!!!!!!!!!*************>>>>>>>>>>>>>>
    This Class is going to provide some functionality for 
    working with list interface implementations. A number of implemented functions are used 
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

     //ArrayList
     timeInit = System.currentTimeMillis();
     for(j=0; j < 100000; j++){
        get = arrayList.get(j);
     }   
     timeFin = System.currentTimeMillis();
     dt = timeFin - timeInit;
     System.out.println("ArrayList: "+dt);
     
     //linked list
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

     //ArrayList
     timeInit = System.currentTimeMillis();
     for(i=0; i < 100000; i++){
        arrayList.remove(i);
     } 
     timeFin = System.currentTimeMillis();
     dt = timeFin - timeInit;
     System.out.println("ArrayList: "+dt);

     //LinkedKist   
     timeInit = System.currentTimeMillis();
     for(i=0; i < 100000; i++){
        linkedList.remove(i);
     }
     timeFin = System.currentTimeMillis();
     dt = timeFin - timeInit;
     System.out.println("LinkedList: "+dt);


     
     } 

}

