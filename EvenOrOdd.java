/*
Creates a java file meant to test if your number for a specific range is even or odd. outputted files run out of memory on my software after 10

Written by github user Tokwo 1/23/24
*/

import java.io.FileWriter;
import java.io.IOException;

public class EvenOrOdd {
   public static void main(String[] args) {
      //timer start
      double startTime = System.nanoTime();
      
      try{
         FileWriter myWriter = new FileWriter("IWishThereWasAnEasierWayToDoThis.java");
         
         //write header and public class stuff
         myWriter.write("import java.util.Scanner;\n\npublic class IWishThereWasAnEasierWayToDoThis{\n\tpublic static void main(String[] args){\n\t\tScanner scan = new Scanner(System.in);");
         
         //writing prompt
         myWriter.write("\n\n\t\tSystem.out.print(\"Please enter num: \");\n\t\tint num = scan.nextInt();");
         myWriter.write("\n\n\t\tdouble startTime = System.nanoTime();");
         
         //writing initial if statement
         myWriter.write("\n\n\t\tif(num == 0){System.out.print(num + \" is even!\");}");
         
         //the loop to write the if statements
         for(int i = 1; i < Math.pow(2, 10); i++){
            if(i % 2 == 0){
               myWriter.write("\n\t\telse if(num == " + i + "){System.out.print(num + \" is even!\");}");
            }else{
               myWriter.write("\n\t\telse if(num == " + i + "){System.out.print(num + \" is odd!\");}");
            }
         }
         
         //writing timer code
         myWriter.write("\n\n\t\tdouble endTime = System.nanoTime();\n\t\tdouble elapsedTime = endTime - startTime;\n\t\tSystem.out.printf(\"\\nElapsed time: %.2E nsecs\", (double) elapsedTime);");
         
         //finish writing
         myWriter.write("\n\t}\n}");
         
         myWriter.close();
         System.out.println("Successfully wrote to the file.");
      }
      catch (IOException e) {
         System.out.println("An error occurred.");
         e.printStackTrace();
      }
      
      //timer end
      double endTime = System.nanoTime();
      double elapsedTime = endTime - startTime;
      
      System.out.printf("Elapsed time: %.2E nsecs", (double) elapsedTime);
   }
}