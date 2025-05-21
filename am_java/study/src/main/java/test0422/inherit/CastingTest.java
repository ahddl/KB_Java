package main.java.test0422.inherit;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class CastingTest {
    public static void main(String[] args) {
        //casting (캐스팅, 던지다) -> 그 역할로 던져지다
        //byte b -100;
        //int a = b; -> 형변환(캐스팅)

        //다형성 -> 자바의 특징
        //하나의 이름으로 여러가지 형태를 사용할 수 있다
        //add(), add(int x), add(int x, int y)
        //<-> 오버라이딩 (override, overwrite, 덮어씀, 재정의)
        //상속 부모 클래스 (run() {구현내용}) <- 자식클래스(run() {구현내용 재정의})

        //많은 양의 데이터를 모으고 싶음 (가변)
        //다양한 데이터 타입을 모으고 싶음
        //배열 - 고정길이, 같은 데이터 타입을 모을 때 사용
        //부품 - 종류가 엄청 많음, 배열은 순서를 가지고 있음(인덱스)
        // -> 리스트: 순서를 가지면서 여러개 모아놓은 것
        // -> 리스트 부품이 되려면 필요한 기능 정의
        //1) add, 2) remove, 3) get(인덱스) 정의
        //-> 인터페이스 List.java
        //-> 인터페이스에 정의된 기능을 그대로 클래스로 만들어 놓았음 ArrayList, LinkedList, ...

        //같은 패키지내에 있는 것은 new 해서 사용할 수 있음
        //다른 패키지에 있으면 위치를 아렬주어야한다
        List list = new ArrayList(); //가변길이, 다양한 타입을 넣을 수 있음.
        //왼쪽이 더 큰 변수; List list -> List 인터페이스에 써넣은대로 구현한 클래스는 다 집어넣을 수 있음
        //자동형변환
        //불가능 ArrayList list2 = new LinkedList(); //형제관계에서는 대입 불가능
         list.add("ABC"); //Object은 클래스다이어그램에서 최상위에 위치, 개념적으로 제일 크다!
        //Object 타입의 변수에는 모든 타입의 데이터를 다 집어 넣을 수 있다.
        list.add(new Random()); //Object <- Random 자동형변환
        list.add(new int[3]); //Object <- int[]
        list.add(new String("김국민")); //Object <- String

        //형변환 -> 변수와 관련있는단어!
        //자바에서는 다른 타입의 변수에 넣을 때 타입이 변환되어 들어감 (형변환)
        list.add(100); //Object <- Integer <- (오토박싱, 클래스로 바뀜)<- int
        // 변수 언제 쓰나?
        //1) "클래스의 필드" 2) "매개변수"를 쓸 때 형변환을 많이 씀

        System.out.println(list);//리스트에 들어있는 값들
        //강제형 변환이 필요한가?
        //add() 할 때 Object 타입으로 자동형 변환되어 들어감
        //꺼낼 때 논 Object 타입으로 꺼내온다
        Object o = list.get(0); //list에 첫번째
        //Object 클래스는 8개의 메서드
        //ABC, toLowerCase()소문자로, chatAt() 한글자 추출
        //o.charAt(); //XXXX, Object 타입에는 String의 메서드를 호출 불가능
        //꺼내가지고 String의 메서드를 쓰고 싶은 경우에는 다시 String으로
        //변경해주어야 chatAt() 등의 메서드를 쓸 수 있다
        String s = (String)list.get(0);  //"ABC"
        System.out.println(s.charAt(0));  //한글자 추출
        System.out.println(s.toLowerCase());  //소문자 추출
    }
}