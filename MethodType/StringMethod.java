public class StringMethod {
    public static void main(String[] args){
        String s = "Sample String";
        StringBuilder sb = new StringBuilder();

        System.out.println("s : " + s);
        System.out.println("s.charAt(3) : " + s.charAt(3));
        System.out.println("s.length() : " + s.length());
        System.out.println("s.substring(0,6) : " + s.substring(0, 6));
        System.out.println("s.equals(\"String\") : " + s.equals("String"));
        System.out.println("s.contains(\"String\") : " + s.contains("String"));
        System.out.println("s.split(\" \")[0] : " + s.split(" ")[0]);
        System.out.println("s.replace(\" \", \"-\") : " + s.replace(" ", "-")); // 모든 대응 문자 변환
        System.out.println("s.replaceAll(\".\",\"-\") : " + s.replaceAll(".", "-")); // 모든 대응 문자 변환 및 정규표현식 사용 가능
        System.out.println("s.toCharArray()[0] : " + s.toCharArray()[0]); // 문자 배열 변환
        System.out.println("sb.append(s).toString() : " + sb.append(s).toString() ); // 문자열 이어붙이기
        System.out.println("sb.reverse() : " + sb.reverse());
    }
}
