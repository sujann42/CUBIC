package ErrorTypes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


        try {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
          // mathCalc(x,y);
            System.out.println(x/y);
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        } catch (
    InputMismatchException e) {
            // System.out.println(e.getClass().getName());
            e.getMessage();

            System.out.println("java.util.InputMismatchException");
        }
    }

        public static void mathCalc(int x, int y) throws Exception{
            if (y==0) {
                Exception exception = new Exception("Input mismatch exception");
                throw exception;
            }
            else{
                System.out.println(x/y);
            }
        }



}