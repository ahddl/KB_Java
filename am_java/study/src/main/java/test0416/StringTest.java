package main.java.test0416;

public class StringTest {
    public static void main(String[] args){
//        //힙 영역에 값을 넣지는 않음 주소없음 의미
//        System.out.println((s0));
//
//        String s1 = "자바";
//        String s2 = "자바";
//        //한줄 복샤: ctrl + d
//
//        //주소 동일하지 체-크
//        System.out.println((s1 ==s2));
//        //참조형은 ==은 주소 비교
//
//        String s3 = new String(original:"자바");
//        System.out.println(s1 == s3);
//        //String 타입 변수(주소)가 가르키는 값이 동일하지 체크
//        System.out.println(s1.equals(s3));

        //✅ String을 기본형처럼 값을 대입하면
        //하나의 힙영역을 가리키게 된다.
        String s0 = null;
        System.out.println(s0);
        //System.out.println(s0.length());
        //s0안에 들어가있는 데이터가 null인데
        //null의 length()함수를 호출할 수 없음.
        //NullPointerException에러 발생함.

        String s1 = "자바";
        String s2 = "자바";

        //✅ 참조형 변수 주소 비교
        System.out.println(s1 == s2); //true, 주소 동일O
        String s3 = new String("자바");
        System.out.println(s1 == s3); //false, 주소 동일X
        System.out.println(s1.equals(s3)); //값 동일O

        //null
        //true
        //false
        //true
    }
}
