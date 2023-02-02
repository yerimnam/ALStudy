package review;

public class ReversiveFunctio_review {
	
	
	public static void recursiveFunction(int i) {
		
		//stack구조 생각하면 됨
		//차례대로 호출 되었다가 == push 
	   //끝에서부터 popo (종료)
		
		
		//100번째 호출을 했을 때 종료되도록 종료 조건 명시
		if( i ==100) return;
		
		
		System.out.println(i+"번째 재귀함수에서 "+ (i+1)+ "번째 재귀함수를 호출");
		recursiveFunction(i+1);
		System.out.println(i + "번째 재귀 함수를 종료합니다. ");
		
	}
	
	public static void main(String[] args) {
		
		recursiveFunction(1);
	}

}
