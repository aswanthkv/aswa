package onemonth;

//leap.java

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)


public @interface FirstAnnotation {

    String value(); //no parameters should be there & return type should be there
    //String name();
    //int age();

}
