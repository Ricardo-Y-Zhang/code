/*
scanner使用
1、导包：import java.util.Scanner
2、Scanner的实例化
3、调用Scanner类的相关方法，来获取指定类型的变量
*/
import java.util.Scanner; 

class ScannerTest{ 
	public static void main(String[] args){ 
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("请输入姓名："); 
		
		String name = scan.next(); 
		
		System.out.println(name);
		
		System.out.println("请输入年龄");
		
		int age = scan.nextInt(); 
		
		System.out.println(age); 
		
		System.out.println("请输入体重"); 
		
		double weight = scan.nextDouble(); 
		
		System.out.println(weight); 
		
		System.out.println("是否婚配（true/false）"); 
		
		boolean marry = scan.nextBoolean(); 
		
		System.out.println(marry);
	} 
}