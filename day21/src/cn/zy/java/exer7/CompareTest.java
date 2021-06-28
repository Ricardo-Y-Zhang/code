package cn.zy.java.exer7;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @program: code
 * @description: Java比较器
 * @author: Mr.Yan
 * @create: 2021-06-28 10:05
 **/


public class CompareTest {

    //Comparable接口：自然排序
    //1. String、包装类等实现了Comparable接口，重写了compareTo（）方法，给出了比较两个对象大小的方式
    //2. 重写compareTo(obj)规则：如果当前对象this大于形参对象obj，则返回正数；如果当前对象this小于形参对象obj，则返回负整数；如果当前对象this等于形参对象obj，则返回零。
    //3. 自定义类需要排序，可让自定义类实现Comparable接口，重写compareTo()方法，在其中定义排序规则
    @Test
    public void test1(){
        String[] arr = new String[]{"mmm", "bbb","zzz", "aaa", "eee"};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));//[aaa, bbb, eee, mmm, zzz]
    }



    //Comparable接口：自然排序
    @Test
    public void test2(){
        Goods[] arr = new Goods[4];
        arr[0] = new Goods("lenovo", 34);
        arr[1] = new Goods("dell", 56);
        arr[2] = new Goods("xiaomi", 34);
        arr[3] = new Goods("apple", 99);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[Goods{name='lenovo', price=34.0}, Goods{name='xiaomi', price=34.0}, Goods{name='dell', price=56.0}, Goods{name='apple', price=99.0}]
    }


    //Comparator接口的使用：定制排序
    // 1. 当元素的类型没有实现java.lang.Comparable接口而又不方便修改代码，或者实现了java.lang.Comparable接口的排序规则不适合当前的操作那么可以考虑使用Comparator的对象来排序，强行对多个对象进行整体排序的比较
    // 2. 重写compare(Object o1, Object o2)方法，比较o1和o2的大小：如果方法返回正整数，则表示o1大于o2；如果返回0，表示相等；返回负整数，表示o1小于o2
    @Test
    public void test3(){

        String[] arr = new String[]{"mmm", "bbb","zzz", "aaa", "eee"};

        Arrays.sort(arr, new Comparator(){

            //按照字符串从大到小的顺序排序
            @Override
            public int compare(Object o, Object t1) {
                if(o instanceof String && t1 instanceof String){
                    String s1 = (String) o;
                    String s2 = (String) t1;
                    return -s1.compareTo(s2);
                }
                throw new RuntimeException("输入的数据类型不一致");
            }
        });

        System.out.println(Arrays.toString(arr));
    }


    @Test
    public void test4(){
        Goods[] arr = new Goods[5];
        arr[0] = new Goods("lenovo", 34);
        arr[1] = new Goods("dell", 56);
        arr[2] = new Goods("xiaomi", 34);
        arr[3] = new Goods("apple", 99);
        arr[4] = new Goods("apple", 199);

        Arrays.sort(arr, new Comparator<Goods>() {
            @Override
            public int compare(Goods goods, Goods t1) {
                if(goods.getName().equals(t1.getName())){
                    if(goods.getPrice() < t1.getPrice()){
                        return 1;
                    }else if(goods.getPrice() > t1.getPrice()){
                        return -1;
                    }else{
                        return 0;
                    }
                }else{
                    return goods.getName().compareTo(t1.getName());
                }
            }
        });

        System.out.println(Arrays.toString(arr));
    }
}
