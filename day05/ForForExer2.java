/*

*/
class ForForExer2{
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		System.out.println("10000以内素数：");
		for(int i = 2; i <= 10000; i++){
			boolean flag = true;
			for(int j = 2; j < Math.sqrt(i); j++){
				if(i % j == 0){
					flag = false;
					break;
				}
			}
			if(flag == true){
				System.out.print(i + " ");
			}
		}
		System.out.println();
		long end = System.currentTimeMillis();
		System.out.println("time: " + (end-start));
	}
}