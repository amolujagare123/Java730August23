package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileOperation {

    public static void main(String[] args) throws FileNotFoundException {

      //  try {
            FileInputStream fis = new FileInputStream("D:\\amol1.txt");
        /*}
        catch (Exception e)
        {
            System.out.println(" no file");
        }*/
        System.out.println("program executed");
    }
}
