/*
WARNING!!!!!! please do not attempt to go past 27 if you have low storage!! MULTIPLE GIGABYTE FILE

Written by github user Tokwo 1/23/24
*/

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UselessFile {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      try{
         FileWriter myWriter = new FileWriter("Numbers.txt");
         
         //prompt
         System.out.print("What exponent? (32 or less): ");
         int num = scan.nextInt();
         
         //timer start
         double startTime = System.nanoTime();
         
         for(int i = 0; i < Math.pow(2, num); i++){
            myWriter.write(i + "\n");
         }
         
         myWriter.close();
         System.out.println("Successfully wrote to the file.");
         
         //timer end
         double endTime = System.nanoTime();
         double elapsedTime = endTime - startTime;
         System.out.printf("Elapsed time: %.2E nsecs", (double) elapsedTime);         
      }
      catch (IOException e) {
         System.out.println("An error occurred.");
         e.printStackTrace();
      }
   }
}