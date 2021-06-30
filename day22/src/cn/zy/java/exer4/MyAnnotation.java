package cn.zy.java.exer4;

import java.lang.annotation.*;

@Repeatable(MyAnnotaions.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.TYPE})
public @interface MyAnnotation {

    String value() default "hello";
}


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.TYPE})
@interface MyAnnotaions{
    MyAnnotation[] value();
}

@MyAnnotation(value = "hi")
@MyAnnotation(value = "nihao")
class Person{

}