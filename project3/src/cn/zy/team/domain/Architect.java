package src.cn.zy.team.domain;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-11 16:41
 **/
public class Architect extends Designer{
    private int stock;//股票

    public Architect(){
        super();
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


}
