import java.util.*;

public class ArrayMethod {
    public static void main(String[] args){
        int[] arr = {2,4,5,3,1};
        List<Integer> arrList = new ArrayList<>();

        System.out.println("arr : " + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("Arrays.sort(arr) : " + Arrays.toString(arr)); // 오름차순 정렬
        System.out.println("Arrays.copyOf(arr, 2).toString() : " + Arrays.toString(Arrays.copyOf(arr, 2))); // 배열 복사
        System.out.println("Arrays.copyOfRange(arr,0,3) : " + Arrays.toString(Arrays.copyOfRange(arr, 1,3))); // 부분 복사
        System.out.println("Arrays.binarySearch(arr, 2) : " + Arrays.binarySearch(arr, 2)); // 인덱스 서칭

        arrList.add(2); arrList.add(4); arrList.add(5); arrList.add(3); arrList.add(1);
        System.out.println("arrList.add(2) ... .add(1) : " + arrList);
        System.out.println("arrList.get(2) : " + arrList.get(2));
        arrList.remove(2);
        System.out.println("arrList.remove(0) : " + arrList);

        Collections.sort(arrList);
        System.out.println("Collections.sort(arrList) : " + arrList);
        Collections.reverse(arrList);
        System.out.println("Collections.reverse(arrList) : " + arrList);
        System.out.println("Collecions.max(arrList) : " + Collections.max(arrList));

    }
}
