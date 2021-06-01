package src.cn.zy.java.exer3;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-05-31 16:21
 **/
public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest test =  new GeometricTest();

        Circle c1 = new Circle(1.0, "shise", 2.0);

        test.display(c1);

        MyRectangle m1 = new MyRectangle(1.0, 9.8, "xiangse", 1.0);

        System.out.println("isequal: " + test.equalsArea(c1, m1));
    }

    public boolean equalsArea(GeometricObject o1, GeometricObject o2){
        return o1.findArea() == o2.findArea();
    }

    public void display(GeometricObject o){//GeometricObject o = new Circle()
        System.out.println("面积为： " + o.findArea());
    }


}
