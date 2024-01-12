import java.util.*;

public class Main {

    public static void myFunc(String str) {
        // 엄청 복잡한 처리
    }

    public static void main(String[] args) {

        // <> 제너릭

        // Wrapper 클래스
        // byte Byte
        // char Character
        // short Short
        // int Integer
        // long Long
        // float Float
        // double Double
        // boolean Boolean

        // ArrayList
        ArrayList<String> list = new ArrayList<>();

        // list.add("안녕하세요."); // index : 0
        // list.add("반갑습니다."); // index : 1
        // list.add("자바입니다."); // index : 2
        // list.set(1, "안녕히가세요.");
        // list.size();    // 현재 리스트내의 아이템 갯수 반환
        // list.clear();   // 모든 데이터 삭제
        // list.get(0);    // 리스트내의 0번째 아이템을 반환
        // list.remove(1);

        // LinkedList
        LinkedList<String> list2 = new LinkedList<>();

        // list2.add("LinkedList 입니다.");
        // list2.add("ArrayList 하고는 좀 달라요");
        // list2.set(1, "안녕히가세요");
        // list2.get(1);

        for (String str : list) {
            myFunc(str);
            System.out.println(str);
        }

        for (String str : list2) {
            System.out.println(str);
        }

        list2.forEach(str -> {
            System.out.println();
        });

        list2.forEach(System.out::println);

        list.forEach(Main::myFunc);

        // T, E, K, N, V, R
        HashMap<String, String> myMap = new HashMap<>();
        myMap.put("summer", "여름");
        myMap.put("spring", "봄");
        myMap.forEach((str1, str2) -> {
            System.out.println(str1);
            System.out.println(str2);
        });

        System.out.println("=========================");

        TreeMap<String, String> myMap2 = new TreeMap<>();
        myMap2.put("spring", "봄");
        myMap2.put("summer", "여름");
        myMap2.forEach((str1, str2) -> {
            System.out.println(str1);
            System.out.println(str2);
        });
        System.out.println(myMap2.get("summer")); // 여름

        HashMap<String, Person> myMap3 = new HashMap<>();

        HashMap<String, HashMap<String, String>> myMap4 = new HashMap<>();
        myMap4.get("1").get("string");

        // String[] arr = new String[10];
        // int[] arr2 = new int[10];

        // MyArray arr = new MyArray();    // default_size 10칸 짜리 배열
        // MyArray arr2 = new MyArray(20);    // 20칸 짜리 배열

        MyArray<String> arr = new MyArray<>();
        MyArray<Integer> arr2 = new MyArray<>();
        arr.add("안녕하세요", 0);
        arr2.add(10, 0);

        // Collection : 데이터들의 집함을 관리하는 클래스(객체)들
        // List(배열) : ArrayList, LinkedList, Vector
        // Map() : HashMap, TreeMap
        // Set(집합) : HashSet, TreeSet

        // first commit

    }
}
