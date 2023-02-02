package study01;

import java.util.Scanner;

public class Gcd {//유클리드호제법 (최대공약수 구하기) 
	
	//예) 72,42 두개의 수의 최대 공약수를 구해보기 
//	1) 먼저 두 수 중 큰 수를 찾는다 (72)
//  2)	큰 수를 작은 수로 나눠서 나머지를 구한다 -> 72% 42 = 30(나머지)
//  3) 나머지를 가지고 앞에서 나눈 수를 나눠서 나머지를 구한다 =>42%30 =12(나머지)
//	4) 3번 반복 ->30%12= 6(나머지)
//	5) 3번 반복 -> 12%6 = 0 (나머지) 
//	6) 마지막으로 나머지가 0이 되었으므로 그 시점에 나눈 수가 최대 공약 수 -> 6
	
	
	public static int eucd(int bn, int sn) {

		// bn : 큰 숫자
		//	sn : 작은 숫자

		//큰 숫자를 작은 숫자로 나눈 나머지 계산
		int r = bn%sn;

		if( r ==0) { //나머지가 0이라면 작은 숫자 = 최대공약스
			return sn;
			
		}else {
			//나머지가 0 이상이면 재귀 형태로 호출 -> 파라미터  = 작은 숫자, 나머지
			return eucd(sn,r);
		}
		
		
	
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요 ");
		System.out.print("a :");
		int a = sc.nextInt();
		System.out.print("b :");
		int b = sc.nextInt();
		
		
		int n = eucd(Math.max(a, b),Math.min(a, b));
		
		System.out.println("최대 공약수 :"+n);
		
		
		
		//두수의 최소공배수 구하기
		
		//최대 공약수로 두수를 나눠서 몫구하기
		
		a = a/n;
		b = b/n;
		
		
		//두수의 최소 공배수 = 두수의 최대 공약수 * 위의 몫
		
		int m = a * b* n;
		
		System.out.println("최대공배수 : "+ m);
		
		
	}
	
}
