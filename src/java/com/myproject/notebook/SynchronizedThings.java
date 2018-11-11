package com.myproject.notebook;
import java.util.*;

// !---------------------------------------------------------!
// !      Multithreading Example for ArrayList and Vector    !
// !---------------------------------------------------------! 

/* 
   The program is using two realization of List interface, 
   100 threads are trying to change 1000 values in ArrayList and in Vector. 
   Depending on which List we use the problem appear or disappear. 
   The use of ArrayList blicked the application while Vector is working perfectly 
   Probably the problem is related to the unexcpected Object behaviour upon simultaneous success 
   from different threads. 
   
   To change the functionality from one to another realizations just comment/uncomment the 
   lines 44/45 and 89/90
*/

class SynchronizedThings implements Runnable{

     static int count = 0;
     int number;
     boolean exit = false;


     static List<Integer> arrayList = new ArrayList<Integer>();    
     static List<Integer> vectorList = new Vector<Integer>(); 

     static void init(){
        int i;
        for(i=0; i<1000; i++){
            arrayList.add(0);
            vectorList.add(0);
        }

     }
     
     public SynchronizedThings(){
          count++;
          number = count;
     }


     public static void exampleUse(){
        int k;
        init();
        //System.out.println(vectorList);
        System.out.println(arrayList);
        Thread thr;
        Set<Thread> setThr = new HashSet<Thread>();
        Set<SynchronizedThings> setSync = new HashSet<SynchronizedThings>();
        k = 0;
        while(k<100){
            SynchronizedThings run = new SynchronizedThings();
            setSync.add(run);
            thr = new Thread(run);
            thr.start();
            setThr.add(thr);
            k++;
        }
        
        try{
           Thread.currentThread().sleep(1500);
  //           for(Thread th: setThr){
  //               th.interrupt();
  //          }  
             for(SynchronizedThings run: setSync){
                 run.exit = true;
             }  

        }catch (InterruptedException e){
           System.out.println("Interrupted....");
        }

        try{
           Thread.currentThread().sleep(2000);
//******************* Comment/Uncomment corresponding List realization ****************************//
           System.out.println(arrayList);
           //System.out.println(vectorList); 
        }catch (InterruptedException e){
           System.out.println("Interrupted....");
        }

     }

        @Override
        public void run(){
               
            int k; 
            try{   
               while(!this.exit){   
                 for(k = 0; k < 1000; k++){
//******************* Comment/Uncomment corresponding List realization *****************************//
                  arrayList.set(k, this.number);
                  //vectorList.set(k, this.number);
                  }
                  if(this.exit)
                  return;
               }
             }catch (Exception e){
                 this.exit = true;
                 return;
             }
               
    
        }


}
