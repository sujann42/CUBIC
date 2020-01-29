package INPUTANDOUTPUT;

import java.io.File;
import java.io.FileInputStream;

public class fileDemo {
    public static void main(String[] args) {

        //file is used to read meta data of the file.
        File file= new File("C:\\Users\\sangi\\OneDrive\\Desktop\\CUBIC CLASS\\Recordings\\myFile.txt");
        if (file.exists()){
            //file input stream is used to read the file.
            try(FileInputStream  fileInputStream= new FileInputStream(file);
){
                 int ch= 0;
                 while ((ch=fileInputStream.read())!=-1){
                     System.out.print((char) ch);
                     Thread.sleep(200);
                 }
                System.out.print((char) ch);

            }catch (Exception e) {
                e.printStackTrace();
            }
//            }finally {
//                try{
//                    fileInputStream.close();
//                }catch (IOException e){
//                    e.printStackTrace();
//                }
//            }
        }else{
            System.out.println("I am sorry file does not exist.");
        }
    }
}
