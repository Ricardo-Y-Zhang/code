class VariableTest1 {
	public static void main(String[] args){
		byte b1 = 1;
		int a1 = 128;
		//编译不通过
		// byte b2 = b1 + a1;
		int a2 = b1 + a1;
		System.out.println(a2);
	}
}