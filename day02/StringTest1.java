class StringTest1{
	public static void main(String[] args){
		String s1= "学号：";
		int num = 1001;
		String s2 = s1 + num;
		System.out.println(s2);
		int number = 10;
		char c = 'a';
		String str = "hello";
		System.out.println(c + number + str);// 107hello
		System.out.println(c + str + number);// ahello10
		System.out.println(c + (number + str));// a10hello
		System.out.println((c + number) + str);// 107hello
		System.out.println(str + number + c);//hello10a
	}
}