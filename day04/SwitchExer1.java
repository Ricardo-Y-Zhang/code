import java.util.Scanner;

class SwitchExer1{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("请输入一个字母：");
		
		String str = scan.next();

		switch (str){
		case "a":
			System.out.println("A");
			break;
		case "b":
			System.out.println("B");
			break;
		case "c":
			System.out.println("C");
			break;
		default:
			System.out.println("other");
			break;
		}
	}
	
}