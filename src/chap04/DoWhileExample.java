package chap04;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.println(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while (!inputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
		
		/*
		 * 블록 내부의 실행문을 우선 실행시키고 실행 결과에 따라서 반복 실행을 계속할지 결정때 사용
		 * 주의점 : while() 뒤에 반드시 세미콜론(;)을 붙어야함 
		 */
	}
}
