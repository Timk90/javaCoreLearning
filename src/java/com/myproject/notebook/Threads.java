package com.myproject.notebook;
import java.util.*;

class Threads implements Runnable{

/* 
  this class is going to provide an idea of parallelization of some function (it is going 
  to be preformed in different threads - parallel fulfilling). 
  
  There are two ways to program that 
  1). Extend Thread in Java
  2). Implement Ruannable 
  because the main method id run(). 
  
  
*/ 

  int number;
  Thread t1, t2;
  
  public Threads(int number){
     this.number  = number ;
  }

  public Threads(int number, Thread t1, Thread t2){
     this.t1 = t1;
     this.t2 = t2;
     this.number  = number ;
  }

   public static void useMultyThread(){
      Threads myThread1 = new Threads(1);
      Threads myThread2 = new Threads(2);

      Thread thr1 = new Thread(myThread1);
      Thread thr2 = new Thread(myThread2);
      Threads myThread3 = new Threads(3, thr1, thr2);
      Thread thr3 = new Thread(myThread3); 
      thr1.start();  
      thr2.start();    
      thr3.start();    

   }
   
   @Override
   public void run(){
   int i;
     if(number <= 2){
       for(i=0; i < 20; i++){
          System.out.println("Hello from the "+ number+" thread "+i+" time");
          try{
          Thread.sleep(200);
          }catch (InterruptedException e){
             System.out.println("Interrupted thread "+number+" ...");
             return;
          }
       }
     }else{
        try{      
           Thread.sleep(1200);
           t1.interrupt();
           Thread.sleep(1200);
           t2.interrupt();
           
           
        }catch (InterruptedException e){
           System.out.println("Interrupted Thread "+number);
        }
     }
   }
} 
