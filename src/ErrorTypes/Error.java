package ErrorTypes;

import java.util.Scanner;

public class Error {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter number");
        int num1= scanner.nextInt();
        System.out.println("enter the second number");// YO PROGRAM RUN GARNA PARO HAINA MAILE YO RUN GARDA ARKO RUN HUNXA KINA
        int num2=scanner.nextInt();
        int result=0;
        try {
             result=num1/num2;
        }catch (Exception ex){
            ex.printStackTrace();
        }

        System.out.println("the result is computed");
        System.out.println("the result is "+ result);
        System.out.println("main is done");
    }
}
