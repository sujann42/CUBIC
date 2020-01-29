package LambdaExpressions;

import java.util.function.BinaryOperator;

class ChillRunner{
    public static int sum(int num1, int num2){
        return num1+num2;
    }
}

public class methodReferenceForStaticMethod {
    public static void main(String[] args) {
//        BinaryOperator<Integer> integerBinaryOperator= new BinaryOperator<Integer>() {
//            @Override
//            public Integer apply(Integer integer, Integer integer2) {
//                return integer+integer2;
//            }
//        };
        // in generics we cannot use the primitive type
       // BinaryOperator<Integer> binaryOperator= (Integer t, Integer s)-> ChillRunner.sum(t,s);
        BinaryOperator<Integer> binaryOperator= ChillRunner::sum;
        int result= binaryOperator.apply(10, 20);
        System.out.println(result);

        zee(ChillRunner::sum);

    }

    public static void zee(BinaryOperator<Integer> binaryOperator){
        System.out.println(binaryOperator.apply(10,20));
    }
}
