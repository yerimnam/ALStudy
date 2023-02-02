package study01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class NodeMain {
    public static int n, m;
    public static int[][] graph = new int[201][201]; 

    // 이동할 네 가지 방향 정의 (상, 하, 좌, 우) 
    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};

    public static int bfs(int x, int y) {
        // 큐(Queue) 구현을 위해 queue 라이브러리 사용 
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x, y));  // -> Node node = new Node(x,y) 
        						 // q.offer(node)로 할 수도있음
        // 큐가 빌 때까지 반복하기 
        while(!q.isEmpty()) {
            Node node = q.poll(); //큐에서 꺼내기
            x = node.getX();
            y = node.getY();
            // 현재 위치에서 4가지 방향으로의 위치 확인
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                // 미로 찾기 공간을 벗어난 경우 무시
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                // 벽인 경우 무시(괴물이있는 경우)
                if (graph[nx][ny] == 0) continue;
                // 해당 노드를 처음 방문하는 경우에만 최단 거리 기록
                if (graph[nx][ny] == 1) {
                    graph[nx][ny] = graph[x][y] + 1;
                    q.offer(new Node(nx, ny)); //큐에 현재 좌표 넣기
                } 
            } 
        }
        // 가장 오른쪽 아래까지의 최단 거리 반환
        return graph[n - 1][m - 1];// 마지막 도착지점n,m //행렬의 가장 마지막 좌표 출력 (근데 index때문에 +1했기 때문에 실질적인 마지막 좌표는 -1을 해줘야 한다.)
   
        	//결국 (0,0)~ (n-1,m-1)로 되어있는 미로이다~! 
        	// 문제는 1,1부터 시작하니까 그냥 0은 버리는 셈 치고 0,0부터 시작 해서 n,m으로 한 것임 따라서 진짜 원하는 마지막은 n-1,m-1 
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N, M을 공백을 기준으로 구분하여 입력 받기
        System.out.println("n  : " );
        n = sc.nextInt();
        System.out.println("m  : " );
        m = sc.nextInt();
        sc.nextLine(); // 버퍼 지우기

        // 2차원 리스트의 맵 정보 입력 받기
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = str.charAt(j) - '0'; // 미로 생성
            }
        }

        // BFS를 수행한 결과 출력
        System.out.println(bfs(0, 0)); // 0,0부터 시작
    }


}
