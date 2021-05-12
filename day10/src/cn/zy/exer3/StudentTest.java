package src.cn.zy.exer3;

public class StudentTest {
    public static void main(String[] args) {

        Student test = new Student("Jack", 18,"浙江大学","软件工程");

        System.out.println("name\tage\tschool\tmajor\t");

        System.out.println(test.getName() + "\t" + test.getAge() + "\t" + test.getSchool() + "\t" + test.getMajor());

    }
}
