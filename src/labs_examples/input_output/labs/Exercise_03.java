package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 3: variety
 *
 *    1) Demonstrate the usage of at least two additional Byte Streams-
 *    2) Demonstrate the usage of at least two additional Character Streams
 *    3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams
 *    4) Demonstrate the use of the DataInputStream and DataOutputStream
 *
 */

public class Exercise_03 {
    public static void main(String[] args) {
//
        charStream1();
    }

    public static void byteStream1() {
        //try with resources
        try (FileInputStream fi = new FileInputStream("C:\\Users\\Owner\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\files\\byte_data")) {
            int c;
            while ((c = fi.read()) != -1) {
                System.out.print((char)c);
            }

        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }


    }

    public static void byteStreamWithBuffer(){

        try(FileInputStream fi = new FileInputStream("C:\\Users\\Owner\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\files\\byte_data");
            FileOutputStream fileout = new FileOutputStream("C:\\Users\\Owner\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\labs\\bytecopy.txt");
            BufferedOutputStream bo = new BufferedOutputStream(fileout)){
            int c;
            while( (c =fi.read()) != -1){
                bo.write(c);
            }

        }catch (IOException exc){
            System.out.println(exc.getMessage());
        }
    }

    public static void charStream1(){
        FileReader reader = null;

        try{
            reader = new FileReader("C:\\Users\\Owner\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\files\\char_data.txt");
            int s;
            while((s = reader.read()) != -1){
                System.out.print((char)s);

            }

        }catch (IOException exc){
            System.out.println(exc.getMessage());
        }
    }

    public static void charStreamWithBuffer(){
        FileReader reader = null;


    }

}
