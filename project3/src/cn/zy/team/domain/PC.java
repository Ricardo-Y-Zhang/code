package src.cn.zy.team.domain;

import javax.swing.*;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-11 15:48
 **/
public class PC implements Equipment{
    private String model;//机器名称

    private String display;//显示器名称

    public PC(){}

    public PC(String model, String display){
        this.model = model;

        this.display = display;
    }


    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    public void setDisplay(String display){
        this.display = display;
    }

    public String getDisplay(){
        return display;
    }

    @Override
    public String getDescription() {
        return model + "(" + display + ")";
    }
}
