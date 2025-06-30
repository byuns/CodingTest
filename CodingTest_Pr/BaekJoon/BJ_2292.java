package CodingTest.BaekJoon;

import java.io.*;

public class BJ_2292 {  
    /* www.acmicpc.net/problem/2292 벌집*/
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());

            int layer = 1;
            int maxNum = 1;

            while(N > maxNum){
                maxNum += 6*layer; // 층마다 6씩 늘어남
                layer++;
            }

            System.out.println(layer);


        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}
