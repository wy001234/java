package Step01;


/*
 * 날짜 : 2022/08/16
 * 이름 : 설우영
 * 내용 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class _03 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println(num1 + num2);
	}
}