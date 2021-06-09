package src.cn.zy.java.exer6;

import javax.swing.*;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-09 14:49
 **/
public class StudentTest {
    public static void main(String[] args) {

        try {
            Student s = new Student();

            s.regist(-1000);

            System.out.println(s);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
        }
    }
}

class Student{
    private int id;

    public void regist(int id) throws Exception{
        if(id > 0){
            this.id = id;
        }else{

            //手动抛出异常对象
            throw new Exception("您输入的数据非法！");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
