package review;

public class Factorial_review {
	
	//1)반복적으로 구현한 n!
	
	public static int factorialIterative(int n) {
		
		int result = 1;
		
		//1 부터 n까지의 수르 ㄹ차례대로 곱하기
		for( int i=1;i<=n;i++) {
			result *=i;
		}
		
		return result;
	}
	
	//재귀적으로 구현
	public static int factorialRecursive(int n) {
		// n이 1 이하이면 1 
		if(n<=1) return 1;
		
		// n! = n*(n-1)  그대로 작성
		return n * factorialRecursive(n-1); 
		
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("for문으로 구현 : "+ factorialIterative(5));
		System.out.println("재귀적으로으로 구현 : "+ factorialRecursive(5));
		
		
	}
	

}
