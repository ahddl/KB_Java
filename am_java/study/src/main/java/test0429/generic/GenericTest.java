package main.java.test0429.generic;

import java.util.ArrayList;

public class GenericTest {
    public static void main(String[] args) {
        //제너릭은 general 이라는 뜻!

        //제너릭을 쓰지 않았을 때
        ArrayList list = new ArrayList(); //Object으로 기본 설정되어 있음
        list.add("홍길동"); //String(작) --> Object(큰) 자동형 변환
        //자동형 변환이 되어 들어간 것을 꺼내서 String 에 있었던 equls()메서드로
        //값을 비교하고 싶은 경우 Object의 equals() 사용할 수 없음
        //원래의 String 클래스에 있었던 equals() 필요함
        list.get(0).equals("김길동"); //Object은 주소를 비교
        ((String)list.get(0)).equals("김길동"); // String은 값을 비교
        //Object(큰) --> String(작) 강제형 변환

        //제너릭을 썼을 때
        //객체 생성할 때 내가 정한 타입으로 설정할 수 있음
        //형변환 안쓰는게 더 효율이 좋음
        ArrayList<String> list2 = new ArrayList<>(); //<>무조건 써줘야함 String은 생략 가능,  //String으로 설정
        list2.add("김길동");
        System.out.println(list2.get(0).charAt(0));

        ArrayList<Integer> list3 = new ArrayList<>(); //Integer로 설정 (int로 박싱/언박싱도 가능)
        list3.add(1); //Integer <--오토박싱-- int
        System.out.println(list3.get(0)+1);  //출력 -> 2
    }
}
