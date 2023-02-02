package review;

import java.util.Scanner;

public class Gcd_review {

	// 두수 중 큰 수를 찾는다
	// 큰ㄴ수 % 작은 수 = 나머지
	//작은수 %나머지  = 나머지2
	//위의 반복
	// 작은 수 %나머지 n = 0 
	//그 시적의 나머지 n == 최대 공약수 
	
	public static int eucd( int b, int s) {
		
		// b : 큰 숫자
		// s 작은 숫자
		
		int r = b%s;
		
		if( r ==0 ) { // s가 최대 공약수 
			return s;
			
		}else {
			// 나머지가 0이상이면 재귀 형태로 호출
			return eucd(s,r);
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 수를 입력하세요");
		System.out.print("b : ");
		int a = sc.nextInt();
		
		System.out.print("s : ");
		int b = sc.nextInt();
		
		
		int n = eucd(Math.max(a, b), Math.min(a, b)); //최대 공약수 
		System.out.println("최대 공약 수 : "+ n);
		
		
		//두 수의 최소 공배수 구하기
		
		//최대 공약수로두수를 나눠서 몫 구하기
		
		a = a/n;
		b= b/n;
		
		// 두수의 최소 공배수 = 두 수의 최대 공약 수 * 위의 못
		int m = a*b*n;
		
		System.out.println("최소 공배수 : " + m);
		
	}
	
	
}
