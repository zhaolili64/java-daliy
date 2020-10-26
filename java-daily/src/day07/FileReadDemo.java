package day07;

import java.io.*;

/**
 * @ClassName FileReadDemo
 * @Description TODO
 * @Author 86180
 * @Date 2020/10/26
 **/
public class FileReadDemo {
    public  static  void  main(String[] args) throws IOException {

        File inputFile = new File("C:/Users/86180/Pictures/Saved Pictures/123.jpg");

        InputStream is = new FileInputStream(inputFile);

        byte[] b = new byte[(int) inputFile.length()];

        is.read(b);

        File outputFile = new File("C:/Users/86180/Pictures/Saved Pictures/1231.jpg");

        OutputStream os = new FileOutputStream(outputFile);

        os.write(b);

        is.close();

        os.close();
    }
}
