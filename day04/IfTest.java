import java.util.Scanner;

class IfTest{
	public static void main(String[]	args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入成绩：");

		int score = scan.nextInt();

		if(score == 100){
			System.out.println("奖励：BWM");
		}else if(score >= 90){
			System.out.println("奖励：iphone");
		}else if (score >= 80){
			System.out.println("奖励：ipad");
		}else{
			System.out.println("nothing");
		}
	}
}