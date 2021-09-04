package chap02;

public class CharExample {

	/* 
	 * char 타입 변수
	 * int에 char 타입 변수를 저장하면 유니코드 얻을 수 있
	 */
	public static void main(String[] args) {
		char c1 = 'A';			// 문자를 직접 저장 
		char c2 = 65;			// 10진수로 저장 
		char c3 = '\u0041';		// 16진수로 저장
		
		int uniCode = c1; 		// 유니코드 얻기
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(uniCode);		
	}
	
}
