package src.cn.zy.team.service;

import src.cn.zy.team.domain.Architect;
import src.cn.zy.team.domain.Designer;
import src.cn.zy.team.domain.Employee;
import src.cn.zy.team.domain.Programmer;

/**
 * @program: code
 * @description: 关于开发团队成员的管理：添加、删除等
 * @author: Mr.Yan
 * @create: 2021-06-12 18:06
 **/
public class TeamService {
    private static int counter = 1;//静态变量，用来为开发团队新增成员自动生成团队中的唯一ID，即memberId
    private final int MAX_MEMBER = 5;//开发团队最大成员数
    private Programmer[] team = new Programmer[MAX_MEMBER];
    private int total = 0;//记录实际人数


    /**
     * description: 返回团队中全体员工
     * @param
     * @return
     * @author: Mr.Yan
     * @date: 2021/6/12
     **/
    public Programmer[] getTeam() {
        Programmer[] team = new Programmer[total];
        for(int i = 0; i < total; i++){
            team[i] = this.team[i];
        }
        return team;
    }


    /**
     * description: 将指定员工添加到开发团队中
     * @param
     * @return
     * @author: Mr.Yan
     * @date: 2021/6/12
     **/
    public void addMember(Employee e) throws TeamException{
        //成员已满，无法添加
        //该成员不是开发人员，无法添加
        //该员工已在本开发团队中
        //该员工已是某团队成员
        //该员工正在休假，无法添加
        //团队中至多只能有一名架构师
        //团队中至多只能有两名设计师
        //团队中至多只能有三名程序员

        //成员已满，无法添加
        if(total >= MAX_MEMBER){
            throw new TeamException("成员已满，无法添加");
        }

        //该成员不是开发人员，无法添加
        if(!(e instanceof Programmer)){
            throw new TeamException("该成员不是开发人员，无法添加");
        }

        //该员工已在开发团队中
        for(int i = 0; i < total; i++){
            if(team[i].getId() == e.getId()){
                throw new TeamException("该员工已在本开发团队中");
            }
        }

        //该员工已是某团队成员、或休假
        //Status.BUSY 等为全局常量，equals方法未重写仍可使用
        //((Programmer) e).getStatus().equals(Status.BUSY)
        if("BUSY".equals(((Programmer) e).getStatus().getNAME())){
            throw new TeamException("该员工已是某团队成员");
        }else if("VOCATION".equals(((Programmer) e).getStatus().getNAME())){
            throw new TeamException("该员工正在休假，无法添加");
        }


        //记录团队中架构师、设计师、程序员人数
        int architectNum = 0, designerNum = 0, programmerNum = 0;
        for(int i = 0; i < total; i++){
            if(team[i] instanceof Architect){
                architectNum++;
            }else if(team[i] instanceof Designer){
                designerNum++;
            }else{
                programmerNum++;
            }
        }


        //团队中至多只能有一名架构师、两名设计师、三名程序员
        if(e instanceof Architect ) {
            if(architectNum == 1){
                throw new TeamException("团队中至多只能有一名架构师");
            }
        }else if(e instanceof Designer){
            if(designerNum == 2){
                throw new TeamException("团队中至多只能有两名设计师");
            }
        }else if(e instanceof Programmer){
            if(programmerNum == 3){
                throw new TeamException("团队中至多只能有三名程序员");
            }
        }


        //将员工添加到team中
        Programmer p = (Programmer) e;

        p.setStatus(Status.BUSY);

        p.setMemberId(counter++);

        team[total++] = p;

    }



    /**
     * description: 移除团队中指定员工
     * @param
     * @return
     * @author: Mr.Yan
     * @date: 2021/6/13
     **/
    public void removeMemeber(int memberId) throws TeamException{
        for(int i = 0; i < total; i++){
            if(team[i].getMemberId() == memberId){

                //更改工作状态
                team[i].setStatus(Status.FREE);

                for(int j = i + 1; j < total; j++){
                    team[j-1] = team[j];
                }

                //更改total
                team[--total] = null;


                return;
            }
        }

        throw new TeamException("找不到指定memberId的员工，删除失败");
    }
}
