package review;

import java.util.ArrayList;
import java.util.Stack;

public class Dfs_review {
	public static boolean[] visited = new boolean[9];
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	
	//DFS 함수 정의
	public static void dfs(int x) {
	
	//노드 방문 처리
		visited[x] =true;
		System.out.print(x +" "); //정답 출력
		
		for(int i=0;i<graph.get(x).size();i++) {
			int y = graph.get(x).get(i);
			
			if(! visited[y]) dfs(y);
				
		}
	}
	
//	stack으로 구현하기
//	public static void dfsStack(int x) {
//		 Stack<Integer> stack = new Stack<Integer>(); //스택으로 구현
//		 
//		 stack.push(x); //시작점 스택에 넣기
//		visited[x] = true; //시작점 방문 처리
//		System.out.print(x+ " ");
//		while(!stack.isEmpty()) {
//			int y = stack.pop();
//			for ( int i=0;i<graph.get(y).size();i ++) {
//				int z = graph.get(y).get(i);
//				if(!visited[z] ) {
//					stack.push(z);
//					System.out.print(z +" ");
//				visited[z] = true;
//				}
//			}
//		}
//	}	
	public static void main(String[] args) {
		
	
		//그래프 초기화
		for( int i =0;i<9; i++ ) {
			graph.add(new ArrayList<Integer>());
		}
			
		
		//노드 1에 연결된 노드 정보 저장
		graph.get(1).add(2);
		graph.get(1).add(3);
		graph.get(1).add(8);
		
		
		//노드 2에 연결된 노드 정보 저장
		graph.get(2).add(1);
		graph.get(2).add(7);
		
		//노드 3에 연결된 노드 정보 저장
		graph.get(3).add(1);
		graph.get(3).add(4);
		graph.get(3).add(5);
		
		//노드 4에 연결된 노드 정보 저장
		graph.get(4).add(3);
		graph.get(4).add(5);
		
		//노드 5에 연결된 노드 정보 저장
		graph.get(5).add(3);
		graph.get(5).add(4);
		
		//노드 7에 연결된 노드 정보 저장
		graph.get(7).add(2);
		graph.get(7).add(6);
		graph.get(7).add(8);
		
		//노드 8에 연결된 노드 정보 저장
		graph.get(8).add(1);
		graph.get(8).add(7);
		
		dfs(1); //1부터 방문 
		System.out.println(" ");
		System.out.println("stack 이용 -----");
//		dfsStack(1);
	}
}
