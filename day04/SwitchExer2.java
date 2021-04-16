import java.util.Scanner;

class SwitchExer2{

	public static void main(String[] args){
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入成绩：");

		int score = scan.nextInt();

		switch (score/ 60){

		case 0:
			System.out.println("不及格");
			break;
		case 1:
		 	System.out.println("及格");
			break;
		default:
			System.out.println("输入有误");
	
		}
		
	}

}