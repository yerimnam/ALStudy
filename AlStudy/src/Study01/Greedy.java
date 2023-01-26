package Study01;

public class Greedy {
	
	public static void main(String[] args) {
		int n =1260; //거스,ㄹ러야할 돈
		int cnt = 0; //거슬러줄 동전의 갯수
		
		int [] coinTypes = {500,100,50,10};
		
		for( int i=0;i<4;i++) {
			cnt += n/coinTypes[i]; //1260 / 500  = 2 (몫만) cnt에 더하기 (500원 2개)
			n %= coinTypes[i]; // 1260/500 의 나머지를 n을 저장 ->n에는 260이 저장됨
			
						//나머지들이 n에 저장되고 100원으로 나누기 등등 반복됨
			
		}
		System.out.println(cnt);
		
		
	}

}
