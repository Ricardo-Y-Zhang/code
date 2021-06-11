package src.cn.zy.team.domain;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-11 16:39
 **/
public class Designer extends Programmer{
    private double bonus;//奖金


    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }


}
