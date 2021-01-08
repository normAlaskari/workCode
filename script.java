// Noor Alaskari
// March, 12 , 2020
// Script to read Jmeter excl information
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class script {
 public static void main(String args[]) throws IOException {
     readfrom reds = new readfrom();
     Scanner Files = new Scanner(System.in);
     System.out.println("Enter The file directory you wish to read the information from  \n");
     System.out.println("Enter The file 1 directory  \n");
     String file_Dr1 = Files.nextLine();
     System.out.println("Enter The file 2 directory  \n");
     String file_Dr2 = Files.nextLine();;
     System.out.println("Enter The file 3 directory  \n");
     String file_Dr3 = Files.nextLine();;


     double total =0;
     System.out.println("----------------------------------------------------------------------------");
     System.out.println("scenario =======> 1");
     total += reds.reads(file_Dr1);
     System.out.println("----------------------------------------------------------------------------");
     System.out.println("scenario =======> 2");
     total += reds.reads(file_Dr2);
     System.out.println("----------------------------------------------------------------------------");
     System.out.println("scenario =======> 3");
     total += reds.reads(file_Dr3);
     System.out.println("=========================================================================== |");
     System.out.println("                                                                            |");
     System.out.println("Total Average for all scenario's is ===> " +(total/3)/1000+ "                 |");
     System.out.println("                                                                            |");
     System.out.println("=========================================================================== |\n");


     System.out.println("=***************************************************************");
     Scanner myObj = new Scanner(System.in);  // Create a Scanner object
     System.out.println("Enter The file name you wish to store this information to\n");
     String File_name = myObj.nextLine();
     System.out.println("=********************** %Done% ***************************************");

     try {
         FileWriter writer = new FileWriter(File_name +".txt", true);
         writer.write("\n");
         writer.write("----------------------------------------------------------------------------\n");
         writer.write("scenario =======> 1\n");
         writer.write(reds.write(file_Dr1)+"\n");
         writer.write("----------------------------------------------------------------------------\n");
         writer.write("scenario =======> 2\n");
         writer.write(reds.write(file_Dr2)+"\n");
         writer.write("----------------------------------------------------------------------------\n");
         writer.write("scenario =======> 3\n");
         writer.write(reds.write(file_Dr3)+"\n");
         writer.write("=========================================================================== |\n");
         writer.write("                                                                            |\n");
         writer.write("Total Average for all scenario's is ===> " +(total/3)/1000+ "                 |\n");
         writer.write("                                                                            |\n");
         writer.write("=========================================================================== |\n");

         writer.close();
     } catch (IOException e) {
         e.printStackTrace();
     }

 }
}

