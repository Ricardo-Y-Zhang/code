class AriExer {
	public static void main(String[] args){
		int num = 187;
		System.out.println("个位为：" + num % 10);
		num /= 10;
		System.out.println("百位为：" + num % 10);
		num /= 10;
		System.out.println("千位为：" + num % 10);
	}
}