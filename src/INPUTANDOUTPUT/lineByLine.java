package INPUTANDOUTPUT;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class lineByLine {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\sangi\\OneDrive\\Desktop\\CUBIC CLASS\\Recordings\\myFile.txt");
        if (file.exists()) {

            try (FileInputStream fileInputStream = new FileInputStream(file); BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream))
                {
                    byte[] buffer=new byte[1024];
                    int bytesRead=0;
                    while((bytesRead=bufferedInputStream.read(buffer))!=-1){
                        System.out.println(new String(buffer, 0, bytesRead));
                        System.out.println("i am reading the file wiat. ");
                        Thread.sleep(2000);
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
