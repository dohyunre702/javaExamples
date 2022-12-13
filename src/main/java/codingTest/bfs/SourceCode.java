package codingTest.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//bfs는 큐 자료구조를 이용함
public class SourceCode {
    public static boolean[] visited = new boolean[9];
    //중첩 리스트로 그래프 이용
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    //bfs 함수 정의
    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        //현재 노드 방문처리
        visited[start] = true;
        while(!q.isEmpty()) {
            //큐에서 하나의 원소 뽑아 출력
            int x = q.poll();
            System.out.println(x + " ");
            //해당 원소와 연결된, 아직 방문하지 않은 원소들을 큐에 삽입
            for(int i = 0; i < graph.get(x).size(); i++) {
                int y = graph.get(x).get(i);
                if(!visited[y]) {
                    q.offer(y);
                    visited[y] = true;
                }
            }
        }
    }
    //메인함수 생략
}
