package JavaFiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaFiles {
    public static void main(String[] args) {
        //Files
        /*
        * 1.How create a file
        *   In a given directory
        * 2.Write to a file
        * 3.Read data from a given
        *  file
        *
        * */
        //File java.io
        //package_name java.io
        //File class - create a file
        /*
        * 1.Create a file in java
        * Create an object of a file class
        * 1.pass constrctor - specify
        * */
        //create a file
        File myfile = new File("myfile.txt");
        try {
           boolean status= myfile.createNewFile();
           if (status){
               System.out.println("File created successfully");
           }else{
               System.out.println("File already Exist");
           }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Write into the file.
        String mytext="Lorem ipsum is placeholder text commonly used in the graphic," +
                " print, and publishing industries for previewing layouts and visual" +
                " mockups.";

        List<String> ournames = new ArrayList();
        ournames.add("New Martha");
        ournames.add("New Demba");
        ournames.add("New Nixon");
        ournames.add("New Other Name");

        for (int i=0;i<ournames.size();i++){
            WriteIntoMyFile(ournames.get(i)+"\n");
        }
        WriteIntoMyFile(mytext);

        ReadFromFile("myfile.txt");

        //Read From a given file.
        //Scanner class - read the data



    }

    private static void WriteIntoMyFile(String message){
        //Writing a FileWriter class
        //Create an object of FileWriter class
        try {
            FileWriter filewriter = new FileWriter("myfile.txt");
            filewriter.append(message);
            filewriter.close();//ensure we release
        }catch (IOException e){

        }

    }

    private static void ReadFromFile(String filename){
        try{
            File myfile = new File(filename);
            Scanner scanner = new Scanner(myfile);
            System.out.println("My File Output");
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch (IOException e){
            System.out.println("Exception "+e.getMessage());
        }
    }
}
