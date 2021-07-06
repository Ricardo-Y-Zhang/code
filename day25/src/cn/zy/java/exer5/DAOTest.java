package cn.zy.java.exer5;

import org.junit.Test;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-07-06 16:02
 **/
public class DAOTest {
    @Test
    public void test1(){
        DAO<User> dao = new DAO<>();

        dao.save("1", new User(0, 18, "zed"));
        dao.save("2", new User(1, 18, "jojo"));

        System.out.println(dao.get("1"));//User{id=0, age=18, name='zed'}

        dao.update("2", new User(2, 17, "rose"));

        System.out.println(dao.list());//[User{id=0, age=18, name='zed'}, User{id=2, age=17, name='rose'}]

        dao.delete("1");

        System.out.println(dao.list());//[User{id=2, age=17, name='rose'}]
    }
}
