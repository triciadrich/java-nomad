package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Example {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream inputStream = null;
        BufferedInputStream bufferedInputStream = null;
        FileOutputStream fileOutputStream = null;


        try{
            inputStream = new FileInputStream("C:\\Users\\Owner\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\files\\char_data.txt");
            bufferedInputStream = new BufferedInputStream(inputStream);
            fileOutputStream =  new FileOutputStream("C:\\Users\\Owner\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\labs\\ex1Copy.txt");

            byte[] buffer = new byte[5];


            while((bufferedInputStream.read(buffer)) != -1){

                fileOutputStream.write(buffer);
            }
        } catch (IOException exc){
            System.out.println("Error " + exc.getMessage());
        }finally {
            try{
                inputStream.close();
                bufferedInputStream.close();
                fileOutputStream.close();
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }


    }
}