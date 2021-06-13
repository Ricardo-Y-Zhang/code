package src.cn.zy.team.view;

import src.cn.zy.team.domain.Employee;
import src.cn.zy.team.domain.Programmer;
import src.cn.zy.team.service.NameListService;
import src.cn.zy.team.service.TeamException;
import src.cn.zy.team.service.TeamService;
import src.cn.zy.team.utility.TSUility;

import java.awt.*;

/**
 * @program: code
 * @description: 前端界面
 * @author: Mr.Yan
 * @create: 2021-06-11 10:50
 **/
public class TeamView {

    private NameListService listSvc = new NameListService();

    private TeamService teamSvc = new TeamService();

    public void enterMainMenu(){

        char menuSelection = '0';

        Label: for(;;){

            if(menuSelection != '1'){
                listAllEmployees();;
            }

            System.out.print("1-团队列表\t2-添加团队成员\t3-删除团队成员\t4-退出\t请选择（1-4）：");

            menuSelection = TSUility.readMenuSelection();

            switch (menuSelection){

                case '1':
                    getTeam();
                    break;
                case '2':
                    addMember();
                    break;
                case '3':
                    deleteMember();
                    break;
                case '4':
                    System.out.print("确认是否退出（Y/N）: ");
                    char confirmSelection = TSUility.readConfirmSelection();
                    if(confirmSelection == 'Y'){
                        break Label;
                    }
                    break;
            }
        }
    }


    /**
     * description: 显示所有的员工信息
     * @param
     * @return
     * @author: Mr.Yan
     * @date: 2021/6/13
     **/
    private void listAllEmployees(){
        System.out.println("--------------------------------开发团队调度软件--------------------------------");

        System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");

        Employee[] employees = listSvc.getAllEmployees();

        for(int i = 0; i < employees.length; i++){
            System.out.println(employees[i]);
        }

        System.out.println("-----------------------------------------------------------------------------");

    }


    /**
     * description: 获取团队成员列表
     * @param
     * @return
     * @author: Mr.Yan
     * @date: 2021/6/13
     **/
    private void getTeam(){

        System.out.println("-------------------------------团队成员列表------------------------------------");

        Programmer[] team = teamSvc.getTeam();

        if(team == null || team.length == 0){//team为空时，可能返回null，加一重判断，防止length（）方法报错
            System.out.println("目前开发团队没有成员!");
        }else{
            System.out.println("TID/ID\t姓名\t年龄\t工资\t职位\t奖金\t股票");
            for(int i = 0; i < team.length; i++){
                System.out.println(team[i].getDetailsForTeam());
            }
        }

        System.out.println("-----------------------------------------------------------------------------");
    }


    /**
     * description: 添加团队成员
     * @param
     * @return
     * @author: Mr.Yan
     * @date: 2021/6/13
     **/
    private void addMember(){
        System.out.println("---------------------------------添加成员--------------------------------------");

        System.out.print("请输入要添加的员工ID：");

        int id = TSUility.readInt();

        try {
            teamSvc.addMember(listSvc.getEmployee(id));
            System.out.println("添加成功");

        } catch (TeamException e) {
            System.out.println("添加失败，原因：" + e.getMessage());
        }

        //按回车键继续
        TSUility.readReturn();

        System.out.println("-----------------------------------------------------------------------------");
    }


    /**
     * description: 删除团队成员
     * @param
     * @return
     * @author: Mr.Yan
     * @date: 2021/6/13
     **/
    public void deleteMember(){

        System.out.println("---------------------------------添加成员--------------------------------------");

        System.out.print("请输入要删除员工的TID：");

        int tid = TSUility.readInt();

        System.out.print("确认是否删除Y/N: ");

        char confirmSelection = TSUility.readConfirmSelection();

        if(confirmSelection == 'Y'){
            try {
                teamSvc.removeMemeber(tid);

                System.out.println("删除成功");
            } catch (TeamException e) {
                System.out.println("删除失败，原因：" + e.getMessage());
            }

            //按回车键继续
            TSUility.readReturn();

        }

        System.out.println("-----------------------------------------------------------------------------");
    }

}
