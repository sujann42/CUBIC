package ExceptionHandling;

import java.util.Scanner;

public class main {
    public static void main(String[] args) throws exceptionClass {
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        if(y==0){
            exceptionClass exceptionClass= new exceptionClass("please input any other number");
            throw exceptionClass;
        }
    }


}
