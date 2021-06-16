package cn.zy.exer6;

/**
 * @program: code
 * @description: 模拟银行
 * @author: Mr.Yan
 * @create: 2021-05-17 16:46
 **/
public class Bank {
    private Customer[] customers;//存放多个客户的数组
    private int numberOfCustomer;//记录客户的个数


    public Bank(){customers = new Customer[10];}

    /**
    * @Description: 增加客户信息；数组为引用数据类型数组，还需要考虑数组容量不足的情况
    * @Param: [firstName, lastName]
    * @return: void
    * @Author: Mr.Yan
    * @Date: 2021/5/17
    */
    public void addCustomer(String firstName, String lastName){
        Customer customer = new Customer(firstName, lastName);

        if(numberOfCustomer < customers.length){
            customers[numberOfCustomer] = customer;
        }else{
            Customer[] tempCustomers = new Customer[numberOfCustomer + 1];
            for(int i = 0; i < customers.length; i++){
                tempCustomers[i] = customers[i];
            }
            tempCustomers[numberOfCustomer] = customer;
            customers = tempCustomers;
        }
        numberOfCustomer++;
    }

    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    public Customer getCustomer(int index){
        if(index > numberOfCustomer || index < 0){
            System.out.println("查询错误");
            return new Customer();
        }else{
            return customers[index];
        }
    }
}
