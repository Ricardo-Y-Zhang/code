package src.cn.zy.java.exer10;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-06 13:22
 **/
public class ComparableCircle extends Circle implements CompareObject{

    public ComparableCircle(double radius){
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof ComparableCircle){
            if(this.getRadius() == ((ComparableCircle) o).getRadius()){
                return 0;
            }else if (this.getRadius() > ((ComparableCircle) o).getRadius()){
                return 1;
            }else{
                return -1;
            }
        }
        return -99999;
    }
}
