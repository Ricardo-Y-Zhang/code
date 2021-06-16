package cn.zy.team.domain;

import cn.zy.team.service.Status;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-11 16:15
 **/
public class Programmer extends Employee{
    private int memberId;//开发团队中的id
    private Status status = Status.FREE;//初始化赋默认值
    private Equipment equipment;

    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public Status getStatus() {
        return status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return super.toString() + "\t程序员\t" + getStatus() + "\t\t\t" + getEquipment().getDescription();
    }


    public String getTeamBaseDetails(){
        return getMemberId() + "/" + getId() + "\t" +  getName() + "\t" + getAge() + "\t" + getSalary();
    }

    public String getDetailsForTeam(){
        return getTeamBaseDetails() + "\t程序员";
    }
}
