package cn.zy.java.exer1;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello, world!");
    }
}


/**
 * @program: ${PROJECT_NAME}
 *
 * @description: ${description}
 *
 * @author: Mr.Yan
 *
 * @create: ${YEAR}-${MONTH}-${DAY} ${HOUR}:${MINUTE}
 **/



**
        * description: $description$
        $params$
        * @return  $returns$
        * @author: Mr.Yan
        * @date: $date$
        **/





        groovyScript("def result=''; def params=\"${_1}\".replaceAll('[\\\\[|\\\\]|\\\\s]', '').split(',').toList(); for(i = 0; i < params.size(); i++) {result+=' * @param  ' + params[i] + ((i < params.size() - 1) ? '\\n' : '')}; return result", methodParameters())