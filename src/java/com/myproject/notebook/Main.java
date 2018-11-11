/*  this program is going to present the Java core 
functionality during the learning */

package com.myproject.notebook;
import java.util.*;

class Main
{

  public static void main(String[] args)
  {
     int i; 
     System.out.println("Set...");
     //SetExample.setUse();
     System.out.println("***************************************************");  
     System.out.println("List...");   
     //ListExamples.getExamples();
     System.out.println("***************************************************");  
     System.out.println("Map...");   
     //MapExamples.useMap();  
     System.out.println("***************************************************");  
     System.out.println("Threads...");   
     //Threads.useMultyThread();
     
     
/*     for(i=0; i <20; i++){
         System.out.println("Hello from Main Thread "+i+" times");
          try{
          Thread.sleep(300);
          }catch (InterruptedException e){
             System.out.println("Interrupted...");
          }
    } */ 
     System.out.println("***************************************************");  
     System.out.println("Vectro vs ArrayList...");       
     SynchronizedThings.exampleUse();

  }


}
