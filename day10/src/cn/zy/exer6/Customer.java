package cn.zy.exer6;

/**
 * @program: code
 * @description: 模拟顾客
 * @author: Mr.Yan
 * @create: 2021-05-17 16:32
 **/
public class Customer {

    private String firstName;
    private String lastName;
    private Account account;

    public Customer(){}
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }


}
