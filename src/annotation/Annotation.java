package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//CUSTOM ANNOATION IS MAILY USED TO REDUCE THE DEPENDECIES,IE WE CAN DECLARE THINGS IN ANNOTATION LIKE CLASS
@Target({ElementType.METHOD,ElementType.FIELD,ElementType.TYPE})// this specifies the target at which the allotation is to be applied;
@Retention(RetentionPolicy.RUNTIME)// this will retain the annoation in runtime;

public @interface Annotation {
    String name();
    String location();



}
