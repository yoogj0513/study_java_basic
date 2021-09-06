package chap02;

//정수 타입을 실수 타입으로 변환할 때 정밀도 손실을 피
public class FromIntToDouble {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result); //-4
		
		/*
		 * int 값을 손실 없이 float 타입의 값으로 변환하려면 가수 23비트로 표현가능한 
		 * 123456780 값은 23비트로 표현할수 없음
		 * 그렇기 때문에 float 값을 다시 int 타입으로 변환하면 원래의 int값을 얻지 못함
		 * 
		 * 해결책은 모든 int값을 실수 타입으로 안전하게 변환시키는 double타입을 사용하는 것 
		 * 
		 * float 	: 부호(1비트) + 지수(8비트) + 가수(23비트)
		 * double 	: 부호(1비트) + 지수(11비트) + 가수(52비트)  
		 */
		
		int num4 = 123456780;
		int num5 = 123456780;
		
		double num6 = num5;
		num5 = (int) num6;
		
		int result2 = num4 - num5;
		System.out.println(result2);
		
	}
}
