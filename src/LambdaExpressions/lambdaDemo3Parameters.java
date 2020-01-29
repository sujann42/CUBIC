package LambdaExpressions;

@FunctionalInterface
interface Adder{
    public int sum(int x, int y, int sum);

//    public default void run() {
//

}

public class lambdaDemo3Parameters {
    public static void main(String[] args) {
        Adder adder=(int x, int y, int sum)-> x+y+sum;
       int result= adder.sum(10,20,39);
       //if we want we can omit the type of the parameters as well since the type is already declared in the interface.


    }

}
