package LambdaExpressions;

interface  Genesis<T>{
    public int count(T t);
}

public class lambdaDemo3 {

    public static void main(String[] args) {
        //Genesis<String> genesis=t->t.length();
        //the parameter name can be written as anything
        eat(s -> s.length(),"sunil" );

        // there are many functional interface that is provided by java 8 and we are going to use them.

    }

    public static void eat(Genesis<String> gen, String t){
        System.out.println( gen.count(t));

    }
}
