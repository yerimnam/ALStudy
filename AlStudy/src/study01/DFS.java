package study01;

import java.util.ArrayList;

public class DFS {
	
	 public static boolean[] visited = new boolean[9]; //방문했는지 처리하기
	    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>(); // 2차원 arrayList (2차월 배열로도 가능)

	    // DFS 함수 정의
	    public static void dfs(int x) {
	        // 현재 노드를 방문 처리
	        visited[x] = true;
	        System.out.print(x + " "); //정답
	        // 현재 노드와 연결된 다른 노드를 재귀적으로 방문
	        for (int i = 0; i < graph.get(x).size(); i++) { //각 노드들의 크기만큼반복
	            int y = graph.get(x).get(i); //각 노드에 연결 된 노드
	            if (!visited[y]) dfs(y); //방문하지 앟았으면 재귀적으로 방문
	        }
	    }

	    public static void main(String[] args) {
	        // 그래프 초기화
	        for (int i = 0; i < 9; i++) {
	            graph.add(new ArrayList<Integer>());
	        }

	        // 노드 1에 연결된 노드 정보 저장 
	        graph.get(1).add(2);
	        graph.get(1).add(3);
	        graph.get(1).add(8);
	        
	        // 노드 2에 연결된 노드 정보 저장 
	        graph.get(2).add(1);
	        graph.get(2).add(7);
	        
	        // 노드 3에 연결된 노드 정보 저장 
	        graph.get(3).add(1);
	        graph.get(3).add(4);
	        graph.get(3).add(5);
	        
	        // 노드 4에 연결된 노드 정보 저장 
	        graph.get(4).add(3);
	        graph.get(4).add(5);
	        
	        // 노드 5에 연결된 노드 정보 저장 
	        graph.get(5).add(3);
	        graph.get(5).add(4);
	        
	        // 노드 6에 연결된 노드 정보 저장 
	        graph.get(6).add(7);
	        
	        // 노드 7에 연결된 노드 정보 저장 
	        graph.get(7).add(2);
	        graph.get(7).add(6);
	        graph.get(7).add(8);
	        
	        // 노드 8에 연결된 노드 정보 저장 
	        graph.get(8).add(1);
	        graph.get(8).add(7);

	        dfs(1);
	    }


}
