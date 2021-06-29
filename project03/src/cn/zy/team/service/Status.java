package cn.zy.team.service;

/**
 * @program: code
 * @description: 员工状态
 * @author: Mr.Yan
 * @create: 2021-06-11 16:24
 **/
//public class Status {
//
//    private final String NAME;
//
//    //私有化构造器
//    private Status(String NAME){
//        this.NAME = NAME;
//    }
//
//    //全局常量
//    public static final Status FREE = new Status("FREE");
//
//    public static final Status BUSY = new Status("BUSY");
//
//    public static final Status VOCATION = new Status("VOCATION");
//
//    public String getNAME(){
//        return NAME;
//    }
//
//    @Override
//    public String toString() {
//        return NAME;
//    }
//}

public enum Status {
    FREE, BUSY, VOCATION;
}
