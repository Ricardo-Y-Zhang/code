public class CircleExer {
    public static void main(String[] args){
        Circle c1 = new Circle();
        c1.r = 1.5;

        System.out.println("面积：" + c1.Area());
    }
}
class Circle{
    //属性：半径
    double r;

    //方法：求面积
    public double Area(){
        return Math.PI * r * r;
    }
}
