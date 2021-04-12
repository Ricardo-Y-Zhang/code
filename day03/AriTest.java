class AriTest{
	public static void main(String[] args){
		int a = 3, b = 3;
		int c = a++;
		int d = ++b;
		System.out.println("a = "+ a );
		System.out.println("a++ = " + c);
		System.out.println("b = "+ b );
		System.out.println("++b = " + d);
	}
}