/*
对MethodExer1的改进，将操作数组的功能封装到方法中
 */
public class MethodExer1Mod {
    public static void main(String[] args) {
        Student2[] stu = new Student2[20];
        //初始化
        for(int i = 0; i < stu.length; i++){
            stu[i] = new Student2();
            stu[i].number = i + 1;
            //state: [1,6]随机数
            stu[i].state = (int) (Math.random() * (6- 0 + 1) + 1);
            //score：[0,100]随机数
            stu[i].score = (int) (Math.random() * (100 - 0 + 1) + 0);
        }

        //实例化
        MethodExer1Mod test = new MethodExer1Mod();

        //打印3年级学生信息
        test.serachState(stu, 3);
        System.out.println("***********");

        //按成绩排序并打印学生信息
        test.sort(stu);
        test.print(stu);
    }

    //遍历数组
    public void print(Student2[] stu){
        for(int i = 0; i < stu.length; i++){
            System.out.println(i+1 +":\t" + stu[i].info());
        }
    }

    /**
     *
     * @param stu   查找数组
     * @param state 查找年级
     */
    public void serachState(Student2[] stu, int state){
        for(int i = 0; i < stu.length; i++){
            if(stu[i].state == 3){
                System.out.println(stu[i].info());
            }
        }
    }

    public void sort(Student2[] stu){
        for(int i = 0; i < stu.length - 1; i++){
            for(int j = 0; j < stu.length-i-1; j++){
                if(stu[j].score > stu[j+1].score){
                    Student2 temp = new Student2();
                    temp = stu[j];
                    stu[j] = stu[j+1];
                    stu[j+1] = temp;
                }
            }
        }
    }
}
class Student2{
    int number;
    int state;
    int score;

    public String info(){
        String str = "number: " + number  + "\t" + "state: " + state + "\t" + "score: " + score;
        return str;
    }
}
