package CodingTest.BaekJoon;

import java.io.*;
import java.util.*;

public class BJ_1927 {
    /* www.acmicpc.net/problem/1927 최소 힙*/
    public static void main(String[] args){
    
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            // ArrayList<Integer> tmp = new ArrayList<>(); // 성능면에서 StringBuilder 사용이 더 좋음

            int n = Integer.parseInt(br.readLine());

            PriorityQueue<Integer> pq = new PriorityQueue<>();

            for(int i = 0; i < n; i++){
                int num = Integer.parseInt(br.readLine());

                if(num == 0){
                    if(pq.isEmpty()){
                        sb.append("0\n");
                    }else{
                        sb.append(pq.poll()).append("\n");
                    }
                }else{
                    pq.add(num);
                }
            }

            System.out.println(sb);

        } catch(Exception e){
            System.out.println(e);
        }

    }
}
