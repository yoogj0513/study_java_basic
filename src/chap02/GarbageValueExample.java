package chap02;

public class GarbageValueExample {
	
	/* *
	 * 최대값을 넘으면 다시 최소값으로 반복 저장
	 * */
	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
		
		for(int i=0; i<5; i++) {
			var1++;
			var2++;
			
			System.out.println("var1 : " + var1 + "\t var2 : " + var2);			 
		}
	}
	
}
