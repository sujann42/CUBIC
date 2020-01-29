package ANNOTATIONS;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

public @interface Kill {
    String name();
    // we can use the default value
    //String name() default "sunil";
    int time();



    }


