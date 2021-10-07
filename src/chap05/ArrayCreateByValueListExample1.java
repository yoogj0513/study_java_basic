package chap05;

public class ArrayCreateByValueListExample1 {
	public static void main(String[] args) {
		/*
		 * [값 목록으로 배열 생성]
		 * 
		 * 배열 선언
		 * 타입[] 변수;
		 * 타입 변수[];
		 * 
		 * 배열 초기화
		 * 타입[] 변수 = null;
		 */
		
		int[] scores = {83, 90, 87};
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		for(int s : scores) {
			sum += s;
		}
		
		System.out.println("총합 : " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
	}
}
