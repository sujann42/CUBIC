package LambdaExpressions;


interface Eater<T>{
    public void eat(T t);
}

public class lambdaDemoStart {
    public static void main(String[] args) {
         Eater<String> eater = t->t.contains("Tv");
    }
}
