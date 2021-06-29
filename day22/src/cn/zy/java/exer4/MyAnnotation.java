package cn.zy.java.exer4;

public @interface MyAnnotation {

    String value() default "hello";
}


@MyAnnotation(value = "hi")
class Person{

}