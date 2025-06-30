package CodingTest.BaekJoon;

import java.util.*;
import java.io.*;

public class BJ_1157 {
    /* www.acmicpc.net/problem/1157 단어 공부*/
    public static void main(String[] args){
        // 단순 알파벳 카운팅으로, int[] arr = new int[26]이 더 빠르게 처리됨
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine().toString().toLowerCase();

            String[] strList = str.split("");

            Map<String, Integer> map = new HashMap<>();

            for(String s : strList){
                if(map.get(s) == null){
                    map.put(s, 1);
                }else{
                    map.put(s,map.get(s)+1);
                }
            }

            int maxNum = Collections.max(map.values());
            String maxKey = "";
            int count = 0;

            for(Map.Entry<String, Integer> entry : map.entrySet()){
                if(entry.getValue() == maxNum){
                    maxKey = entry.getKey();
                    count++;
                }
            }

            if(count == 1){
                System.out.println(maxKey.toUpperCase());
            }else{
                System.out.println("?");
            }
            

        }catch(Exception e){

        }
    }
}
