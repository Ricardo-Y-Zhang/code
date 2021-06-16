package cn.zy.team.domain;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-11 15:54
 **/
public class Printer implements Equipment{
    private String name;

    private String type;

    public Printer() {
    }

    public Printer(String name, String type){
        this.name = name;

        this.type = type;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    @Override
    public String getDescription() {
        return name + "(" + type + ")";
    }
}
