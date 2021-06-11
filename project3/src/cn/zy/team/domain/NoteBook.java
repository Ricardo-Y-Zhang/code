package src.cn.zy.team.domain;


import java.security.PublicKey;

public class NoteBook implements Equipment{
    private String model;//机器型号
    private double price;//机器价格

    public NoteBook() {
    }

    public NoteBook(String model, double price){
        this.model = model;

        this.price = price;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    @Override
    public String getDescription() {
        return model + "(" + price + ")";
    }
}
