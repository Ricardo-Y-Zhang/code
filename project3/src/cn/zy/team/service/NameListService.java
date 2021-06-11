package src.cn.zy.team.service;

import src.cn.zy.team.domain.*;

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
        employees = new Employee[Data.EMPLOYEES.length];

        for(int i = 0; i < employees.length; i++){
            String[] strs = Data.EMPLOYEES[i];

            int id = Integer.parseInt(strs[1]);

            String name = strs[2];

            int age = Integer.parseInt(strs[3]);

            double salary = Double.parseDouble(strs[4]);

            double bonus = 0;

            int stock = 0;

            Equipment equipment = null;

            String[] strss = Data.EQUIPMENTS[i];

            if(strss.length != 0){
                int equipmentId = Integer.parseInt(strss[0]);

                switch (equipmentId){
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

            switch (Integer.parseInt(strs[0])){
                case Data.EMPLOYEE:
                    employees[i] = new Employee(id, name, age, salary);
                    break;
                case Data.PROGRAMMER:
                    employees[i] = new Programmer(id, name, age, salary, equipment);
                    break;
                case Data.DESIGNER:
                    bonus = Double.parseDouble(strs[5]);
                    employees[i] = new Designer(id, name, age, salary, equipment, bonus);
                    break;
                case Data.ARCHITECT:
                    bonus = Double.parseDouble(strs[5]);
                    stock = Integer.parseInt(strs[6]);
                    employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
                    break;
            }


        }
    }

    @Override
    public String toString() {
        return "NameListService{" +
                "employees=" + Arrays.toString(employees) +
                '}';
    }

    public Employee[] getAllEmployees(){
        return employees;
    }

    public Employee getEmployee(int id){
        return null;
    }
}
