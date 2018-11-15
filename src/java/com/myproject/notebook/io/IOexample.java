package com.myproject.notebook.io;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.nio.*;
import java.nio.file.Paths;
import java.nio.file.Path;

class IOexample{

/* 
  I/O = input/output
  API io in Java serves for working with input and ouput Streams which could be as BYET-oriented as well
  as Character oriented. It is prefferbale to work with txt files using character oriented streams. 
  io is devided into four main Abstract classes:
  
  Object--|                         |-FileInput(Output)Stream(Stream (work with files, put/extract)
          |  (byte-oriented)        |-ByteArrayInput(Output)Stream
          |--Input(Output)Stream ---|-PipedInput(output)Stream 
          |                         |-ObjectInput(Output)Stream
          |                         |-FilterInput(Output)Stream---|-DataInputStream
          |                                                       |-BufferedInputStream
          |  (character-oriented)                                 |-PushBackInputStream/PrintStream
          |--Writer(Reader)---------|-
         
  

  * PushBackStreams - allow to look at the date and put that back to the stream
  * PrintStream - instead of PushBack stream OutputStream has PrintStream
  * BufferedStreams - allow to increase a performance of code since it is not always putting the data 
    into the stream but when it is collected at some amount and then make it flush(); 
  * PipeStreams - create a pipe for data exchange. 
  * 

   IOException - the most common type of exception upon working with the Streams. 
   
  |***************************************|
  |      the main methods in streams      |
  |***************************************|
   ((((((((((((((((((((((((((Output Stream))))))))))))))))))))))))))))))))))))))))))))))))))
   * public void write(byte[] arrayBytes)  It is used to write ary.length bytes from 
                                          the byte array to the file output stream.
   * void write(byte[] ary, int off, int len)  It is used to write len bytes from the 
                                            byte array starting at offset off to the file output stream.
   * void close() - it is used to close the stream
   * int available() - returns a number of the unread bytes in the Stream; 

   (((((((((((((((((((((((((((((Input Stram)))))))))))))))))))))))))))))))))))))))))))))))))
   * int available() 	It returns an estimate number of bytes that can be read 
                        from the input stream without blocking by the next invocation 
                        method for the input stream.
   * int read()         It read the next byte of data from the input stream.
   * int read(byte[] b, int off, int ln) 	It read the bytes from the specified byte-input 
                                  stream into a specified byte array, starting with the given offset.
   * void close() 	It closes the input stream and releases any of the system resources 
                        associated with the stream.
   * void reset() 	It repositions the stream at a position the mark method was last called 
                        on this input stream.
   * void mark(int readlimit) 	It sees the general contract of the mark method for the input stream.
   * long skip(long x) 	It skips over and discards x bytes of data from the input stream.
   * boolean markSupported() 	It tests for the input stream to support the mark and reset methods.

   (((((((((((((((((((BufferedInputStream))))))))))))))))))))))))))))))))))
   * int available() 	It returns an estimate number of bytes that can be read from the 
                        input stream   without blocking by the next invocation method for 
                         the input stream.
   * int read() 	It read the next byte of data from the input stream.
   * int read(byte[] b, int off, int ln) 	It read the bytes from the specified byte-input
                                                stream into a specified byte array, starting with 
                                                the given offset.
   * void close() 	It closes the input stream and releases any of the system resources 
                        associated with the stream.
   * void reset() 	It repositions the stream at a position the mark method was last called 
                        on this input stream.
   * void mark(int readlimit) 	It sees the general contract of the mark method for the input stream.
   * long skip(long x) 	It skips over and discards x bytes of data from the input stream.
   * boolean markSupported() 	It tests for the input stream to support the mark and reset methods.


*/

