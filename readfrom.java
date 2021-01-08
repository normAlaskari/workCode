import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class readfrom {
    public static double reads(String filename) throws FileNotFoundException {
        double Toavg = 0;
        int count = 0;
        double error_total =0;
        File file = new File(filename);
        try {
            Scanner inputfile = new Scanner(file);
            inputfile.nextLine();
            while (inputfile.hasNext()) {
                String data = inputfile.nextLine();
                data.replace(" ", "");
                String[] values = data.split(",");
                double avrg = Double.parseDouble(values[2]);
                double error_r = Double.parseDouble(values[9].substring(0,5));
                error_total += error_r;
                Toavg += avrg;
                count++;
                System.out.println("Run-time Average for line " + count + " ----->  " + values[2] +
                        " ||| Error rate is ----->  " + values[9]);
            }
            inputfile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(" ***** Total Average ***** ==> " + (Toavg / count)+ "\n"+
                " ***** Total Error rate for the script ***** ==>  "+ error_total);
        return (Toavg / count);
    }

    public static String write(String filename) throws FileNotFoundException {
        double Toavg = 0;
        int count = 0;
        double error_total =0;
        File file = new File(filename);
        try {
            Scanner input_file = new Scanner(file);
            input_file.nextLine();
            while (input_file.hasNext()) {
                String data = input_file.nextLine();
                data.replace(" ", "");
                String[] values = data.split(",");
                double avrg = Double.parseDouble(values[2]);
                double error_r = Double.parseDouble(values[9].substring(0,5));
                error_total += error_r;
                Toavg += avrg;
                count++;
            }
            input_file.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return " ***** Total Average ***** ==> " + (Toavg / count) + "\n"+
                " ***** Total Error rate for the script ***** ==>  "+ error_total;
    }

}
