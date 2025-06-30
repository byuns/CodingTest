import java.util.*;
import java.io.*;

public class InputOutputMethod {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String scString = sc.nextLine();
        System.out.println("sc.nextLine() : " + scString);

        sc.close(); // System.in은 한 번 닫으면 다시 입력 받지 못하기 때문에 보통 닫지 않음

        /* BufferedReader */ 
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();

            System.out.println("BufferedReader : " + s);

        }catch(Exception e){
            System.out.println(e);
        }

        /* BufferedWriter */
        try{

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringBuilder sb = new StringBuilder();

            sb.append("1 + 2 = ").append(1 + 2).append("\n");
            sb.append("3 + 4 = ").append(3 + 4).append("\n");

            bw.write(sb.toString());
            System.out.println("BufferedWriter + StringBuilder : ");
            bw.flush();

        }catch(Exception e){
            System.out.println(e);
        }

    }
}