  public static void main(String[] args){
     
     String filename = "a.txt";

    //because of IOException 
    try{ 
        //There are several ways to get a current directory path taken from SOF
        //https://stackoverflow.com/questions/4871051/getting-the-current-working-directory-in-java 
         String current = new java.io.File( "." ).getCanonicalPath();
         System.out.println("Current dir using java.io:"+current);
         String currentDir = System.getProperty("user.dir");
         System.out.println("Current dir using System:" +currentDir);
     
        //The same using java.nio
         Path currentRelativePath = Paths.get("");
         String ss = currentRelativePath.toAbsolutePath().toString();
         System.out.println("Current relative path is: " + ss);


     
     
         //FileOutputStream has overloaded constructors
         //FileOutputStream(String fullPath);
         //FileOutputStream(File file);
         //FileOutputStream(Dir dir, File file);
          OutputStream fout = new FileOutputStream(current+"/"+filename);
        

         //it is a byte-type value 
         fout.write(65);
         String stmp = "Just ab example how to translate String to byte array\n";
         byte[] byteArray = stmp.getBytes();
         System.out.println(byteArray);
         fout.write(byteArray);
         
         
         InputStream fin = new FileInputStream(current+"/"+filename); 
         System.out.println(fin.available());
         int i = fin.read();  //reading one byte in INTEGER format
         System.out.println(i); // printing it in the same format
         System.out.println((char)i); //converting it to char
         i = 0;
         List<Integer> inByteArray = new ArrayList<Integer>();
         //This cycle allows to read up to the end of file
         // -1 is the flag of the file end.
         while((i=fin.read())!=-1){
            inByteArray.add(i);
            System.out.print(fin.available()+" ");
         }
         System.out.println();
         System.out.println(inByteArray);
         
         for(int j : inByteArray){ 
            System.out.print((char)j); 
         }
         
         System.out.println();



                  
 
/*     Java BufferedOutputStream class is used for buffering an output stream. It internally uses 
       buffer to store data. It adds more efficiency than to write data directly into a stream. 
       So, it makes the performance fast.

       For adding the buffer in an OutputStream, use the BufferedOutputStream class. Let's see 
       the syntax for adding the buffer in an OutputStream:

*/
     //That could be done as 
     //BufferedOutputStream bufOut = new BufferedOutputStream(new FileOutputStream("
     // ...D://pathToDir//filename.txt"));
        BufferedOutputStream bufOut = new BufferedOutputStream(fout);
        String newStr = "It is the second Line in our File! \n";
        bufOut.write(newStr.getBytes());
        byte[] strDirectlyTOBytes = "And this is the Third line in the file...\n".getBytes();
        //This method flush all the bytes from Buffer into the stream
        bufOut.write(strDirectlyTOBytes);
        bufOut.flush();
      
      // There are two constructirs. On has a buffer size specified in bytes:
      //
      // BufferedInputStream(InputStream IS) 	It creates the BufferedInputStream and saves
      //                                      it argument, the input stream IS, for later use.
      // BufferedInputStream(InputStream IS, int size) 	It creates the BufferedInputStream 
      //                                                with a specified buffer size and saves 
      //                                                it argument, the input stream IS, for later use.
      //* int read(byte[] b, int off, int ln) It read the bytes from the specified byte-input 
      //                                     stream into a specified byte array, starting with 
      //                                     the given offset.    
        BufferedInputStream bufIn = new BufferedInputStream(fin);
        int k;
        inByteArray.clear();
        System.out.println(bufIn.available());
        
        
        while((k = bufIn.read())!=-1){
            inByteArray.add(k);
            System.out.print(bufIn.available()+" ");
        } 
        System.out.println();
         
      //reproducing only two last String because the cursor was not changet in 
      //input stream after the first time of use. 
        System.out.println("Byte presentation");
        for(int m : inByteArray){
            System.out.print(m+" ");
        }
        System.out.println();
        
        System.out.println("Char converted presentation");
        for(int m : inByteArray){
            System.out.print((char)m);
        }       


/*    
      ByteArrayOutputStream() 	Creates a new byte array output stream with the initial 
      capacity of 32 bytes, though its size increases if necessary.
      ByteArrayOutputStream(int size)

      It is used to put data into several files 
*/ 
      ByteArrayOutputStream baout = new ByteArrayOutputStream();
      System.out.println("ByteArrayOutputStream, size:"+baout.size());
      for(int l : inByteArray){
          baout.write(l);
      }
      System.out.println("ByteArrayOutputStream, size:"+baout.size());
      
      //Adding the data into two files b.txt and c.txt with one ByteArrayOutputStream
      OutputStream f1 = new FileOutputStream(current+"/b.txt");
      OutputStream f2 = new FileOutputStream(current+"/c.txt");
      baout.writeTo(f1);
      baout.writeTo(f2);
      f1.close();
      f2.close();
      baout.close();



        //it is required to close all the opened streams
           bufOut.close();
           bufIn.close();
           fout.close();
           fin.close();

        }catch (IOException e){
           e.printStackTrace();
        }finally{

        }
  
  
  
  }



}
