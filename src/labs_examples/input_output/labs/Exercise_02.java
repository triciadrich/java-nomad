package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 2: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, ead back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */

public class Exercise_02 {
    public static void main(String[] args) {
        BufferedReader reader = null;
        PrintWriter writer = null;


        try{
            reader = new BufferedReader(new FileReader("C:\\Users\\Owner\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\files\\char_data.txt"));
            writer = new PrintWriter(new FileWriter("C:\\Users\\Owner\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\labs\\ex2copy.txt"));
            int s;

            while((s = reader.read()) != -1){
                char c =(char) s;
                if ( s == 'a'){
                    c = '-';
                    writer.print(c);
                } else if (s == 'e') {
                    c = '~';
                    writer.print(c);
                }else {
                    writer.print(c);
                }
            }
        }catch (IOException exc){
            System.out.println("Error: " + exc.getMessage());
        }finally {
            try{
                reader.close();
            }catch (IOException ex){
                ex.printStackTrace();
            }
            writer.close();
        }
    }
}