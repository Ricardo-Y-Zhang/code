package cn.zy.team.service;

import cn.zy.team.domain.*;

import java.util.Arrays;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-11 16:46
 **/
public class NameListService {
    private Employee[] employees;

    /**
     * description: 将Data中的数据封装到Employee[]数组中
     * @param  
     * @return  
     * @author: Mr.Yan
     * @date: 2021/6/11
     **/
    public NameListService(){

        //初始化employee数组
        employees = new Employee[Data.EMPLOYEES.length];

        //遍历数组赋值
        for(int i = 0; i < employees.length; i++){
            String[] strs = Data.EMPLOYEES[i];

            //获取id、name、age、salary等基本信息
            int type = Integer.parseInt(strs[0]);

            int id = Integer.parseInt(strs[1]);

            String name = strs[2];

            int age = Integer.parseInt(strs[3]);

            double salary = Double.parseDouble(strs[4]);

            double bonus = 0;

            int stock = 0;

            Equipment equipment = null;

            //根据type初始化employees数组元素
            switch (type){
                case Data.EMPLOYEE:
                    employees[i] = new Employee(id, name, age, salary);
                    break;
                case Data.PROGRAMMER:
                    equipment = createEquipment(i);
                    employees[i] = new Programmer(id, name, age, salary, equipment);
                    break;
                case Data.DESIGNER:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(strs[5]);
                    employees[i] = new Designer(id, name, age, salary, equipment, bonus);
                    break;
                case Data.ARCHITECT:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(strs[5]);
                    stock = Integer.parseInt(strs[6]);
                    employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
                    break;
            }


        }
    }

    /**
     * description: 获取指定位置员工的equipment
     * @param
     * @return
     * @author: Mr.Yan
     * @date: 2021/6/12
     **/
    public Equipment createEquipment(int index){
        Equipment equipment = null;

        String[] strss = Data.EQUIPMENTS[index];

        if(strss.length != 0){
            int equipmentType = Integer.parseInt(strss[0]);

            switch (equipmentType){
                case Data.PC:
                    equipment = new PC(strss[1], strss[2]);
                    break;
                case Data.NOTEBOOK:
                    equipment = new NoteBook(strss[1], Double.parseDouble(strss[2]));
                    break;
                case Data.PRINTER:
                    equipment = new Printer(strss[1], strss[2]);
                    break;
            }
        }

        return equipment;
    }

    @Override
    public String toString() {
        return "NameListService{" +
                "employees=" + Arrays.toString(employees) +
                '}';
    }

    /**
     * description: 获取当前所有员工
     * @param
     * @return
     * @author: Mr.Yan
     * @date: 2021/6/12
     **/
    public Employee[] getAllEmployees(){
        return employees;
    }



    /**
     * description: 获取指定ID的员工
     * @param
     * @return
     * @author: Mr.Yan
     * @date: 2021/6/12
     **/
    public Employee getEmployee(int id) throws TeamException{
        for(int i = 0; i < employees.length; i++){

            if(id == employees[i].getId()){
                return employees[i];
            }
        }
        throw new TeamException("未找到指定员工");
    }
}
