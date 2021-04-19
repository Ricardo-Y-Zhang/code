import java.util.Scanner;

class ForExer11{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("请输入两个数");

		int a = scan.nextInt(), b = scan.nextInt(), c;
		int num1 = a, num2 = b;
		
		while(a % b != 0){
			c = a % b;
			a = b;
			b = c;
		}
		System.out.println("最大公约数：" + b);
		System.out.println("最小公倍数：" +(num1 * num2 /b));
	}
	
}