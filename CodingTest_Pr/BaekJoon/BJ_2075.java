package CodingTest.BaekJoon;

import java.util.*;
import java.io.*;

public class BJ_2075 {
    public static void main(String[] args){
        /* www.acmicpc.net/problem/2075 N번째 큰 수*/
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine()); // 첫 N 입력

            PriorityQueue<Integer> pq = new PriorityQueue<>(N + 1);

            for(int i = 0; i < N; i++){
                StringTokenizer st = new StringTokenizer(br.readLine()); // 1 ~ N 행

                for(int j = 0; j < N; j++){
                    pq.offer(Integer.parseInt(st.nextToken())); // 용량 제한 큐에서 offer는 boolean을 반환하지만 add는 exception(예외)를 떨굼

                    if(pq.size() > N){
                        pq.poll();
                    }
                }
            }

            System.out.println(pq.peek());

        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}
