class ForExer1{
	public static void main(String[] args){
		for(int i = 1; i <= 150; i++){
			if(i % 3 == 0){
				System.out.println(i + " foo");
			}else if(i % 5 == 0){
				System.out.println(i + " blz");
			}else if(i % 7 == 0){
				System.out.println(i + " baz");
			}else{
				System.out.println(i);
			}
		}
	}
}