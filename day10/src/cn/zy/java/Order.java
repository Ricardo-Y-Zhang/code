package cn.zy.java;

public class Order {
    private int orderPrivate;
    int orderDefault;
    public int orderPublic;

    private void methodPrivate(){
        orderDefault = 1;
        orderPrivate = 2;
        orderPublic = 3;
    }

    void methodDefault(){
        orderDefault = 1;
        orderPrivate = 2;
        orderPublic = 3;
    }

    public void methodPublic(){
        orderDefault = 1;
        orderPrivate = 2;
        orderPublic = 3;
    }

}
