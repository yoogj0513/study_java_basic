package chap05;

public class ArrayCreateByValueListExample2 {
	public static void main(String[] args) {
		/*
		 * [값의 리스트로 배열 생성]
		 * 
		 * 값의 목록으로 배열 객체를 생성할 때 주의점
		 * - 배열 변수를 이미 선언 후에 다른 실행문에서 중괄호를 사용한 배열 생성은 허용되지 않는다.
		 * [ex]
		 * 타입[] 변수;
		 * 변수 = {값0, 값1 ... }; -> 컴파일 에러
		 * 
		 * 변수 선언 후 값이 결정되는 경우 new 연산자를 사용해서 값 목록을 지정
		 * [ex]
		 * 변수 = new 타입[] {값0, 값1 ... };
		 * String[] names = null;
		 * names = new String[] {"name1", "name2", ... };
		 * 
		 * 메소드의 매개값이 배열일 경우 동일함
		 * [ex]
		 * int add(int[] scores) {...}
		 * int result = add({95, 85, 90}); -> 컴파일 에러
		 * int reulst = add(new int[] {95, 85, 90});
		 * 
		 */
		
		int[] scores;
		scores = new int[] {83, 90, 87};
		
		int sum1 = 0;
		
		for(int score : scores) {
			sum1 += score;
		}
		
		System.out.println("총합 : " + sum1);
		
		// 리턴된 총합을 sum2에 저장
		int sum2 = add(new int[] {83, 90, 87});
		System.out.println("총합 : " + sum2);
		
	}

	private static int add(int[] scores) {
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		
		return sum;
	}
}
